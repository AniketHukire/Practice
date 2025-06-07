package StringProgram;

public class String6 {
	public static void main(String [] args) {
		String ta="A";
		ta=ta.concat("B");
		String tb="C";
		ta=ta.concat(tb);
		ta.replace('C', 'D');//gc boz s\dos't store in memory
		ta=ta.concat(tb);
		System.out.println(ta);//ABCC
	}

}
