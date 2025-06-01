package Methods;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vaule of a:-");
		int a=sc.nextInt();
		square (a);
	}
		public static void square(int a)
		{
			System.out.println(a*a);
		}

}
