# REST MASTERCLASS

## 1. What is REST?
* REST stands for Representational State Transfer. It is an architectural style for designing networked applications. RESTful systems typically communicate over HTTP and use standard HTTP methods (GET, POST, PUT, DELETE) to perform operations on resources.
* REST is NOT:
  * a protocol
  * a library
  * a framework
  * a standard like HTTP
* REST is an architectural style: a set of design principles for building networked systems(especially web APIs) that provides guidelines for designing scalable and maintainable web services.
* It was introduced by Roy Fielding in his doctoral dissertation in 2000.

## 2. What Problems does REST Solve?
- Before REST, systems had problems like:
* Tight coupling: Clients and servers were tightly coupled, making it difficult to evolve the system independently
* Scalability issues: Systems struggled to scale effectively due to inefficient communication patterns and state management
* Lack of standardization: There was no standard way to design APIs, leading to inconsistent and
* Custom protocols: Many systems used custom protocols that were difficult to understand and maintain

- REST proposes clear rules so that:
* Clients and servers can evolve independently
* Systems can scale effectively to milions of users
* APIs can be designed in a consistent and standardized way

## 3. Core idea of REST
* REST is based on the idea of resources. A resource is any piece of information that can be named and accessed. Resources are identified by URIs (Uniform Resource Identifiers) and can be manipulated using standard HTTP methods.
* What is a resource? -> A resource can be anything that can be represented as data or object that you want to expose via an API, such as:
  * A user
  * A product
  * An order
  * A document
  * A service
  * Each resource is identified by a unique URI, which serves as its address on the web. For example, a user resource might be identified by the URI `https://api.example.com/users/123`, where `123` is the unique identifier for that user.

## 4. REST Uses HTTP - BUT REST ≠ HTTP
* REST usually uses HTTP, but REST itself is independent of HTTP
* REST can be implemented using other protocols, such as WebSockets, gRPC, or even custom protocols. The key is that REST is an architectural style that can be applied to any protocol that supports the necessary principles of statelessness, resource identification, and standard methods for manipulating resources.
* While HTTP is the most common protocol used for RESTful APIs, it is not a requirement. The principles of REST can be applied to any communication protocol that allows for the manipulation of resources in a stateless manner.
* In practice, most RESTful APIs are built using HTTP because of its widespread adoption and support for the necessary features, such as methods (GET, POST, PUT, DELETE), status codes, and headers. However, the core principles of REST can be applied to other protocols as well, making it a flexible architectural style for designing networked applications.
* HTTP fits REST perfectly because:
  * URLs identify resources
  * HTTP methods define actions on resources
  * HTTP status codes provide feedback on the outcome of operations
  * HTTP headers allow for metadata and content negotiation

## 5. REST and HTTP Methods
* REST maps operations to HTTP verbs:
  * GET: Retrieve a resource or a collection of resources       -> /uders/123
  * POST: Create a new resource                                 -> /users
  * PUT: Update an existing resource or create it if it doesn't exist   -> /users/123
  * DELETE: Remove a resource  -> /users/123
  * PATCH: Partially update a resource -> /users/123
  * OPTIONS: Describe the communication options for the target resource -> /users/123
  * HEAD: Retrieve metadata about a resource without the response body
* Key Idea: you act on resources not actions.
* Bad Examples:
  * GET /getUser?id=123
  * POST /createUser
  * PUT /updateUser?id=123
  * DELETE /deleteUser?id=123
* Good Examples:
  * GET /users/123
  * POST /users
  * PUT /users/123 

## 6. What does state transfer mean in REST?
* State transfer refers to the transfer of the state of a resource between the client and server. State here means resource state not memory.
* When a client:
  * request a resource
  * server responds with the current state of that resource, with its current representation (e.g., JSON, XML, HTML)
* The Server does not remember the client between requests. This leads to an important principle of REST: statelessness.

