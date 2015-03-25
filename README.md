# springJdoSample
Sample for spring 4 and JDO database acces with webservices and static content

### Database connection
database: springJdoSample

user: test

password: test

### First create table
mvn datanucleus:schema-create

### Run in development
mvn spring-boot:run

### Package for production
mvn package spring-boot:repackage
