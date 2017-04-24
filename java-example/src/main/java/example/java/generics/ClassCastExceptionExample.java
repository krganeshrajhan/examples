package example.java.generics;

import java.util.ArrayList;

/**
 * Created by 1532082 on 3/29/2017.
 */
public class ClassCastExceptionExample {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("JAVA");

        //    list.add(123);       Compile time error

        for (String str : list)
        {
            //No type casting needed. ClasscastException Never occurs

            System.out.println(str);
        }

        ArrayList oldlist = new ArrayList();

        oldlist.add("JAVA");

        oldlist.add(123);

        for (Object object : oldlist)
        {
            //Below statement throws ClassCastException at run time

            String str = (String) object;       //Type casting

            System.out.println(str);
        }
    }
}
