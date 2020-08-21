package oop5;

class Account {
	int money1;
	static int money2;
	
	public Account(int money) {
		money1 += money;
		money2 += money;
	}

	@Override
	public String toString() {
		return "Account [money1=" + money1 + ", money2=" + money2 + "]";
	}
}

public class AccountTest {
	public static void main(String[] args) {
		System.out.println(Account.money2);
		Account a1 = new Account(1000);
		System.out.println(a1);
		Account a2 = new Account(1000);
		System.out.println(a2);
		Account a3 = new Account(1000);
		System.out.println(a3);
		
	}
}
