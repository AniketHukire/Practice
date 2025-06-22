package Assignments;

import java.util.Scanner;

public class Demo1 {
	public static void main (String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Number :- ");
		int number= sc.nextInt();
		checkNumber(number);
	}
	public static void checkNumber(int num) {
		if(num % 3==0 && num % 5==0)
		{
			System.out.println(" hi hello");
		}
		else if(num % 3==0)
		{
			System.out.println("hi");
		}
		else if(num % 5==0)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("By");
		}
	}
}
