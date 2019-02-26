package example.java.jvm.reflection;

import java.lang.reflect.Method;

public class SimpleUnitTester {

    public int execute(Class clazz) throws Exception {
        int failedCount = 0;

        // your code

        for(Method m : clazz.getDeclaredMethods()) {
            if(m.getName().startsWith("test") && m.getReturnType().equals(boolean.class) && m.invoke(clazz.newInstance()).equals(false)) {
                failedCount++;
            }

        }

        return failedCount;
    }

    public static void main(String[] args) throws Exception {

        SimpleUnitTester tester = new SimpleUnitTester();
        int failCount = tester.execute(Reflection.class);
        System.out.println(failCount);
    }

}
