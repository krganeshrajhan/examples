package example.java.datastructure.stack;

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


