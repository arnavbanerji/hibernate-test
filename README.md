# hibernate-test
Hibernate - Best ORM framework programmed for Java.
You dont need to worry about writing SQL queries with this framework. HB will take care of it.
ORM - is a technique to connect relational table of SQL with objects and classes in application level.

Other alternatives to ORM - toplink, ibatis, JPA

SessionFactory
1) SessionFactory is an interface. SessionFactory can be created by providing Configuration object, which will contain all DB related property details (driver details and jdbc url) pulled from either hibernate.cfg.xml file or hibernate.properties file. 
2) SessionFactory is a factory for Session objects. 
3) We can create one SessionFactory implementation per database in any application. 
4) If your application is referring to multiple databases, then you need to create one SessionFactory per database. The SessionFactory is a heavyweight object; it is usually created during application start up and kept for later use. 
5) The SessionFactory is a thread safe object and used by all the threads of an application.

Session Object
1) Unlike SessionFactory, the Session object will be created on demand. 
2) Session is a lightweight object. 
3) Session provides a physical connectivity between your application and database. 
4) The Session will be established each time your application wants do something with database. 
5) Session object will be provided by SessionFactory object.

Steps to create stand-alone hibernate project:
1) create new project.
2) Select maven as build type and archetype quickstart. proceed to select group ID and artefact ID and version.
3) specify group ID - com.arnav
4) specify artefact ID - Hib
