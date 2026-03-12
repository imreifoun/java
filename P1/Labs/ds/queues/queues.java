import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

class App{
    static void showMethods(Class<?> target){
        System.out.println("\n\nMethods : \n\n");
        Method[] mtd = target.getMethods();
        for (Method m : mtd){
            System.out.println(m.getName() + " => " + m);
        }
    }
    static void showFields(Class<?> target){
        System.out.println("\n\nFields : \n\n");
        Field[] fld = target.getDeclaredFields();
        for (Field f : fld){
            System.out.println(f.getName() + " => " + f);
        }
    }
    public static void main(String[] agrs){
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.add(2);
        q.add(3);
        q.poll();
        showMethods(q.getClass());
        showFields(q.getClass());
        System.out.println(q);
    }
}


/*

Queue is an Interface

In Java, Queue is not a class.

| Operation         | Meaning           |
| ----------------- | ----------------- |
| add() / offer()   | insert element    |
| remove() / poll() | remove element    |
| peek()            | see first element |
| isEmpty()         | check if empty    |


| Class         | Description         |
| ------------- | ------------------- |
| LinkedList    | most common queue   |
| ArrayDeque    | faster modern queue |
| PriorityQueue | sorted queue        |

Modern Java prefers:
ArrayDeque
*/