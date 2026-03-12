import java.util.Stack;

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
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        //showFields(stack.getClass());
        //showMethods(stack.getClass());
        //System.out.println(stack.search(2));
    }
}


/*

| Operation | Meaning              |
| --------- | -------------------- |
| push()    | add element to top   |
| pop()     | remove top element   |
| peek()    | see top element      |
| empty()   | check if stack empty |
| search()  | find position        |

If you want the method to accept any class type dynamically, you use Class<?>.

*/