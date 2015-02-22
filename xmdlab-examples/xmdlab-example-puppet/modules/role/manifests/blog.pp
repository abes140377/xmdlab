class role::blog inherits role {
  include profile::db
  include profile::db::php
  include profile::wordpress
}

