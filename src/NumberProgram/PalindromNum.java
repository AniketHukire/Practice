package NumberProgram;

import java.util.Scanner;

public class PalindromNum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number :-");
		int num=sc.nextInt();
		int tem=num;
		int reverse=0;
		
		while(num!=0)
		{
			int rem=num%10;
			reverse=(reverse*10)+rem;
			num/=10;
		}
		System.out.println("Temp Num:"+tem);
		System.out.println("Reverse Num:"+reverse);
		
		if(tem==reverse)
		{
			System.out.println("It is Palindrom Number");
		}
		else
		{
			System.out.println("It is Not Palindrom Number");
		}
	}

}
