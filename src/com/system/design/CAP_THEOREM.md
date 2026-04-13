# CAP THEOREM MASTERCLASS


NOTES:
> * A network partition is a failure in a distributed system where network connectivity is lost between nodes, splitting them into isolated "islands" or subgroups. While nodes remain functional, they cannot communicate with others outside their segment, leading to data inconsistency or unavailability. It is a critical challenge, often termed "split-brain," addressed by the CAP theorem (Partition Tolerance). 
> * Network partition tolerance is a distributed system's ability to continue operating correctly despite a network failure that splits its nodes into isolated groups (a partition). It ensures the system remains functional, avoiding complete failure, even when messages cannot travel between all nodes. It is one of the three core guarantees of the CAP Theorem. 
> * consistency: in the context of the CAP theorem is quite different from the consistency guaranteed by ACID databases.


## Introduction
* The CAP theorem is a belief from theoretical computer science that states that in a distributed data store, in the even of network failure on a distributed database, it is possible to provide either consistency or availability—but not both.

## What is CAP Theorem?
* At its core, CAP theorem states that in a distributed system, you can only have two out of three of the following properties:
    * Consistency: All nodes see the same data at the same time. When a write is made to one node, all subsequent reads from any node will return that updated value. 
    * Availability: Every request to a non-failing node receives a response, without the guarantee that it contains the most recent version of the data. 
    * Partition Tolerance: The system continues to operate despite arbitrary message loss or failure of part of the system (i.e., network partitions between nodes).
* Here's the key insight that makes CAP theorem much simpler to reason about in interviews: In any distributed system, partition tolerance is a must. Network failures will happen, and your system needs to handle them.
  This means that in practice, CAP theorem really boils down to a single choice: Do you prioritize consistency or availability when a network partition occurs?
* https://www.hellointerview.com/learn/system-design/core-concepts/cap-theorem
* https://www.bmc.com/blogs/cap-theorem/