package oops;

public class AccountDriver {
	public static void main(String [] args) {
		Account account = new Account("Aniket", "SBI", 7455, 10000.0, 10006789l);
		account.withdrawl(10006789, 7455, 6000);
		account.Setpin(10006789, 7455, 4455);
		account.deposit(10006789, 7455, 5000);
		System.out.println("Final amount:-"+account.getAmmount());
	}
}
