package StringBuffer;

public class ensurecapacity {
	public static void main (String [] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());// To increase the capacity dynamically based on our requirements
	}

}
