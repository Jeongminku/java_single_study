package JavaMiniTest;

public class CalcEX {

	public static void main(String[] args) {
		int money = 2680;
		
//		int Fivehund = 0;
//		int Onehund = 0;
//		int fifth = 0;
//		int ten = 0;
//		
//		System.out.println("500원: " + money / 500 + "개");
//		System.out.println("100원: " + money % 500 / 100 + "개");
//		System.out.println("50원: " + money % 500 % 100 / 50 + "개");
//		System.out.println("10원: " + money % 500 % 100 % 50 / 10 + "개");
		
		
		int[] calMoney = {500,100,50,10};
		int cal = 0;
		for (int i = 0; i<calMoney.length; i++) {
			System.out.println(calMoney[i] + "원" + money/calMoney[i]+"개");
			money %= calMoney[i];
		}
	}

}
