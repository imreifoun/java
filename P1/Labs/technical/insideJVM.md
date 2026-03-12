# When you run:

java Hello

your program goes through 4 main stages inside the JVM.

1. Class Loader
2. Bytecode Verifier
3. Execution Engine
4. Memory Management (Garbage Collector)

_______________________________________________________________________

# Class Loader

The Class Loader loads .class files into memory.

    When you run            java Hello
    The JVM must load:      Hello.class

But also other classes used inside your program like:

java.lang.Object
java.lang.String
java.lang.System

# Class Loader hierarchy

There are 3 main class loaders:

    Bootstrap ClassLoader
            ↓
    Platform (Extension) ClassLoader
            ↓
    Application ClassLoader

# What they load

| Class Loader | Loads                             |
| ------------ | --------------------------------- |
| Bootstrap    | Core Java classes (`java.lang.*`) |
| Platform     | Java extensions                   |
| Application  | Your program classes              |

# Example:

Hello.class → Application ClassLoader
String.class → Bootstrap ClassLoader

_______________________________________________________________________

# Bytecode Verifier

Before executing code, the JVM checks that the bytecode is safe.

# Why?

    Because Java can run code downloaded from the internet.

# So JVM verifies:

    no illegal memory access
    stack safety
    correct data types
    valid instructions

# If verification fails:

java.lang.VerifyError

_______________________________________________________________________

# Execution Engine

This is where bytecode becomes machine code.
There are two ways the JVM executes code.

# 1️⃣ Interpreter

Reads bytecode line by line : bytecode → execute → next instruction

Pros:

    fast startup

Cons:

    slower execution

# JIT Compiler (Just-In-Time)

For frequently used code, JVM compiles it to native machine code.

bytecode
   ↓
JIT Compiler
   ↓
Machine code

This makes Java very fast.

Hot methods (called many times) become optimized machine code.
This is why Java can be almost as fast as C++.

_______________________________________________________________________

# Memory Management (Garbage Collector)

The JVM automatically manages memory.

Main memory areas:

Heap
Stack
Method Area

# Heap

Stores objects

Example:

    new ArrayList()
    new String()

# Stack

Stores method calls and local variables

Example:

    int x = 10;

Each thread has its own stack.


# Method Area (Metaspace)

class metadata
static variables
method bytecode

# Garbage Collector (GC)

Automatically removes unused objects.

Example:

String s = new String("hello");
s = null;

Now the object has no references, so GC removes it.

# Execution Flow

Hello.java
     ↓
javac
     ↓
Hello.class (bytecode)
     ↓
JVM STARTS
     ↓
Class Loader loads classes
     ↓
Bytecode Verifier checks safety
     ↓
Execution Engine runs code
     ↓
Garbage Collector manages memory

# Simplified JVM Pipeline

        .java
          ↓
        javac
          ↓
       .class
          ↓
     Class Loader
          ↓
   Bytecode Verifier
          ↓
    Execution Engine
   (Interpreter + JIT)
          ↓
        CPU










