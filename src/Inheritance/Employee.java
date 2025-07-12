package Inheritance;

public class Employee extends Company {
	String ename;
	String job;
	int eid;
	double salary;
	
	public Employee() 
	{
		
	}
	public Employee(String name, String type, String location, String ceo, double turnover, String ename, String job, int eid, double salary) 
	{
		this.name = name;
		this.type = type;
		this.location = location;
		this.ceo= ceo;
		this.turnover = turnover;
		
		this.ename = ename;
		this.job = job;
		this.eid = eid;
		this.salary = salary;
	}
	 public void displayEmployee()
	 {
		 System.out.println("Name="+name);
		 System.out.println("Type="+type);
		 System.out.println("Location="+location);
		 System.out.println("CEO="+ceo);
		 System.out.println("TurnOver="+turnover);
		 System.out.println("-------------------");
		 System.out.println("Ename="+ename);
		 System.out.println("Job="+job);
		 System.out.println("EId="+eid);
		 System.out.println("Salary="+salary);
	 }
}
	
