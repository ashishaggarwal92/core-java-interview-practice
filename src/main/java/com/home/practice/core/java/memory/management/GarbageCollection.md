# **Garbage Collection**


1) Garbage collection is the process of freeing space in the heap or the nursery for allocation of new objects. 
2) Its a module of JVM


### **Types of Activities in Java Garbage Collection:**

Two types of garbage collection activity usually happen in Java. These are:

1) Minor or incremental Garbage Collection: 
    - unreachable objects in the young generation
    - Very frequent

2) Major or Full Garbage Collection: 
   - when the objects that survived the minor garbage collection are 
     copied into the old generation or permanent generation heap memory are removed. 
   - When compared to the young generation, garbage collection happens less frequently in 
     the old generation.


# Unreachable Object:

A object is said to be unreachable when no reference is attached to it

Integer i = new Integer(4); // Line 1
i = null; // Line 2

At line 1 - new Integer will be created in Heap
After line 2 - object created in heap is unreachable hence eligible for GC.

# **Ways for requesting JVM to run Garbage Collector:**

  1) Once we make an object eligible for garbage collection, it may not destroy immediately by the garbage collector. Whenever JVM runs the Garbage Collector program, then only the object will be destroyed. But when JVM runs Garbage Collector, we can not expect.
  2) We can also request JVM to run Garbage Collector. There are two ways to do it :
     - Using System.gc() method: System class contain static method gc() for requesting JVM to run Garbage Collector.
     - Using Runtime.getRuntime().gc() method: Runtime class allows the application to interface with the JVM in which the application is running. Hence by using its gc() method, we can request JVM to run Garbage Collector.
     - There is no guarantee that any of the above two methods will run Garbage Collector.
     - The call System.gc() is effectively equivalent to the call : Runtime.getRuntime().gc()

# **Finalize():**

Garbage collector calls finalize method just before destroying the object for cleanup
It is present in Object class
If an uncaught exception is thrown by finalize(), the exception is ignored and finalization of teh object terminates 

        public void finalize() throws Exception


# GC Implementations:

JVM has five types of GC implementations:

### - Serial Garbage Collector

   1) java -XX:+UseSerialGC -jar Application.java
   2) It works with a single thread and freeze all application thread when its run
   3) Not recommended with multithreaded application 

### - Parallel Garbage Collector

   1) Default Gc of JVM from java 5 to java 8
   2) Multiple threads but it also freezes application threads when performing GC
   3) java -XX:+UseParallelGC -jar Application.java
   4) we can also specify number of threads XX:ParallelGCThreads=4 // 4 threads
   5) Other theory as well on net(Basic is added here) // from baeldung jvm-garbage-collectors


### - CMS Garbage Collector

   1) concurrent marked and sweep
   2) Deprecate from java 9
   3) java -XX:+UseParNewGC -jar Application.java


### - G1 Garbage Collector

   1) designed for multiprocessor machine with large memory space
   2) default GC for jdk 11
   3) partitions the heap into a set of equal-sized heap regions, each a contiguous range of virtual memory.
   4) java -XX:+UseG1GC -jar Application.java 
 

### - Z Garbage Collector

   1) introduced in java 11 for linux as experimental  and java 15 for windows linux as production
   2) performs all works concurrently without stopping application threads for more than 10 ms
   3) partitions teh heap
   4) java -XX:+UseZGC Application.java 