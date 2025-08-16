JDBC Authentication

->is the process of authenticating users by retrieving their credentials from a relational database using JDBC (Java Database connectivity).

->Instead of storing details in-memory or in flat files, this approach leverages a database to manage user interface.

->Spring Security’s JdbcDaoImpl implements UserDetailsService to provide support for username-and-password-based authentication that is retrieved by using JDBC. JdbcUserDetailsManager extends JdbcDaoImpl to provide management of UserDetails through the UserDetailsManager interface. UserDetails-based authentication is used by Spring Security when it is configured to accept a username/password for authentication.

->UserDetailsService is used by DaoAuthenticationProvider for retrieving a username, a password, and other attributes for authenticating with a username and password. Spring Security provides in-memory, JDBC, and caching implementations of UserDetailsService.

->DaoAuthenticationProvider is an AuthenticationProvider implementation that uses a UserDetailsService and PasswordEncoder to authenticate a username and password.


To work with JDBC Authentication Provider follow the below steps:
(1)Add dependency of JPA and MySql
(2)Add Datasource Url, Username, Password in application.properties
(3)Create our own Authentication Provider that validates user and password which is DaoAuthentication Provider
(4)Create our own UserDetailsService class which is verifying user
(5)Create our own UserDetails class