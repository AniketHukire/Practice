package StringBuffer;

public class Demo6 {
	public static void main(String [] arg) {
		StringBuffer sb=new StringBuffer("Anikethukire");
		System.out.println(sb);
		sb.delete(5,9);        //to delet characters from begin index to end-1
		System.out.println(sb);
		sb.deleteCharAt(4);      // to delet the character locating at specified index
		System.out.println(sb);
	}
}
