package IfStatement;

import java.util.Scanner;

public class If2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Age");
		int age= sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible for Vote!");
			return;
		}
			System.out.println(" Not Eligible for Vote!");
	}

}
