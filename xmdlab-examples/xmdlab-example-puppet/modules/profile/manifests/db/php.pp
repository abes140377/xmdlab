class profile::db::php {
  notify { 'db::php_test': 
	withpath => true,
	name     => "notify from db::php",
  }
}
