# hibernate-sql-interceptor
A demo projects shows how to intercept sql statements before it goes to database engine to perform them and the way you can add cutoms code there

there are 2 main steps : 

1 - create a custom class and extends EmptyInterceptor class and choose any method to override it
2 - register your class with spring boot by adding this property in application.properties file : 
spring.jpa.properties.hibernate.ejb.interceptor=com.sql.interceptor.demo.interceptor.CustomSqlInterceptor
