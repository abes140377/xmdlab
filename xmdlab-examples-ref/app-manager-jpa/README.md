# Docker homebrew
	
	brew update
	brew install mongodb
	
	cd /to/app-manager
	mkdir -p data/db
	mongod --dbpath ./data/db

# Docker MongodDB

	$(boot2docker shellinit)
	docker build -t codiez/mongodb .