# SpringStarter2

## Description
	This project is a simple Spring-Boot2 app (version 2.3.1.RELEASE) and is intended to demonstrate various aspects of Spring Boot


# Warning

This project makes use of Spring Profiles to set various property file / runtime values.  You **must** specify an active profile
or the default profile will be set to **prod**

You can do this by
1. If you are running from the command-line add **--Dspring.profiles.active=test (or local)**
2. In Eclipse or Intellj add **-Dspring.profiles.active=test (or local)** into your run config

