package IfelseStatement;

import java.util.Scanner;

public class OddEven {
	public static void main (String args []) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+ " This is Even Number");
		}
		else
		{
			System.out.println(num+"  This is Odd Number");
		}
	}

}
