## Wrapper Classes in Java
### Boxing
Boxing is the process of converting a primitive type 
(like int, char, etc.) into its corresponding wrapper class
(like Integer, Character, etc.). This is useful when you need 
to treat a primitive as an object.

```Boxing Example
int num = 5;
Integer boxedNum = Integer.valueOf(num); // Boxing
```

### UnBoxing
Unboxing is the reverse process: 
converting a wrapper class back to its corresponding
primitive type. This allows you to use the object like 
a regular primitive.

``` UnBoxing Example
Integer boxedNum = 10;
int num = boxedNum.intValue(); // Unboxing
```

### Autoboxing
Autoboxing is when Java automatically converts
a primitive type to its corresponding wrapper class
without needing you to call the conversion explicitly.

```java
int num = 20;
Integer boxedNum = num; // Autoboxing happens automatically
```
### Autounboxing
Autounboxing is when Java automatically converts a wrapper class back to its corresponding primitive type without needing an explicit method call.

```java
Integer boxedNum = 30;
int num = boxedNum; // Autounboxing happens automatically
```


### Summary of Boxing and Unboxing

| Term           | Description                                   |
|----------------|-----------------------------------------------|
| Boxing         | Primitive → Wrapper Class                     |
| Unboxing       | Wrapper Class → Primitive                     |
| Autoboxing     | Automatic Boxing                              |
| Autounboxing   | Automatic Unboxing                            |


