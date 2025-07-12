package Inheritance;

public class College extends University {
	String collname;
	String colllocation;
	int code;
	char grade;
	String type;
	
	public College()
	{
		
	}
	public College(String Uname, int Uno, String Ulocation, String collname, String colllocation, int code, char grade, String type)
	{
		this.Uname = Uname;
		this.Uno = Uno;
		this.Ulocation = Ulocation;
		this.collname = collname;
		this.colllocation = colllocation;
		this.code = code;
		this.grade = grade;
		this.type = type;
	}
	public void displayCollege()
	{
		displayUniversity();
		System.out.println("College Nmae= "+collname);
		System.out.println("College Location= "+colllocation);
		System.out.println("College Code= "+code);
		System.out.println("College Grade= "+grade);
		System.out.println("College Type= "+type);
	}
}