## 7. Statelessness in REST
* In REST, each request from a client to a server must contain all the information needed to understand and process the request. The server does not store any client context between requests. This means that each request is independent and self-contained.
* Every request is independent
* Server does not store any client client session
* All required data is send in each request
* Example:
  ```java
GET /orders/123
Authorization: Bearer <token>
    ```

* Benefits of statelessness:
  * Scalability: Servers can handle more requests because they don't need to maintain session state
  * Simplicity: The server implementation is simpler because it doesn't need to manage client state
  * Reliability: If a server goes down, the client can simply retry the request without worrying about losing session data
  * Caching: Statelessness allows for better caching of responses, improving performance

## 8. REST Architectural Constraints (CRITICAL)
- For an API to be RESTful, it must adhere to the following architectural constraints:
1. Client-Server Separation: The client and server are separate entities that interact through a well-defined interface. This allows for independent evolution of the client and server.
   * Allows independent evolution of client and server

2. Statelessness: Each request from a client to a server must contain all the information needed to understand and process the request. The server does not store any client context between requests.
    * No Server-side session
    * Every request contains full context
3. Cacheability: Responses from the server can be marked as cacheable or non-cacheable. This allows clients to cache responses and improve performance.
    * Responses can be cached to improve performance
4. Uniform Interface: The API must have a consistent and standardized interface for interacting with resources.
    * Resources are identified by URIs
    * Standard HTTP methods are used to manipulate resources
    * Standard HTTP status codes are used to indicate the outcome of operations
    * Clear resource URIs
    * consistent structure for requests and responses
5. Layered System: The architecture can be composed of multiple layers, such as load balancers, proxies, and gateways. Each layer can perform specific functions without affecting the overall system.
    * System can be composed of multiple layers (e.g., load balancers, proxies)
    * Client doesnt know: If it talks to cache, load balancer, or the actual server
    * This enables:
      * CDNs
      * Load Balancing
      * API Gateways
6. Code on Demand (optional): The server can provide executable code to the client, allowing for dynamic behavior. This is an optional constraint and is not commonly used in RESTful APIs.
    * Server can provide executable code to the client (e.g., JavaScript) Rare, Optional

## 9. What is RESTful?
* RESTful follows REST principles.
  * A RESTful API correctly implements the REST rules
  * A RESTful service exposes resources via standard HTTP methods and URIs
  * A RESTful API is stateless, cacheable, and has a uniform interface
* REST is the idea
* RESTful is the implementation of that idea

## 10. What is RESTful Architecture?
* An architecture where:
  * Communiocation follows REST principles
  * Services expose RESOURCES via RESTful APIs
  * System is scalable, stateless, cache-friendly
  * Example

```
Client
↓
CDN
↓
Load Balancer
↓
REST API Server
↓
Database
```
* This architecture:
  * Scales horizontally
  * Is fault tolerant
  * Is Web-friendly


---

# What is an API?
* API stands for Application Programming Interface.
* At its core: An API is a contract between two software components that defines how they can interact with each other.
* It is a set of rules and protocols that allows different software applications to communicate with each other. An API defines how requests should be made, what data formats should be used, and how responses will be structured.
* It specifies:
  * What requests you can make
  * How to make them
  * What responses you can expect
* It is the interface/boundary, not an implementation. It is the "what" not the "how". It is a contract, not a code.

* Formal Definition: An API defines a set of rules and specifications that allows one software program to interface with another.
* These rules include:
  * The endpoints (URIs) that can be accessed
  * The HTTP methods (GET, POST, PUT, DELETE) that can be used
  * The data formats (JSON, XML) for requests and responses
  * The authentication and authorization mechanisms
  * The expected status codes and error handling

## Why do APIs Exist?
* Without API?
  * Applications would be tightly coupled, making it difficult to evolve and maintain them independently
  * Changing one system would require changes to all other systems that interact with it, leading to a fragile and unmaintainable architecture
  * Reuse would be difficult
* With APIs: 
  * Systems can evolve independently as long as they adhere to the API contract
  * Scaling is possible because systems can be developed and deployed independently
  * Integration is easier because there is a clear contract for how systems should interact