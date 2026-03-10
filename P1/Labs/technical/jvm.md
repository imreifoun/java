# JVM (Java Virtual Machine)

The JVM is the engine that runs Java programs.

Java code does not run directly on the operating system.
Instead it runs inside the JVM.

# How it works

Java code (.java)
        ↓
Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM executes it

# Flow:

Hello.java
   ↓
javac Hello.java
   ↓
Hello.class (bytecode)
   ↓
JVM runs it

__________________________________________________________

# Why JVM exists

The JVM makes Java platform independent.

Write once → run anywhere

# Because:

    Windows has a JVM

    Linux has a JVM

    macOS has a JVM

Your .class file runs on any OS with a JVM.

__________________________________________________________

# Main responsibilities of JVM

    Execute bytecode

    Memory management

    Garbage collection

    Security

    Thread management