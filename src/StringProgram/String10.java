package StringProgram;

public class String10 {
	public static void main(String [] args) {
		String s1="Java";
		String s2=new String("java");
		if(s1.equalsIgnoreCase(s2)) 
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not Equals");
		}
	}

}
