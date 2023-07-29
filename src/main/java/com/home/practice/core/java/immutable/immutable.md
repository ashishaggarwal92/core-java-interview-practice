# Immutable Classes

All the wrapper classes are immutable. String/Integer/Double

**Rules:**

* Class should be final so that child class can't override it
* Data Member should be private so that direct access is not allowed
* Data Member should be final so that value cant be changed after object creation
* Public parameterized constructor should initialize all fields performing deep copy so that data member cant be modified with an object reference
* No setter methods
* Only getter methods
* Deep copy of object should be performed in getter methods to return a copy rather than returning the actual object reference


****Why keys in HashMap are Immutable****

Immutability allows us to get the same hash code every time for a key object
Whenever the operation is performed on the same key, it should always return the same bucket location
so that single copy of key is stored in the hash map.

If the keys are not immutable then same keys can be stored on multiple hashcode in the bucket
This is because once object is created, it can also be modified by using setter method which can cause 
change in the value of existing key on the same hash code.

