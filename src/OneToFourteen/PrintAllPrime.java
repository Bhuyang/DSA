package OneToFourteen;

import java.util.Scanner;

public class PrintAllPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();
		
		for(int num = low;num<=high;num++){
			boolean isPrime = true;
			
			for(int div =2; div*div<=num;div++){
				if(num%div==0){
					isPrime = false;
					break;
					
				}
			}
			
			if(isPrime==true){
				System.out.println(num);
			}
		}

	}

}
