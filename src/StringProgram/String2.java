package StringProgram;

public class String2 {
	public static void main (String [] args) {
		String s= new String("Aniket");
		s=s.concat("Hukire");
		//s=s+"hukire";    the overloaded "+" and "+=" operators also meant for concatenation purpose
		//s+="hukire";
		System.out.println(s);
	}
}
