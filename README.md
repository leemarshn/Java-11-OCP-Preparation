# Java-11-OCP-Preparation in 60 Days

## Basics

* -d parameter points to a path to store compilation result
* the -classpath or -cp parameters points to locations of other classes that may be required to compile your code

* to compile use - javac 

`javac -cp /prjects/classes -d  /project/classes /project/whatever.java`

* to execute use - java

`java -cp /project/classes demo.Whatever Jo John "A Name" Hello John`

* in Java 11 you can use single file source code; that means to can execute the code directly without compiling, that is not good for production

`java /project/sources/demo/Whatever.java`

##### Comments
* For comments javadoc ignores the multi-line and single-line comments
* Documentation comments ->  /** May contain html markup. descriptive tags prefixed with @sign and are used by *javadoc* tool to generate documentation

`javadoc -d <documentation path> -sourcepath <source code epath> -subpackages <>name of the root package ` 

# Java Primitives
* Java has 8 primitive types
* primitives must be initialized before use
##### whole Numbers
* byte - bits -128 to 127
* short - 16 bits -32,768 to 32,767
* int - 32 bits - -2m
* long - 64 bits

###### whole numbers can be represented into

* Binary - ob10001
* octal - 072
* Decimal - 1234
* Hex - 0x4f

##### floating point
* double - 64 bits
* float - 32 bits use *F* to distinguish from double
* you can use exponential *E* for floating points

##### boolean
* default is false
* you can use *true* or *false* to initialize boolean, those keywords should be always in lowercase

##### char
* initialized using single quote *'*
* cannot contain more than one character

#### Method Overloading

* two ``or more methods within the same class that have identical names
* must have identical return types
* Must have a different number or different types of parameters or both

* Constructors invocation is not  allowed, if one constructor calls another constructor the other constructor should not call it.

#### Enum

* Enumeration provides a fixed set of instances of a specific type
* enums are implicitly public static and final
* instances are of type enum
* you can use `static import Condition.*`
* a constructor should be added to an enum to initialize its instance variables
* the constructor must be default or private
* declaration of enum values invokes enum constructor

        `public enum Condition{
            HOT, WARM, COLD;
        }`
        
#### Java Memory Allocation

* has the stack and heap
* Stack is a memory context of a thread, storing local method variable
* Heap is a shared memory area, accessible from different methods and thread contexts
* stack only holds primitive and object references.
* Classes and objects are stored in the heap


## Inheritance
#### casting
* an object can be referenced using either specific child subclass type or generic parent superclass
* casting is required to assign parent to child reference type.
* Casting is not required to assign child to parent
* Casting is not possible between objects of type siblings

#### instanceof

* returns true or false
        
   