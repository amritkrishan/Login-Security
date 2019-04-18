# Login-Security

# Project Dependency :
1. Spring Boot
2. Spring Data JPA (HSQLDB)
3. Spring Security
4. Tomcat

# Model :
1. User
2. Role

# Service :
1. UserDetailsService (security.core.userdetails.UserDetailsService) -> Used to implement login & auth functionality with Spring Security

2. SecurityService -> Used to implement current-logged in user & auto-login after registration

3. UserService -> Used for registering any new User

4. Spring Validator -> User validation while registering any new User

# Repository :
1. UserRepo -> HSQLDB operations for User entity.

2. RoleRepo -> HSQLDB operations for Role entity.
