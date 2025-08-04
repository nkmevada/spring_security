#This module describe the CSRF(Cross-Site Request Forgery) protection in Spring Boot application.
CSRF also known as one-click attack.
CSRF in Spring Security refers to a type of web security vulnerability where a malicious exploit of a website or web application tricks the user's browser into performing an unwanted action where the user is currently authenticated. 

#Spring Security provides built-in protection against CSRF attacks by generating unique CSRF token for each user session which is enabled by default for modifying HTTP methods (like POST, PUT, DELETE) and verify that the request comes from a legitimate source. 

#How It Works in This Project:
1)Spring Security automatically generates a CSRF token and store it in session.
2)The token must be include in every modifying request
3)If the token is missing or incorrect, the request is blocked with 401 Unauthorized error.
