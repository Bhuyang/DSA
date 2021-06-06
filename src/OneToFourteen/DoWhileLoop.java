package OneToFourteen;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=10;
		do{
			System.out.println(i);
			i++;
		}while(i<=n);
		scn.close();
	}
		
}
