package NumberProgram;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		
		for(int i=num; i!=0;)
		{
			i=i/10;
			count++;
		}
		int sum=0;
		while(temp!=0)
		{
			int rem=temp%10;
			int pow=1;
			for(int i=0;i<count;i++)
			{
				pow=pow*rem;
			}
			sum=sum+pow;
			temp/=10;
		}
		if(sum==num)
		{
			System.out.println("It is Armstrong Number!");
		}
		else
		{
			System.out.println("It is Not Armstrong Number!");
		}
	}
}
