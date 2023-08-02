# Abstract class:

1) cannot be instantiated and can contain both abstract and non-abstract methods
2) some methods can be implemented, while others are left abstract, 
   meaning that they have no implementation and must be overridden by concrete subclasses
3) Abstract class can extends only one class and multiple interface
4) it can contain both constructors and destructors
5) abstract methods can not be private 



# Interface:
1) is a contract that specifies a set of methods that a class must implement
2) all methods in an interface are by default abstract and 
   must be implemented by any class that implements the interface
3) Interface can extends one or more other interface

## Difference Between Abstract class  and Interface
1) Inheritance: A class can inherit from only one abstract class, 
                but it can implement multiple interfaces. 
   This is because an abstract class represents a type of object, 
   while an interface represents a set of behaviors.

2) Access modifiers: Abstract classes can have access modifiers 
   such as public, protected, and private for their methods and properties, 
   while interfaces can only have public access.

3) Variables: An abstract class can have member variables, while an interface cannot.
4) Variable defined in interface are always static and final whereas in abstract clas we can have non-static and final as well.
5) We can implement interface in abstract class and also can provide the functionality of abstract methods of interface



In summary, abstract classes are used to provide a base class for 
concrete subclasses to inherit from, while interfaces are used to define 
a set of methods that a class must implement. 
Abstract classes can have implemented and abstract methods, 
while interfaces can only have abstract methods. Classes can 
inherit from only one abstract class, but can implement multiple interfaces.


### In JAVA 8 default and static methods are introduced in Interface

## **Why Interfaces Need Default Methods:**


    public interface MyInterface {
    
        // regular interface methods
        default void defaultMethod() {
            // default method implementation
        }
    }


In a typical design based on abstractions, where an interface has one or multiple implementations, if one or more methods are added to the interface, all the implementations will be forced to implement them too. Otherwise, the design will just break down.

Default interface methods are an efficient way to deal with this issue. They allow us to add new methods to an interface that are automatically available in the implementations. Therefore, we don't need to modify the implementing classes.

In this way, backward compatibility is neatly preserved without having to refactor the implementers.

**Use case 1:** 

If two interfaces have common default method and both are implemented by same class

In this case, the code simply won't compile, as there's a conflict caused by multiple interface inheritance

        public interface Alarm {
           
            default String turnAlarmOff() {
                return "Turning the alarm off.";
            }
        }

        public interface Vehicle {
        
            default String turnAlarmOff() {
                return "Turning the alarm off.";
            }
        }

        public class Car implements Vehicle, Alarm {
        
         // Code wont compile
        
        }

To solve this ambiguity, we must explicitly provide an implementation for the methods

    public class Car implements Vehicle, Alarm {
    
       @Override
       public String turnAlarmOff() {
    
       }
    
    }

## **Why Interfaces Need Static Methods:**

Since static methods don't belong to a particular object, they're not part of the API of the classes implementing the interface; therefore, they have to be called by using the interface name preceding the method name.

To understand how static methods work in interfaces, let's refactor the Vehicle interface and add a static utility method to it:

    public interface Vehicle {
    
        // regular / default interface methods
        
        static int getHorsePower(int rpm, int torque) {
            return (rpm * torque) / 5252;
        }
    }

Defining a static method within an interface is identical to defining one in a class. Moreover, a static method can be invoked within other static and default methods.

# **JAVA 7 - interface**
* Constant variables
* Abstract methods

# **JAVA 8 - Addition in interface**
* Constant variables
* Abstract methods
* Default methods
* Static methods

# **JAVA 9 - Addition in interface**
* Constant variables
* Abstract methods
* Default methods
* Static methods
* Private Method
* Private static method

These private methods will improve code re-usability inside interfaces and will provide choice to expose only our intended methods implementations to users.These methods are only accessible within that interface only and cannot be accessed or inherited from an interface to another interface or class.

Rules For using Private Methods in Interfaces

* Private method cannot be abstract
* Private method can be used only inside interface and other static and non-static interface methods.
* Private non-static methods cannot be used inside private static methods.


# **When to use abstract class and when to use interface**

Abstract Class:
When few set of functionality are common across all sub-classes
If you know partial implementation but not complete implementation



Interface:
Contact on some functionality
Is a good choice when you think API will not change




### Marker Interface:

* interface without any methods and constants 
* Built in marker interface are Cloneable/Random/Serializable

Let's take the example of the Cloneable interface. If we try to clone an object that doesn't implement this interface, the JVM throws a CloneNotSupportedException. Thus, the Cloneable marker interface is an indicator to the JVM that we can call the Object.clone() method.

In the same way, when calling the ObjectOutputStream.writeObject() method, the JVM checks if the object implements the Serializable marker interface. When this isn't the case, a NotSerializableException is thrown. Therefore, the object isn't serialized to the output stream.






