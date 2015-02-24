class profile::db {
  notify { 'db_test': 
	withpath => true,
	name     => "notify from db",
  }
}
