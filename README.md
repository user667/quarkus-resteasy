# code-with-quarkus reproducer

This project uses Quarkus, the Supersonic Subatomic Java Framework.

It is set up to show that requests to a RestEasy endpoint will only work, if absolute paths are used. Using an absolute URI will result in a 404.

Failing example:
```http request
GET http://localhost:8081/hello/g HTTP/1.1
Accept: */*
Host: localhost:8081
```

Working example:
```http request
GET /hello/g HTTP/1.1
Accept: */*
Host: localhost:8081
```
