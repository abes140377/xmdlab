package org.xmdlab.cartridge.generator.dsl.templates.metafacade

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge

import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*

class BaseMetafacadeComponentTpl {
	
	@Inject extension GeneratorProperties generatorProperties
	
	def generate(DslCartridge dslCartridge) '''
		«getGeneratedComment(class.name)»
		package «basePackage».metafacade;

		import java.util.ArrayList;

		import org.eclipse.emf.ecore.resource.Resource;
		import org.eclipse.emf.mwe.core.WorkflowContext;
		import org.eclipse.emf.mwe.core.issues.Issues;
		import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
		import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
		import org.eclipse.xtext.ISetup;
		import org.eclipse.xtext.generator.IGenerator;
		import org.eclipse.xtext.resource.XtextResource;
		import org.xmdlab.dsl.puppet.puppetDsl.PuppetModel;
		
		import com.google.common.collect.Iterables;
		import com.google.inject.Injector;
		
		public class BaseMetafacadeComponent extends AbstractWorkflowComponent2 {
			
			private Injector injector;
			private String slot;
			
			@Override
			public void preInvoke() {
				if (injector == null)
					throw new IllegalStateException(
							"no Injector has been configured. Use 'register' with an ISetup or 'injector' directly.");
			}
			
			@Override
			protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
					Issues issues) {
				ArrayList<?> slotContent = (ArrayList<?>) ctx.get(slot);
				if (slotContent == null) {
					issues.addError(String.format("Slot %s is empty", slot));
					return;
				}
		
				PuppetModel puppetModel = null;
				for (Resource r : Iterables.filter(slotContent, XtextResource.class)) {
					// load PuppetModel from ecore resource
					puppetModel = (PuppetModel) r.getContents().get(0);
				}
				if (puppetModel == null) {
					issues.addError(String.format(
							"Unable to load DslModel from resource", slot));
					return;
				}
		
				System.out.println(puppetModel);
		
				«FOR metafacade : dslCartridge.metafacades»
				SiteMetafacade siteMetafacade = injector.getInstance(SiteMetafacade.class);
«««				«IF metafacade.output != null»
«««				siteMetafacade
«««				«ENDIF»
«««				System.out.println(siteMetafacade);
				«ENDFOR»
			}
			
			/**
			 * registering an {@link ISetup}, which causes the execution of {@link ISetup#createInjectorAndDoEMFRegistration()}
			 * the resulting {@link com.google.inject.Inject} is stored and used to obtain the used {@link IGenerator}. 
			 */
			public void setRegister(ISetup setup) {
				injector = setup.createInjectorAndDoEMFRegistration();
			}
			
			public void setSlot(String slot) {
				this.slot = slot;
			}
		}
	'''
}