# spring-security-jwt
Spring boot project which uses JWT for authorization

1.  The /authenticate endpoint is used for creating JWT tokens based on username and password in the request
2.  The /hello endpoint is used to authenticate based on the authorization header having the earlier generated JWT to authenticate and authorize the request. There is filter written to intercept each request and validate the JWT tokens passed. 
