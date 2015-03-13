package array2;

import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {
		// Store the numbers 1-100 in a list
		// Print 10 numbers per line on the screen using System.out.print();
		// Space each number using a tab -> System.out.print("\t");
		Random rand = new Random();
		int seed = 101;
		int n = 0;
		
		for (int i=1; i <= 100; i++ )  {
			n = rand.nextInt(seed);
			System.out.print(n);
			System.out.print("\t");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
	}

}
