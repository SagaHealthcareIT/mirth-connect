@ECHO OFF
SET CLASSPATH=mirth-0.2.1a.jar
SET CLASSPATH=%CLASSPATH%;mule-1.2.jar

SET CLASSPATH=%CLASSPATH%;lib\ant.jar
SET CLASSPATH=%CLASSPATH%;lib\activation-1.0.2.jar
SET CLASSPATH=%CLASSPATH%;lib\activeio-2.1.jar
SET CLASSPATH=%CLASSPATH%;lib\backport-util-concurrent-2.0_01_pd.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-beanutils-1.6.1.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-codec-1.3.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-collections-3.1.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-dbcp-1.2.1.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-dbutils-1.0.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-digester-1.5.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-discovery-0.2-dev.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-el.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-httpclient-3.0-rc4.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-jxpath-1.2.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-logging-1.0.4.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-logging.jar
SET CLASSPATH=%CLASSPATH%;lib\commons-pool-1.1.jar
SET CLASSPATH=%CLASSPATH%;lib\concurrent-1.3.4.jar
SET CLASSPATH=%CLASSPATH%;lib\dom4j-1.4.jar
SET CLASSPATH=%CLASSPATH%;lib\geronimo-spec-ejb-2.1-rc4.jar
SET CLASSPATH=%CLASSPATH%;lib\geronimo-spec-j2ee-connector-1.5-rc4.jar
SET CLASSPATH=%CLASSPATH%;lib\geronimo-spec-j2ee-management-1.0-rc4.jar
SET CLASSPATH=%CLASSPATH%;lib\geronimo-spec-jms-1.1-rc4.jar
SET CLASSPATH=%CLASSPATH%;lib\geronimo-spec-jta-1.0.1B-rc4.jar
SET CLASSPATH=%CLASSPATH%;lib\geronimo-spec-servlet-2.4-rc4.jar
SET CLASSPATH=%CLASSPATH%;lib\hapi-0.4.3.jar
SET CLASSPATH=%CLASSPATH%;lib\hsqldb.jar
SET CLASSPATH=%CLASSPATH%;lib\jasper-compiler.jar
SET CLASSPATH=%CLASSPATH%;lib\jasper-runtime.jar
SET CLASSPATH=%CLASSPATH%;lib\javax.servlet.jar
SET CLASSPATH=%CLASSPATH%;lib\jaxb-api.jar
SET CLASSPATH=%CLASSPATH%;lib\jaxb-impl.jar
SET CLASSPATH=%CLASSPATH%;lib\jaxb-libs.jar
SET CLASSPATH=%CLASSPATH%;lib\jaxb-xjc.jar
SET CLASSPATH=%CLASSPATH%;lib\jaxen-full.jar
SET CLASSPATH=%CLASSPATH%;lib\jaxrpc-1.1.jar
SET CLASSPATH=%CLASSPATH%;lib\jaxrpc-qname-patch-1.1.jar
SET CLASSPATH=%CLASSPATH%;lib\jdom.jar
SET CLASSPATH=%CLASSPATH%;lib\js.jar
SET CLASSPATH=%CLASSPATH%;lib\jsr223-1.0.jar
SET CLASSPATH=%CLASSPATH%;lib\jug-1.0.3.jar
SET CLASSPATH=%CLASSPATH%;lib\junit-addons-1.4.jar
SET CLASSPATH=%CLASSPATH%;lib\log4j-1.2.8.jar
SET CLASSPATH=%CLASSPATH%;lib\mail.jar
SET CLASSPATH=%CLASSPATH%;lib\org.mortbay.jetty.jar
SET CLASSPATH=%CLASSPATH%;lib\org.mortbay.jmx.jar
SET CLASSPATH=%CLASSPATH%;lib\relaxngDatatype.jar
SET CLASSPATH=%CLASSPATH%;lib\saxpath.jar
SET CLASSPATH=%CLASSPATH%;lib\stax-api-1.0.jar
SET CLASSPATH=%CLASSPATH%;lib\xbean.jar
SET CLASSPATH=%CLASSPATH%;lib\xercesImpl.jar
SET CLASSPATH=%CLASSPATH%;lib\xmlParserAPIs.jar
SET CLASSPATH=%CLASSPATH%;lib\xpp3-1.1.3.4d_b4_min.jar
SET CLASSPATH=%CLASSPATH%;lib\xsdlib.jar
SET CLASSPATH=%CLASSPATH%;lib\xstream-1.1.2.jar

SET CLASSPATH=%CLASSPATH%;lib\dbdrivers\jtds-1.2.jar
SET CLASSPATH=%CLASSPATH%;lib\dbdrivers\mysql-connector-java-3.1.12-bin.jar
SET CLASSPATH=%CLASSPATH%;lib\dbdrivers\postgresql-8.1-405.jdbc3.jar
SET CLASSPATH=%CLASSPATH%;lib\dbdrivers\ojdbc14.jar

SET CLASSPATH=%CLASSPATH%;"%JAVA_HOME%"\lib\tools.jar
SET CLASSPATH=%CLASSPATH%;configuration\
java -classpath %CLASSPATH% com.webreach.mirth.Mirth