class profile::base {
  notify { 'notify_profile_base': 
    withpath => true,
    name     => "notify from profile_base",
  }
}
