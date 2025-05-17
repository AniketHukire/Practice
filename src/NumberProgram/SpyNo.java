package NumberProgram;

import java.util.Scanner;

public class SpyNo {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number:-");
		int num=sc.nextInt();
		int product=1;
		int sum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num/=10;
		}
		
		System.out.println("Sum:- "+sum);
		System.out.println("Product:- "+product);
		
		if(sum==product)
		{
			System.out.println("It is a SPY Number!");
		}
		else
		{
			System.out.println("It is Not SPY Number!");
		}
	}

}
