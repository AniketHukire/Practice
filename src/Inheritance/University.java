package Inheritance;

public class University {
	String Uname;
	int Uno;
	String Ulocation;
	
	public University()
	{
		
	}
	public University(String Uname, int Uno, String Ulocation)
	{
		this.Uname = Uname;
		this.Uno = Uno;
		this.Ulocation = Ulocation;
	}
	public void displayUniversity()
	{
		System.out.println("UName= "+Uname);
		System.out.println("UNo = "+ Uno);
		System.out.println("Ulocation ="+Ulocation);
	}
}	

