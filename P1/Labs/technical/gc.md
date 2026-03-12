# Garbage Collection Example

Person p1 = new Person("Alice", 25);
p1 = null;

Now the heap object has no references.

# Heap:

Person(name="Alice", age=25) → unreachable

Garbage collector removes it.

# Reason:

free memory automatically
prevent memory leaks

JVM START

Metaspace
 ├── Person class metadata
 └── Main class metadata

Heap
 └── Person("Alice",30)

Stack
 └── main()
      x=5
      y=10
      sum=15
      p1 → Person

