package Assignments;

import java.util.Scanner;

public class altprimeNum {
	public static void main( String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int limit = sc.nextInt();
		
		printAlternatePrime(limit);
	}
	static void printAlternatePrime( int limit) {
		int count = 0;
		System.out.println("Alternate Prime Number up to "+ limit);
		for( int num = 2; num <= limit; num++)
		{
			if(isPrime(num))
			{
				if (count % 2 == 0)
				{
					System.out.println(num + " ");
				}
				count++;
			}
		}
	}
	static boolean isPrime(int n) {
		if(n <= 1) return false;
		
		for(int i = 2; i * i <= n; i++)
		{
			if( n % i == 0) return false;
		}
		return true;
	}
}
