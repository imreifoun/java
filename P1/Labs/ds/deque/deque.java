import java.util.Deque;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

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

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);

        dq.removeFirst();
        dq.removeLast();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(9);
        pq.add(1);

        pq.remove();

        System.out.println(pq);
    }
}


/*



| Operation     | Meaning      |
| ------------- | ------------ |
| addFirst()    | add to front |
| addLast()     | add to rear  |
| removeFirst() | remove front |
| removeLast()  | remove rear  |
| peekFirst()   | view front   |
| peekLast()    | view rear    |

__________________________________________________________

A PriorityQueue is a queue where elements are removed based on priority, not insertion order.
Insert: 5, 1, 3
Remove: 1 → 3 → 5
Because smaller numbers have higher priority.

*/