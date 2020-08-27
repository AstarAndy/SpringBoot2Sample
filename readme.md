# SpringStarter2

## Description
This project is a simple Spring-Boot2 app (version 2.3.1.RELEASE) and is intended to demonstrate various aspects of Spring Boot.  This is to
include some key concepts:
1. TDD
2. TDD **without** loading the Spring-Context
3. Unit, not integration, testing


# Warning

This project makes use of Spring Profiles to set various property file / runtime values.  You **must** specify an active profile
or the default profile will be set to **prod**

You can do this by
1. If you are running from the command-line add **--Dspring.profiles.active=test (or local)**
2. In Eclipse or Intellj add **-Dspring.profiles.active=test (or local)** into your run config

## Error when customizig RestTemplate for timeouts

The following error happened during application startup due to a `@Configuration` item that customizes te `RestTemplate` bean.  It looks like
```java
Factory method 'restTemplate' threw exception; nested exception is java.lang.NoClassDefFoundError: org/apache/http/impl/client/HttpClients
```
As it turns out a dependency for HttpClient classes must be added to the POM manually to deal with this.
```xml
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
    <version>4.5.2</version>
</dependency>
```
This takes care of the class-not-found issue.
