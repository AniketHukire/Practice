package NumberProgram;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("It is a Perfact Number!");
		}
		else
		{
			System.out.println("It is a Not Perfect Number!");
		}
	}

}
