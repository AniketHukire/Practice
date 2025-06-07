package StringBuffer;

public class trimtosize {
	public static void main(String [] args) {
		StringBuffer sb= new StringBuffer(1000);
		System.out.println(sb.capacity());
		sb.append("Aniket");
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity()); //to gellocate extra allocated free memory such that capacity and size are equle
		
	}

}
