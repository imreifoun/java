# StackOverflowError

# Reason

    Occurs when the Stack memory becomes full.

This usually happens because of infinite recursion (a function calling itself without stopping)

public class Main {

    // function prototype
    // return type: void
    // argument type: int
    public static void recursive(int n) {

        System.out.println("Call: " + n);

        // recursive call
        recursive(n + 1);
    }

    public static void main(String[] args) {

        recursive(1);

    }
}

# What Happens in JVM

Each function call creates a stack frame.

# Execution:

recursive(1)
recursive(2)
recursive(3)
recursive(4)
recursive(5)
...


Eventually the stack memory limit is reached.

# JVM throws:

Exception in thread "main" java.lang.StackOverflowError

# Why This Happens

Stack memory is small but fast.

# Typical size:

~1MB per thread

So too many method calls = stack overflow.

_____________________________________________________________

# OutOfMemoryError

# Reason

Occurs when Heap memory becomes full.

Heap stores objects.


# Example Code

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<>();

        while (true) {

            list.add(new int[1000000]);

        }
    }
}


# What Happens

Every loop creates a new object:

new int[1000000]

Objects are stored in the Heap.

# Heap grows:

Heap

int[1,000,000]
int[1,000,000]
int[1,000,000]
int[1,000,000]
...

Eventually heap is full.

# JVM throws:

Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

_____________________________________________________________

| Error              | Memory Area | Cause                   |
| ------------------ | ----------- | ----------------------- |
| StackOverflowError | Stack       | too many function calls |
| OutOfMemoryError   | Heap        | too many objects        |

