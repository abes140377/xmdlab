package org.xmdlab.cartridge.common.workflow

import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import org.eclipse.emf.mwe.core.issues.Issues

class WelcomeMessage extends AbstractWorkflowComponent2 {
	
	var String cartridge
	
	override protected invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		val message = '''
# ======================================================================================
# __   __              _ _       _        _____                           _             
# \ \ / /             | | |     | |      / ____|                         | |            
#  \ V / _ __ ___   __| | | __ _| |__   | |  __  ___ _ __   ___ _ __ __ _| |_ ___  _ __ 
#   > < | '_ ` _ \ / _` | |/ _` | '_ \  | | |_ |/ _ \ '_ \ / _ \ '__/ _` | __/ _ \| '__|
#  / . \| | | | | | (_| | | (_| | |_) | | |__| |  __/ | | |  __/ | | (_| | || (_) | |   
# /_/ \_\_| |_| |_|\__,_|_|\__,_|_.__/   \_____|\___|_| |_|\___|_|  \__,_|\__\___/|_|   
# 
# Running «cartridge»
# ======================================================================================
	'''
	
	println(message)
	}
	
	def setCartridge(String cartridge) {
		this.cartridge = cartridge
	}
}