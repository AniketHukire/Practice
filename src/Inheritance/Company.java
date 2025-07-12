package Inheritance;

public class Company {
	String name;
	String type;
	String location;
	String ceo;
	double turnover;
	
	public Company()
	{
		
	}
	public Company(String name, String type, String location, String ceo, double turnover)
	{
		this.name = name;
		this.type = type;
		this.location = location;
		this.ceo = ceo;
		this.turnover = turnover;
	}
	
	public void displayCompany()
	{
		System.out.println("Name= "+name);
		System.out.println("Type="+type);
		System.out.println("Location="+location);
		System.out.println("CEO="+ceo);
		System.out.println("TurnOver="+turnover);
	}
}
