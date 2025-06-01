package StringProgram;

public class String3 {
	public static void main( String [] args) {
		String s="java";
		System.out.println(s.equals("JAVA"));//False
		System.out.println(s.equalsIgnoreCase("JAVA"));//True  for content comparison where case is not important
	}

}
