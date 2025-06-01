package StringProgram;

public class String1 {
	//charAt(int index)--Returns the character locating at specified index
	public static void main (String[]args) {
		String s=new String("Aniket");
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(90)); // RE:StringIndexOutOfBoundsException
	}

}
