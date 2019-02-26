package example.java.algorithms.sorting.quick.sort;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {1, 50, 30, 10, 60, 80};
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int low, int high) {

        if(low<high);
        int mid = low + (high-low)/2;
        int pivot = arr[mid];

        int i=low;
        int j=high;


    }
}
