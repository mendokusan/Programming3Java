package pbankaccount;

public class BankAccount {
private int balance;
public BankAccount()
{
	balance=0;
}
public int getBalance()
{
	return balance;
}
public void deposit(int i)
{
	balance=+i;
}
public void withdraw(int i)
{
	balance-=i;
	if(balance<0) {
		balance-=5;
	}
}

}
