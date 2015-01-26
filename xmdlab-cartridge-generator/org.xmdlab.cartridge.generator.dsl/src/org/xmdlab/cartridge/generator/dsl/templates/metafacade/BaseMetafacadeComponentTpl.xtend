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

		import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2
		import com.google.inject.Injector
		import org.eclipse.emf.mwe.core.WorkflowContext
		import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
		import org.eclipse.emf.mwe.core.issues.Issues
		import java.util.ArrayList
		import org.xmdlab.dsl.«dslCartridge.name».«dslCartridge.name»Dsl.DslModel
		import org.eclipse.core.internal.resources.Resource
		import com.google.common.collect.Iterables
		import org.eclipse.xtext.ISetup
		
		class BaseMetafacadeComponent extends AbstractWorkflowComponent2 {
			
			var Injector injector;
			var String slot;
			
			override void preInvoke() {
				if (injector == null)
					throw new IllegalStateException(
							"no Injector has been configured. Use 'register' with an ISetup or 'injector' directly.")
			}
			
			override void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
					Issues issues) {
				val ArrayList slotContent = ctx.get(slot) as ArrayList;
				if (slotContent == null) {
					issues.addError(String.format("Slot %s is empty", slot));
					return;
				}
				
		//		var PuppetModel puppetModel = null;
		//		for (Resource r : Iterables::filter(slotContent, XtextResource) as Resource) {
		//			// load PuppetModel from ecore resource
		//			puppetModel = (PuppetModel) r.getContents().get(0);
		//		}
		//		if (puppetModel == null) {
		//			issues.addError(String.format(
		//					"Unable to load DslModel from resource", slot));
		//			return;
		//		}
		//
		//		SiteMetafacade siteMetafacade = injector.getInstance(SiteMetafacade.class);
		//		System.out.println(siteMetafacade);
			}
		
			/**
			 * registering an {@link ISetup}, which causes the execution of {@link ISetup#createInjectorAndDoEMFRegistration()}
			 * the resulting {@link com.google.inject.Inject} is stored and used to obtain the used {@link IGenerator}. 
			 */
			def void setRegister(ISetup setup) {
				injector = setup.createInjectorAndDoEMFRegistration();
			}
			
			def void setSlot(String slot) {
				this.slot = slot;
			}
		}
			'''
		}