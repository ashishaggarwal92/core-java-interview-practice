
**In how many ways we can create object**

1) New
2) clone
3) Reflection - CLass.forName()
4) Deserialization


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


