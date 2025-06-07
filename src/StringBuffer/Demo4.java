package StringBuffer;

public class Demo4 {
	public static void main(String [] args) {
		StringBuffer sb=new StringBuffer("aniketmadhukarhukire");
		System.out.println(sb.capacity());
		System.out.println(sb.length());// Return number of character present in StringBuffer
		System.out.println(sb.charAt(10));//It returns character located at specifiedindex
		System.out.println(sb.charAt(30));//StringIndexOutOfBoundsException
	}

}
