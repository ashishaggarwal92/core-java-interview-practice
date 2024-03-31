**Methods in Object CLass:**

* toString()
* hashCode()
* equals()
* wait()
* notify()
* notifyAll()
* clone()
* finalize()

**equals vs ==**
- both are used to compare objects
- == is an operator
- equals is a function
- == compares reference or memory location of teh objects in heap
- equals compares contents
- string literals(String s = "A") always invokes intern method

      String s1 = "A"
      String s2 = "A"
      String s3 = new String("A")
      String s4 = new String("A")
      
      s1==s2 // true
      s1.equals(s2) // true
      s1==s3 // false
      s1.equals(s3) // true
      s3.equals(s4) // true
      s3==s4 // false




- intern():
  - is a process of storing exactly one copy each distinct String value.
  - applying intern on string will make sure that all strings having the same contents share same memory location