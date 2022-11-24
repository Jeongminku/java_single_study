package ch06;

public class Example22 {

	public static void main(String[] args) {
		Account22번 account = new Account22번();
		
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 300000


	}

}
