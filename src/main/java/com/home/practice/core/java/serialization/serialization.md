# Serialization:

- used to writing the state of an object into a byte-stream. 
- used in Hibernate, RMI, JPA, EJB and JMS technologies.
- For serializing -  writeObject() method of ObjectOutputStream class
- For deserialization - readObject() method of ObjectInputStream class
- is a marker interface
- it must be implemented by class whose object needs to be persisted
- All wrapper by-default implements serializable
- All data members defined in the class must implement Serializable interface
- static data member will not be serialized
- during deserialization, static variable will return current value.
- use transient(), if you dont want to serialize any data member of class
- during deserialization, transient will return default value. (for objects it is null, for int it is 0)
- if parent has implemented Serializable, then child doesn't need to implement
- constructor of object is never called when the object is deserialized
- 

The reverse operation of serialization is called **deserialization** where byte-stream is converted into an object. The serialization and deserialization process is platform-independent, it means you can serialize an object on one platform and deserialize it on a different platform.

**SerialVersionUID:**
- used to verify the sender and receiver of the serialized object
- sender and receiver must have the same SerialVersionUID, otherwise, InvalidClassException will be thrown when you deserialize the object
- 

# **Externalizable:**

- provides the facility of writing the state of an object into a byte stream in compress format. 
- It is not a marker interface.

          public void writeExternal(ObjectOutput out) throws IOException
          public void readExternal(ObjectInput in) throws IOException