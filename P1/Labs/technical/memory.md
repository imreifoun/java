# JVM memory model

To understand the JVM memory model, we will use a live Java program and see what happens in each memory area:

Heap
Stack
Metaspace (Method Area)
PC Register
Native Method Stack

# EXAMPLE :

class Person {

    // static variable → stored in Metaspace (class area)
    static String species = "Human";

    // instance variables → stored in Heap
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method prototype
    // return type: void
    // arguments: int years
    void grow(int years) {
        age = age + years;
    }
}

public class Main {

    // function prototype
    // return type: int
    // arguments: int a, int b
    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        int sum = add(x, y);

        Person p1 = new Person("Alice", 25);

        p1.grow(5);

        System.out.println(sum);
        System.out.println(p1.name + " " + p1.age);
    }
}

What Happens When JVM Runs This

# Execution command:

javac Main.java
java Main

# Step-by-step:

    Main.java
    ↓
    javac
    ↓
    Main.class + Person.class
    ↓
    JVM loads classes
    ↓
    Memory areas created

# JVM MEMORY

┌──────────────────────────────┐
│        Metaspace             │
│ class metadata               │
│ static variables             │
└──────────────────────────────┘

┌──────────────────────────────┐
│            Heap              │
│ objects (new Person())       │
└──────────────────────────────┘

┌──────────────────────────────┐
│            Stack             │
│ method calls + local vars    │
└──────────────────────────────┘


# Metaspace (Method Area)

When the JVM loads classes:

Person.class
Main.class

# Stored in Metaspace:

Class: Person
Methods: grow()
Fields: name, age
Static: species

# Why?

Because this information must exist once for the entire program.

# Stack Memory (Function Calls)

When the program starts:

main()

A stack frame is created.

STACK

main()
x = 5
y = 10
sum
p1 (reference)

# When this line executes:

int sum = add(x, y);

Another stack frame appears.

STACK

add(a=5, b=10)
result=15

main()
x=5
y=10
sum
p1

# After add() returns:

STACK

main()
x=5
y=10
sum=15
p1


# Why stack?

Because method calls must be fast and temporary.

______________________________________________________________________

# Heap Memory (Objects)

When this line runs:

Person p1 = new Person("Alice", 25);

Two things happen.

# Stack

    p1 → reference

# Heap

    Person Object

    name = "Alice"
    age = 25

# Diagram:

STACK               HEAP

p1 ─────────────→  Person
                    name="Alice"
                    age=25


# Why heap?

Objects must exist after functions return.

If objects were on the stack, they would disappear.

______________________________________________________________________

# Method Call Example

When this runs:

p1.grow(5);

Stack becomes:

STACK

    grow(years=5)
    this → Person object

    main()
    x
    y
    sum
    p1


# Inside grow:

    age = age + years;

# Heap changes:

    Person
    name="Alice"
    age=30

______________________________________________________________________

# PC Register

Each thread has a Program Counter register.

# It stores:

which instruction is currently executing

# Example:

line 28 → executing
line 29 → next

# This allows multithreading.

______________________________________________________________________

# Native Method Stack

Used when Java calls native code (C/C++).

# Example:

System.currentTimeMillis();

Internally this calls native OS code.

Those calls run in the Native Method Stack.

______________________________________________________________________

# Why JVM Uses This Architecture

| Memory       | Reason              |
| ------------ | ------------------- |
| Stack        | fast function calls |
| Heap         | persistent objects  |
| Metaspace    | class definitions   |
| PC Register  | thread control      |
| Native Stack | OS interaction      |







