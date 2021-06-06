package OneToFourteen;

import java.util.Scanner;

public class IsPrime3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		for (int i = 1; i <= t; i++) {

			int num = scn.nextInt();
			boolean isPrime = true;

			for (int div = 2; div * div <= num; div++) {
				if (num % div == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}

		}
	}

}
