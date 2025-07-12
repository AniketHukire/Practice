package Inheritance;

public class Department extends College{
	String deptname;
	String hod;
	int capacity;
	int faculty;
	
	public Department()
	{
		
	}
	public Department(String Uname, int Uno, String Ulocation, String collname, String colllocation, int code, char grade, String type, String deptname, String hod, int capacity, int faculty)
	{
		this.Uname = Uname;
		this.Uno = Uno;
		this.Ulocation = Ulocation;
		this.collname = collname;
		this.colllocation = colllocation;
		this.code = code;
		this.grade = grade;
		this.type = type;
		
		this.deptname = deptname;
		this.hod = hod;
		this.capacity = capacity;
		this.faculty = faculty;
	}
	public void displayDepartment()
	{
		//displayUniversity();
		displayCollege();
		System.out.println("Department Name ="+deptname);
		System.out.println("HOD= "+hod);
		System.out.println("Capacity= "+capacity);
		System.out.println("Faculty= "+faculty);
	}
}
