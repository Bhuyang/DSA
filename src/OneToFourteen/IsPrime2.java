package OneToFourteen;

import java.util.Scanner;

public class IsPrime2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		
		for(int i=1;i<=t;i++){
			int num = scn.nextInt();
			boolean isPrime = true;
			
			for(int div = 2; div<=num/2;div++){
				if(num%div==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime == true){
				System.out.println("Pime");
			}else{
				System.out.println("Not Prime");
			}
		}
			
	}

}
