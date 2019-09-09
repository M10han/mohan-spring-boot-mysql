This is a Spring-boot web app with JPA, MySQL.

What you'll need:
-> JDK 8+
-> Maven 3+
-> Springboot
-> MySQL

Step wise procedure:
-> Add the project dependencies to pom.xml (in this case Spring-web-starter, Thymeleaf, MySql connector)

-> We are building a simple Spring MVC web application using Thymeleaf as a view.

-> Configure MySQL database.

-> Insert a SQL script (data.sql).

-> Define Controller Template (Controller maps http requests with view)
	-> @RequestMapping maps "/" to home() method.
	-> Model object passes value to home view(index.html).

-> Define Thymeleaf View Template.

-> Run the project as a Spring boot App

-> Your web app will be accessible at "http://localhost:8080/"
