package StringBuffer;

public class Demo {
	public static void main(String [] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16 StringBuffer Object with difaultCapacity is 16
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());//16
		sb.append("q");                  
		System.out.println(sb.capacity());//34  new capacity=(currentcapacity+1)*2
	}

}
