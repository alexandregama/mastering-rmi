# Mastering RMI

####Serialization Rules

- We need to indicate that a class is a Serializable class. We do it using Serializable word as follow:

```java
public class StockItem implements Serializable {
	
}
```

####Some Questions

- **If do I try to serialize a class without Serializable interface?**
  
  You got the error: java.io.NotSerializableException

- **Which type of objects we can't serialize?**
  
  We can't serialize transient objects
  
  We can't serialize static fields  

- **Transient variable**

  **transient** keyword can be used along with **static** keyword but is not make any sense
  
  **transient** variables are initialized with its default value
  
  **transient** is not persisted or saved when an object gets serialized

- **Which types are automatically Serializable?**

```
  Class
  ObjectStreamClass
  Null Objects
  String
  Array with Primitives types
  Enum
```  

- **What happens when we have a field that is not Serializable?**

  We get the error: java.io.NotSerializableException

The following code throws **NotSerializableException** cause Book class is not Serializable

```java
public class StockItem implements Serializable {
	
	private Book book;

}
```

```java
public class Book { //Not Serializable
	
}
```

- **Differences between Serializable and Externalizable**

  Serializable uses a default serialization by JVM
  
  Externalizable uses a custom serialization
  
  We can improve performance using Externalizable process
  
  Externalizable interface provides complete control of serialization
  
  We have **readExternal()** method and **writeExternal()** method to work in Externalizable
  
  Serializable will call all its Superclasses and Externalizable will not

##RMI Classes

####java.rmi.Remote interface

- A remote interface must at least extend, either directly or indirectly, the interface java.rmi.Remote

- A remote method declaration must include the exception java.rmi.RemoteException  (or one of its superclasses such as java.io.IOException or java.lang.Exception) 

- A remote object declared as a parameter or return value must be declared as the remote interface

- A remote interface may also extend another non-remote interface, as long as all of the methods (if any) of the extended interface satisfy the requirements of a remote method declaration.
