# Gradle Build

## Default build

*	gradle clean build

	Building and running (non integration) junit tests

## Integration Tests
	
*	gradle jbossEmbeddedTest

	Running (integration) junit tests in embedded jboss server.
	
*	gradle jbossRemoteTest

	Running (integration) junit tests in remote jboss server. Jboss server must be running.
	
*	gradle glassfishEmbeddedTest

	Running (integration) junit tests in embedded glassfish server.
	
	clean war cargoDeployRemote --info --stacktrace
	
## Container specific tasks (container must be running), available on resource module

*	gradle clean war cargoDeployRemote

	Deploy to container
	
*	gradle clean war cargoUndeployRemote cargoDeployRemote

	Redeploy to container