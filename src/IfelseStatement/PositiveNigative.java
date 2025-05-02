package IfelseStatement;

import java.util.Scanner;

public class PositiveNigative {
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		
		if(num>=0)
		{
			System.out.println(num+" This is Positive Number!");
		}
		else
		{
			System.out.println(num+" This is Negative Number!");
		}
	}

}
