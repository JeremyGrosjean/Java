### FIRST tutorial - JAVA with hands

Let's go over the Hello world program, which simply prints "Hello, World!" to the screen.


```java
public class Main {
    public static void main(String[] args) {
    System.out.println("This will be printed");
    }
}
```

The first line defines a class called Main.

```java
public class Main {
}
```

In Java, every line of code that can actually run needs to be inside a class. 
This line declares a class named Main, which is public, that means that any other class can access it. 

Notice that when we declare a class, we must declare it inside a file with the same name (Main.java), otherwise we'll get an error when compiling.

The next line is:

```java
public static void main(String[] args) {`
```
This is the entry point of our Java program. the main method has to have this exact signature in order to be able to run our program.

public again means that anyone can access it.
static means that you can run this method without creating an instance of Main.
void means that this method doesn't return any value.
main is the name of the method.
The arguments we get inside the method are the arguments that we will get when running the program with parameters. It's an array of strings. 

```java
System.out.println("This will be printed");
```

_**System**_ is a pre-defined class that Java provides us and it holds some useful methods and variables.\
_**out**_ is a static variable within System that represents the output of your program (stdout).\
_**println**_ is a method of out that can be used to print a line.


### How run java with hands

Open a terminal, then go to the folder where your class is.
Then run:\
`java Main.java`
> since java 11, you can compile and run class with that one command\
> before you had to compile with "javac className.java" and then run "java className"


___

**Exercise**

1. Print "Hello, World!" to the console, using Main.class
2. Print "Hello, World!" to the console, using MainWithOtherClass.class