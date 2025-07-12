package Inheritance;

public class Student extends Department {
	String sname;
	int sid;
	char gender;
	long mobno;
	
	public Student()
	{
		
	}
	public Student(String Uname, int Uno, String Ulocation, String collname, String colllocation, int code, char grade, String type, String deptname, String hod, int capacity, int faculty, String sname, int sid, char gender, long mobno)
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
		
		this.sname = sname;
		this.sid = sid;
		this.gender = gender;
		this.mobno = mobno;
	}
	public void displayStudent()
	{
		//displayUniversity();
		//displayCollege();
		displayDepartment();
		System.out.println("Student Nmae= "+sname);
		System.out.println("Student Id= "+sid);
		System.out.println("Gender= "+gender);
		System.out.println("MOB.NO= "+mobno);
	}
}
