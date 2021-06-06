package OneToFourteen;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num = scn.nextInt();
	int i = 1;
	while(i<=num){
		System.out.println(i);
		i++;
	}
	scn.close();
	}

}
