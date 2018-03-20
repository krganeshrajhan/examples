package example.java.time.complexity;

import java.util.Scanner;

public class Primality {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		for(int a0 = 0; a0 < p; a0++){
			int n = in.nextInt();
			long timeStart = System.currentTimeMillis();
			checkPrimality(n);
			long timeEnd = System.currentTimeMillis();
			System.out.println(timeEnd-timeStart);
		}
	}

	private static void checkPrimality(int n) {

		if(n==1) {
			System.out.println("Not prime");
			return;
		}
		boolean isPrime = true;
		for(int i=2; i<n;i++) {
			if(n%i==0){
				isPrime = false;
				break;
			}
		}

		if(isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
	}
}
