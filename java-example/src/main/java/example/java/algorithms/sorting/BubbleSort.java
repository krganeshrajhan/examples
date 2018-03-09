package example.java.algorithms.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}

		int numSwaps = 0;
		int currentSwaps = 0;
		do {
			currentSwaps = numSwaps;
			for(int i = 0; i<(n-1); i++) {
				if(a[i]>a[i+1]) {
					numSwaps++;
					int swap = a[i];
					a[i]= a[i+1];
					a[i+1] = swap;
				}
			}
		} while (currentSwaps<numSwaps);

		System.out.println("Array is sorted in "+numSwaps+" swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[n-1]);
	}
}
