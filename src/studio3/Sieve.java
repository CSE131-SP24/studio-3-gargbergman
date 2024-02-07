package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n");
		int n = in.nextInt();
		boolean[] sieve = new boolean[n + 1];

		sieve[0] = false;
		sieve[1] = false;


		for (int a = 2; a < n+1; a++) {
			for(int i = a*2; i< n+1; i = i + a) {
				sieve[i]= true;

			}
		}

		System.out.print("Prime numbers are: ");
		for (int x = 2; x < n + 1; x++) {
			if (sieve[x] == false) {
				System.out.print(x + ", ");
			}
		}
		System.out.println("and that's it!");		



	}

}
