class profile::wordpress {
  notify { 'wordpress_test': 
    withpath => true,
    name     => "notify from wordpress",
  }
}
