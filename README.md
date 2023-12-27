# Multi-Tenant Project with Identity control
I wanted a solution where multi-tenancy is achieved by having a database per tenant and all user information (username, 
password, client Id etc) for authentication and authorization stored in a user table in the respective tenant databases.
It meant that not only did I need a multi-tenant application, but also a secure application like any other web 
application secured by Spring Security. I know how to use Spring Security to secure a web application and how to use 
Hibernate to connect to a database. After Discussing with Engineering Manager, I had put more emphasis on creating 3 things
 - Multi-Tenancy, Authentication and authorization, and test cases so I decided that all users belonging to a tenant be stored
in the tenant database and not a separate or central database. This would allow for complete data isolation for each tenant.

High level Design:

https://miro.com/app/board/uXjVN-2Bsts=/

Goal:

    Achive Application SaaS Model client wise different database.
    You can connet multiple schema with single database.
    You can connect  multiple database.

Technology and Project Structure :

    Java 11
    Spring Boot
    Spring Security
    Spring AOP
    Spring Data JPA
    Hibernate
    JWT
    MySQL, PostgreSQL
    IntliJ
