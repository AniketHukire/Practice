package Inheritance;

public class EmployeeDriver {
	public static void main(String [] args)
	{
		Employee e1 = new Employee("TCS", "MNC", "Hinjewadi", "Rajesh Goplnathan", 50000000000.0, "Aniket Hukire", "Software Devloper", 10076, 50000);
		e1.displayEmployee();
		e1.displayEmployee();
		
		Company c1 = new Company("Infosys", "MNC", "Bangluru", "Salil Parekh", 12340000000.4);
		c1.displayCompany();
		//c1.displayEmployee();//CTE
	}

}
