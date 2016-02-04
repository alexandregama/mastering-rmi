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

