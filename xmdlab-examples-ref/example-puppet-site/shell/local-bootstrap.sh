#!/bin/bash
#
# place any further command here to run after default bootstrap
# TODO: check if needed

if [ ! -f /tmp/apt-get_update.run ]
then
	apt-get clean
	mv /var/lib/apt/lists /var/lib/apt/lists_bak
	mkdir -p /var/lib/apt/lists/partial/
	sudo sed -i 's/de.archive.ubuntu.com/archive.ubuntu.com/g' /etc/apt/sources.list
	apt-get update > /tmp/apt-get_update.run
fi

#Upgrading Puppet in Vagrant Box if not 3.7.4

PUPPET_VERSION=`puppet --version`

if [ "$PUPPET_VERSION" != "3.7.4" ]
then
	apt-get install --yes lsb-release
	DISTRIB_CODENAME=$(lsb_release --codename --short)
	DEB="puppetlabs-release-${DISTRIB_CODENAME}.deb"
	DEB_PROVIDES="/etc/apt/sources.list.d/puppetlabs.list" # Assume that this file's existence means we have the Puppet Labs repo added
	
	echo "Installing latest puppet version for ubuntu ${DISTRIB_CODENAME}"
	
	if [ ! -e $DEB_PROVIDES ]
	then
	    # Print statement useful for debugging, but automated runs of this will interpret any output as an error
	    # print "Could not find $DEB_PROVIDES - fetching and installing $DEB"
	    wget -q http://apt.puppetlabs.com/$DEB
	    sudo dpkg -i $DEB
	fi
	sudo apt-get update
	sudo apt-get install --yes puppet
fi