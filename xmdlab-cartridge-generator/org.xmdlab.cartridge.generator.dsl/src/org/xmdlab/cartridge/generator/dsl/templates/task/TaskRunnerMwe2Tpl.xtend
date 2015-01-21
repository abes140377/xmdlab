package org.xmdlab.cartridge.generator.dsl.templates.task	

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.util.StringHelper
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTask

class TaskRunnerMwe2Tpl {
	
	@Inject extension GeneratorProperties generatorProperties
//	@Inject extension ModelHelper modelHelper
	
	def generate(DslTask dslTask) '''
		«StringHelper.getGeneratedComment(class.name)»
		module «basePackage».task.«dslTask.name.toFirstUpper»TaskRunner
		/**
		*
		*/
		Workflow {
			component = «basePackage».task.«dslTask.name.toFirstUpper»Task {}
		}
	'''
}