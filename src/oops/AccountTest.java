package oops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
	Account account;
	
	@BeforeEach
	public void Setup()
	{
		account = new Account("Aniket", "SBI", 7455, 10000.0, 10006789l);
	}
	
	@Test
	public void testInitialValues()
	{
		assertEquals("Aniket", account.getName());
		assertEquals("SBI", account.getBankName());
		assertEquals(10006789l, account.getAccno());
		assertEquals(10000.0, 	account.getAmmount());
	}
	
	@Test
	public void testDepositSuccess()
	{
		account.deposit(10006789, 7455, 6000);
		assertEquals(16000.0, account.getAmmount());
	}
	
	@Test
	public void testDepositWrongpin() 
	{
		account.deposit(10006789, 4455, 6000);
		assertEquals(4000.0, account.getAmmount());
	}
	
	@Test 
	public void testWithdrwalSuccess()
	{
		account.withdrawl(10006789, 7455, 5000);
		assertEquals(5000.0, account.getAmmount());
	}
	
	@Test
	public void testWithdrawalInsficiantBalance()
	{
		account.withdrawl(10006789, 7455, 9000);// only 1000 left below 2000 min
		assertEquals(1000.0, account.getAmmount());// Withdrawal should fail
	}
	
	@Test
	public void testWithdrawalIncorrectpin()
	{
		account.withdrawl(10006789, 7455, 6000);
		assertEquals(10000.0, account.getAmmount());
	}
	
	@Test
	public void testSetPinSeccess()
	{
		account.Setpin(10006789l, 7455, 6677);
		account.withdrawl(10006789, 6677, 3000);
		assertEquals(7000.0, account.getAmmount());	
	}
	
	@Test
	public void testSetpinWrongOldpin()
	{
		account.Setpin(10006789l, 7855, 6677);
		account.withdrawl(10006789l, 6677, 3000.0);//should fail
		assertEquals(70000.0, account.getAmmount());
	}
	
	@Test
	public void testSetpinWrongAccno()
	{
		account.Setpin(123456123l, 7455, 1234);
		account.withdrawl(123456123l, 1234, 2000);
		assertEquals(80000.0, account.getAmmount());
	}
}
