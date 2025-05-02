package IfStatement;

import java.util.Scanner;

public class If1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Frist Number");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		
		if(num1 > num2)
		{
			System.out.println(num1+" is Largest Number");
			return;
		}
			System.out.println(num2+" is Largest Number");
	}

}
