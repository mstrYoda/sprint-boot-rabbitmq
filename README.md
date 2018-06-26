# sprint-boot-rabbitmq
An example usage of spring boot with rabbitmq. It includes sample consumer and publisher.

To run application you need a running rabbitmq.

Starting local rabbitmq with docker :

```
docker pull rabbitmq:3.7.3-management
docker run -d -p 5672:5672 -p 15672:15672 --name testRabbit rabbitmq:3.7.3-management
```
