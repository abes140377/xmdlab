/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.templates.TemplateTpl
 */
package org.xmdlab.cartridge.puppet.templates

import org.xmdlab.cartridge.puppet.metafacade.*

class VagrantfileTpl extends VagrantfileTplBase {
	
	override doGenerate(NodeMetafacade nodeMetafacade) '''
	#
	# Single box with some custom options defined in variables.
	#
	hostname      = 'femo'
	domain        = 'test.de'
	vmBox         = "teamserver-precise64"
	#vmBoxUrl      = "http://dzstuv193.dzbw.de/boxes/teamserver-precise64.box"
	# to run this vagrant box on windows replace eth0 with the windows host interface name
	bridge        = "en1: WLAN (AirPort)"
	
	## DO NOT EDIT AFTER THIS LINE ##
	
	# download bootstrap script and store content to variable
	#bootstrapInline = Net::HTTP.start("github.com", "80").get("/abes140377/vagrant-bootstrap/raw/master/bootstrap.sh").body
	
	# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
	VAGRANTFILE_API_VERSION = "2"
	
	Vagrant.configure('2') do |config|
		config.vm.box = "precise32"
		config.vm.box_url = "http://files.vagrantup.com/precise32.box"
		config.vm.hostname = 'wordpress.example.com'
		config.vm.network :forwarded_port, guest: 80, host: 8080
		config.vm.provision :shell, :inline => 'apt-get update'
		config.vm.provision :puppet do |puppet|
			puppet.manifests_path = "manifests"
			puppet.manifest_file  = "site.pp"
			puppet.module_path    = "modules"
		end
		config.vm.provision :shell, :inline => 'echo Visit http://localhost:8080/blog to configure wordpress'
	end
	
	'''
}
