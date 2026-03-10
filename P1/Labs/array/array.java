import java.util.ArrayList;

// List All Methods
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

class Arr{
    public static void main(String[] args){
        int[] numbers;
        numbers = new int[5];
        //for (int i = 0; i < numbers.length; i++){ numbers[i] = i;}
        //for (int num : numbers){ System.out.println(num);}
        //for (String agr : args){ System.out.println(agr);}
        //System.out.println("result : ", numbers[0] instanceof int);

        ArrayList<Integer> res = new ArrayList<>();
        //System.out.println("=> " + res.getClass());

        Method[] n = res.getClass().getMethods();
        Field[] f = res.getClass().getDeclaredFields();
        Constructor[] c = res.getClass().getConstructors();

        for (Constructor cn : c){System.out.println("=> " + cn);}
        //for (Method m : n){System.out.println("=> " + m);}
        //for (Field fl : f){System.out.println("=> " + fl);}

        

    }
}

/*
Arrays inherit from Object

All arrays in Java implicitly extend Object.

That means arrays can use methods like:

    numbers.toString();
    numbers.getClass();

String[] names = new String[3];
If the array contains objects, it stores references.
names ───► [null][null][null]

Primitives cannot use instanceof.

___________________________________

obj.getClass()

then ask the class for its methods, fields, constructors, etc.

This is called Java Reflection API.

___________________________________

ArrayList<Integer> res = new ArrayList<>();

res.add(10);
res.add(20);
res.add("hello"); // ❌ compile error

___________________________________

*/