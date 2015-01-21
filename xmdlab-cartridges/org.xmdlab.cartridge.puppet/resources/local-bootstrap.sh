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