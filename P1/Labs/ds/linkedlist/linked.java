import java.util.LinkedList;

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
        LinkedList<Integer> lnk = new LinkedList<Integer>();

        lnk.add(1);
        lnk.add(2);
        lnk.add(3);

        lnk.addFirst(4);

        System.out.println(lnk);
        
       
    }
}


/*



*/