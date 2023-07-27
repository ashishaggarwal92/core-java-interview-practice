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


