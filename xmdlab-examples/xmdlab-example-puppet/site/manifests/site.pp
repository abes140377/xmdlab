node appserver {
	include role::jboss8
}

node bloghost {
	include role::blog
}

