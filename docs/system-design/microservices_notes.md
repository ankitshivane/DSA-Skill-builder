* [API_GATE](https://konghq.com/blog/learning-center/why-microservices-need-api-gateway)
* API gateway provides single entry point
* it helps in routing: forward requests to right microservices
    * CASE-B: Here lets say we have 10 different client consuming order service and in future order service got merge to sales
      service, now as the url endpoint of order service has changed all the 10 different client has to do changes in
      their service. not a good design. here along with Routing api gateway can help in here we can introduce a
      intermediary api gateway and in single entry only we can update order service new endpoint and client will not be
      harm
    *
* it helps in load balancing
* it has capability to do authentication, so no need to do authentication in each separate microservice only API-gateway
  will handle it, so code duplicacy will be avoided
* Rate limiting
* Resiliency (retry, circuit breaker etc)
* request response transformation
* monitoring and logging