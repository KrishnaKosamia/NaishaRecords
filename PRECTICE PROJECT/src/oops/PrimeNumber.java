package oops;

import java.util.Scanner;

public class PrimeNumber {
	
	
		
		public static void main(String[] args) {
		
	 while(true) { Scanner s = new Scanner(System.in);
		
		System.out.println("enter the number");
		int x = s.nextInt();
		
		boolean prime = isPrime(x);
		if(prime) {
			System.out.println("yes primeno");
		}
		else {
			System.out.println("not prime");
			
		}		
		
		}	
		}

	private static boolean isPrime(int x) {
		

		int i =2;
		while(i<=x/2) {
			if(x%i==0) {
				return false;
			}
			i++;
		}
		return true;
		
	}
		
}
