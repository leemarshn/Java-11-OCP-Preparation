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

### Interfaces

* By default methods in interfaces are marked public and abstract
* they contain concrete methods ONLY if they are either default, or private, or static

 `private int comparedPeriod(Period p){ return comparePeriod(p) }_`
        
   * they contain constants, not variables
   * they solve multiple inheritance problem
   
* Default methods can only be defined in interfaces
* A class must override default interface method only if it conflicts with another default method
* All methods in interfaces are public, while implementing the methods, the methods must be public

##### Functional Interface
* an interface that defines a single abstract operation (function)

##### Generics
* the order of parameter matters, the class has to come at the beginning
`public class Cage<E extends Animal & Eat & Run> {
`
* It allows variables and methods to operate on objects of various types while providing compile time safety
* Compiler checks that type assigned, or passed as parameter corresponds to the generic type declaration, rejecting code that attempts to use types that don't match
* can be used in classes or interfaces
* type-maker or tag interface: an interface that does not have to define any methods eg cloneable: this interface indicate a permission that an object can be cloned

* no static member can use parameter type e.g. `static T obj`
* no static method can use a type parameter e.g. `static T getObj(){}`
* you cannot instantiate an array of type parameter e.g. `vals = new T[];`//	`Gen<Integer>	gens[]	=	new	Gen<Integer>[10];	//	Wrong!
`

### Collection

* Collections are always of object type. you cannot use primitives
* set updates values
* you cannot jump index positions while adding elements

### ArrayList
`ArrayList(	)`
`ArrayList(Collection<?	extends	E>	c)`
`ArrayList(int	capacity)`

##### HashSet

* Load factor - default = 0.75 a measure of how full the has table is allowed to get before its capacity is automatically increased
`Set <Product> p2 = new HashSet<2, 0.85>()`
* where 2 is the capacity &0.85 is the load factor
* add method returns boolean value ... if you try to add to unique elements the second one won't be added

##### Deque

* pollFirst() get element and remove from the deque
* peekFirst() get first element and not remove it
* offerLast() add element to the poll
* peekLast()
* offerFirst()

You cannot offerFats or Last a null value

##### HasMap

* KeyValue pair

`Product p1 - new Food("Cake);
Map <Product, Integer> items = new HashMap<>();
items.put(p1, Integer,valueOf(2))`