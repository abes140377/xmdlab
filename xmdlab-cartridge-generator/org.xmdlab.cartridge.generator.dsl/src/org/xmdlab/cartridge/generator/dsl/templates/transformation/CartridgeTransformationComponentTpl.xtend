package org.xmdlab.cartridge.generator.dsl.templates.transformation

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTransformation
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*
import static org.xmdlab.util.StringHelper.*

class CartridgeTransformationComponentTpl {
	
	@Inject extension GeneratorProperties generatorProperties
//	@Inject extension ModelHelper modelHelper
	
	def generate(DslTransformation dslTransformation) '''
	«getGeneratedComment(class.name)»
	package «basePackage».transformation;

	import java.util.Collection;
	
	import org.eclipse.emf.common.util.URI;
	import org.eclipse.emf.ecore.resource.Resource;
	import org.eclipse.emf.ecore.resource.ResourceSet;
	import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
	import org.eclipse.emf.mwe.core.WorkflowContext;
	import org.eclipse.emf.mwe.core.issues.Issues;
	import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
	import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
	import org.eclipse.xtext.resource.XtextResource;
	
	import com.google.common.collect.Iterables;
	
	public class «cartridgeName.toFirstUpper»CartridgeTransformationComponent extends
			AbstractWorkflowComponent2 {
	
		private String modelSlot;
		private String outputSlot;
	
		public void setModelSlot(String modelSlot) {
			this.modelSlot = modelSlot;
		}
	
		public void setOutputSlot(String outputSlot) {
			this.outputSlot = outputSlot;
		}
	
		@Override
		protected void checkConfigurationInternal(Issues issues) {
			checkRequiredConfigProperty("modelSlot", modelSlot, issues);
			checkRequiredConfigProperty("outputSlot", outputSlot, issues);
		}
	
		@Override
		protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
				Issues issues) {
			Collection<?> slotContent = (Collection<?>) ctx.get(modelSlot);
			if (slotContent == null) {
				issues.addError(String.format("Slot %s is empty", modelSlot));
				return;
			}
	
			«dslTransformation.input» dslModel = null;
			for (Resource r : Iterables.filter(slotContent, XtextResource.class)) {
				// load model from ecore resource
				dslModel = («dslTransformation.input») r
						.getContents().get(0);
			}
	
			// check model is loaded
			if (dslModel == null) {
				throw new RuntimeException(
						"Unable to load domainmodel from resource");
			}
	
			// execute the transformation
			«dslTransformation.output» transformed = new «basePackage».transformation.«cartridgeName.toFirstUpper»CartridgeTransformation()
					.transform(dslModel);
	
			// Create EMF resource
			ResourceSet rs = new ResourceSetImpl();
			Resource resource = rs
					.createResource(URI
							.createURI(«getEmfPackage(dslTransformation.output)».eNS_URI));
	
			// Add transformed metamodel to resource
			resource.getContents().add(transformed);
	
			// set result in slot
			ctx.set(outputSlot, resource);
		}
	}
	'''
}