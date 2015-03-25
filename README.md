# springJdoSample
Sample for spring 4 and JDO database acces with webservices and static content

### Database connection
* database: springJdoSample
* user: test
* password: test

### First create table
```
mvn datanucleus:schema-create
```

### Run in development
```
mvn spring-boot:run
```

### Package for production
```
mvn package spring-boot:repackage
```

### Sample xml for Jetty server
```
<?xml version="1.0"  encoding="ISO-8859-1"?>
<!DOCTYPE Configure PUBLIC "-//Jetty//Configure//EN" "http://www.eclipse.org/jetty/configure.dtd">
<Configure class="org.eclipse.jetty.webapp.WebAppContext">
<Set name="contextPath">/patata</Set>
<Set name="war"><SystemProperty name="jetty.base" default="."/>/webapps/patata.war</Set>
<Call name="setProperty" class="java.lang.System">
    <Arg type="String">dnFile</Arg>
    <Arg type="String">PATH TO DATANUCLEUS PROPERTIES FILE</Arg>
</Call>

<Set name="extractWAR">true</Set>
  <Set name="copyWebDir">false</Set>
  <Set name="defaultsDescriptor"><SystemProperty name="jetty.home" default="."/>/etc/webdefault.xml</Set>
</Configure>
```
