package pbankaccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testGetBalance() {
		BankAccount acc = new BankAccount();
		//Balance must be 0
		assertEquals(0,acc.getBalance());
	}

	@Test
	void testDeposit() {
		BankAccount acc = new BankAccount();
		//deposit 100
		acc.deposit(100);
		assertEquals(100,acc.getBalance());
	}

	@Test
	void testWithdraw() {
		BankAccount acc = new BankAccount();
		acc.deposit(10);
		acc.withdraw(50);
		assertEquals(50,acc.getBalance());
		
	}
	
	@Test
	void testWithdrawInNegatives() {
		BankAccount acc = new BankAccount();
		acc.deposit(10);
		acc.withdraw(50);
		assertEquals(45,acc.getBalance());
		
	}
	

}
