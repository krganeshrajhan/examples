package example.java.datastructure.stack;

import java.util.Arrays;

public class StackDynamicArray<T> {
    Object[] stackArray;
    int size;
    int top;
    int maxLimit;

    public StackDynamicArray(int size) {

        this.size = size;
        this.top = -1;
        this.stackArray = new Object[size];
    }

    public void push(T value) {

        ensureCapacity(top+2);
        top = top + 1;
        stackArray[top] = value;
    }

    private void ensureCapacity(int newSize) {

        if(newSize > size) {
            size = size * 2;
            stackArray = Arrays.copyOf(stackArray, size);
        }
    }

    public T pop() {

        T value = (T) stackArray[top];
        top = top -1;
        return value;
    }
}
