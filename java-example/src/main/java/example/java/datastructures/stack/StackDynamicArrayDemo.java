package example.java.datastructures.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class StackDynamicArrayDemo {

    public static void main(String[] args) {




        StackDynamicArray<Integer> stackDynamicArray = new StackDynamicArray<Integer>(2);
        stackDynamicArray.push(12);
        stackDynamicArray.push(12);
        System.out.println(stackDynamicArray.size);
        stackDynamicArray.push(12);
        System.out.println(stackDynamicArray.size);

    }
}


