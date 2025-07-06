package oops;

public class Account {
	private String name;
	private String bankname;
	private int pin;
	private double amount;
	private long accno;
	
	public Account(String name, String bankname, int pin, double amount, long accno)
	{
		this.name = name;
		this.bankname = bankname;
		this.pin = pin;
		this.amount = amount;
		this.accno = accno;
	}
	public String getName()
	{
		return name;
	}
	public String getBankName()
	{
		return bankname;
	}
	public long getAccno() 
	{
		return accno;
	}
	public double getAmmount()
	{
		return amount;
	}
	public void withdrawl(long accno, int pin, double amount) 
	{
		if(this.accno == accno && this.pin == pin)
		{
			System.out.println("Login success!");
			if(amount <= 0)
			{
				System.out.println("Withdrawal Amount must be possitive");
			}
			else if((this.amount - amount) >=2000 )
			{
				this.amount -= amount;
				System.out.println("Amount Debited:- "+amount);
				System.out.println("Balance:- "+this.amount);
			}
			else
			{
				System.out.println("Minimum 2000 rs Requried!");
			}
		}
		else
		{
			System.out.println("Invalid Credentials!");
		}
	}
	
	public void deposit(long accno, int pin, double amount)
	{
		if(this.accno == accno && this.pin == pin)
		{
			if(amount > 0)
			{
				this.amount += amount;
				System.out.println("Balance :- "+this.amount);
			}
			else
			{
				System.out.println("Deposit most be Positive");
			}
		}
		else
		{
			System.out.println("Invalide Credentials!");
		}
	}
	public void Setpin(long accno, int oldpin, int newpin)
	{
		if(this.accno == accno)
		{
			if(this.pin == oldpin)
			{
				this.pin = newpin;
				System.out.println("pin update!");
			}
			else
			{
				System.out.println("Invalide old pin");
			}
		}
		else
		{
			System.out.println("Invalide Account Number!");
		}
	}
}


