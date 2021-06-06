package OneToFourteen;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		for (int i = 1; i <= t; i++) {
			// scan a number
			int num = scn.nextInt();

			int tf = 0;

			for (int div = 1; div <= num; div++) {
				if (num % div == 0) {
					tf++;
				}

			}

			if (tf == 2) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}

		}
	}

}
