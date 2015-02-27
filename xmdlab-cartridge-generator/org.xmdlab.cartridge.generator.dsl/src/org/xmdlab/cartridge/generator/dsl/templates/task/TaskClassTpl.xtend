package org.xmdlab.cartridge.generator.dsl.templates.task

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import static org.xmdlab.util.StringHelper.*
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTask

class TaskClassTpl {
	
	@Inject extension GeneratorProperties generatorProperties
	
	def generate(DslTask dslTask) '''
		«getGeneratedComment(class.name)»
		package «basePackage».task
		
		import org.xmdlab.cartridge.common.task.Task
		
		/**
		*
		*/
		public class «dslTask.name.toFirstUpper»Task implements Task {
			
			override run() {
				throw new UnsupportedOperationException("TODO: Implement «dslTask.name.toFirstUpper».run()")
			}
		}
	'''
}