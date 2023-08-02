
Features of Java 8:

* Stream
* Default and static methods in interface
* Functional Interface
* Lambda Expression
* Optional Class
* Method reference

### DateTime Api:

* LocalDate
* LocalTime
* LocalDateTime
* DateTimeFormatter


### Java IO Improvements:

* Files.lines
* Files.list

### Improvement to hashMap:

* Performance degrades when there are too many records in the same bucket.
* In Java 8, when the number of items goes beyond a certain threshold (more than 8 entries in a bucket), **the bucket will switch to use balanced tree instead of linked list** to store the items or entries.
* So in Java 8 in case of high hash collisions, the worst case performance will be in O(log n) time complexity. Until Java 8, the worst case time complexity was O(n) for the same situations.
* The same technique has been implemented in LinkedHashMap and ConcurrentHashMap also.
* This technique has not been implemented for HashTable and WeakHashMap.
