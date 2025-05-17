package NumberProgram;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number :-");
		int num=sc.nextInt();
		int temp=num;
		int reverse=0;
		
		while(num !=0)
		{
			int rem=num%10;
			reverse=(reverse*10)+rem;
			num/=10;
		}
		System.out.println("Orignal Number:-"+temp);
		System.out.println("Reverse Number:-"+reverse);
	}

}
