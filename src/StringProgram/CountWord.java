package StringProgram;

import java.util.Scanner;

public class CountWord {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter any String");
		String s=sc.nextLine();
		
		int wordcount=countword(s);
		System.out.println(" word count: "+ wordcount);
		sc.close();	
	}
	
	public static int countword(String str) {
		if(str==null || str.isEmpty())
		{
			return 0;
		}
		String[] words=str.trim().split("\\s+");
		return words.length;
	}
}
