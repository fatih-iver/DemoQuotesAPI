# DemoQuotesAPI

A demo project for demonstrating how to implement logging aspect with Spring AOP.

This logging aspect will log method parameters and method's return value and exception message if any occurred.

You can find more information in this [post](https://medium.com/@fiver6/writing-a-logging-aspect-with-spring-aop-ed83e2f4228).

## Run

```
mvn spring-boot:run
```

## Test

```
curl http://localhost:8080/quotes/1
```

## License
[Apache-2.0](https://www.apache.org/licenses/LICENSE-2.0)
