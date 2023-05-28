# RabbitMQ + Spring Boot Example

## Project Structure
```text
rmq-consumer (port: 8081)
|
rmq-producer (port: 3031)
```

## Build Guide

1) Build all Docker images
    ```text
    In rmq-consumer:
        docker build -t rmq-consumer:latest .
    
    In rmq-producer:
        docker build -t rmq-producer:latest
    ```

2) Run docker-compose.yml:

```text
docker-compose up
```