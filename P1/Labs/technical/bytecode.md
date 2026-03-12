The .class file contains bytecode, not normal machine code.

Before the JVM runs that bytecode, it first checks it for safety.

This check is done by something called the Bytecode Verifier.

# Why does Java need this?

crash your system

access memory illegally

steal data

So Java verifies the code before execution.

# What does the verifier check?

The JVM checks several things.

# No illegal memory access

Languages like C/C++ allow direct memory manipulation.

Example in C:

int *p = NULL;
*p = 10; // crash

Java does not allow this.

Example Java code:

    int x = 10;

You cannot do:

    write memory address 0x1234

The verifier ensures bytecode cannot break memory rules.

# Stack safety

Java bytecode uses a stack to run instructions.

# Correct data types

Java is strongly typed.

int a = 10;
String s = "hello";

This is illegal:

int a = "hello"; // compile error

But someone could manually modify the bytecode to break this rule.

The verifier checks that types always match.

Example invalid bytecode logic:

    push "hello"
    store into int variable

Verifier stops this.

# Valid instructions

Bytecode instructions must be valid JVM instructions.

Example valid instruction:

iload
iadd
invokevirtual

Invalid instructions are rejected.

# What is VerifyError?

If the verifier detects something unsafe:

The JVM throws:

    java.lang.VerifyError

# Example:

Exception in thread "main" java.lang.VerifyError

# Meaning:

"This bytecode is not safe to run."






