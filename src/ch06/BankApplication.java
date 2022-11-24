package ch06;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;


public class BankApplication {

	private static Account[] accountArray = new Account[100];
	// 클래스 배열 생성. 클래스명[] 배열명 = new 클래스명[배열길이];   타입명[] 변수이름 = new 타입명[] 인데 여기서는 받을 타입으로 Account라는 객체를 받았음.
	// 참조타입인 객체 Account로 생성한것.
	// 여러군데서 사용해야하기때문에 static을 붙여줌.
	// 하지만 여기 BankApp에서만 사용하기위해서 private을 붙여줌.
	private static Scanner scanner = new Scanner(System.in);
	
	// scanner.next(), scanner.nextInt()등을 사용하기 위함
	// 여러군데서 사용해야하기때문에 static을 붙여줌.
	// 하지만 여기 BankApp에서만 사용하기위해서 private을 붙여줌.
	
	public static void main(String[] args) {
		boolean run = true; // 계속 실행시키기 위해서 true값.
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("-------------------------");
			System.out.println("선택> ");
			int selectNumber = scanner.nextInt();

			switch (selectNumber) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 1. 계좌생성 메소드
	//객체생성없이 바로 사용하기위해서 static을 붙임.
	// 다른 패키지에서도 호출 할 수 있도록 public을 붙임
	
	public static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.println("계좌번호: ");
		
		String accNum = scanner.next(); //계좌번호 입력받기
		System.out.println("--------");
		
		System.out.println("계좌주:"); 
		String accOwner = scanner.next(); // 계좌주 입력받기
		System.out.println("--------");
		
		System.out.println("입금초기액:");
		int accMoney = scanner.nextInt(); // 입금초기액 입력받기

		//계좌를 만듦.
		Account newAccount = new Account(accNum, accOwner, accMoney);
		//클래스 변수명 = new 클래스(변수1, 변수2, 변수3)
		//계좌를 만들고 배열에 배치시킴.
		for (int i = 0; i < accountArray.length; i++) { //배열길이만큼 반복할것.
			//System.out.println(accountArray[i]); 참조타입인 - 배열,클래스(String포함), 인터페이스의 초기값은 null.

			if (accountArray[i] == null) { // 배열[인덱스번호] == null ----> 각 인덱스의 기본이 null값이므로 if가 실행된다. 
				accountArray[i] = newAccount; // T : 생성한 계좌를 배열에 넣어줍니다.
				System.out.println("결과: 계좌가 생성되었습니다");
				break; //반복문을 빠져나오기 위함. for문이 더 돌지 않기위해 탈출시키는 break;
			}
		}
	}

	// 2.계좌 목록보기 메소드
	// 객체생성없이 바로 사용하기위해서 static을 붙임.
	// 다른 패키지에서도 호출 할 수 있도록 public을 붙임
	public static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");

		System.out.println("--------------");
		//System.out.println(Arrays.toString(accountArray));
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i]; //클래스명 변수명 = 배열[i]
			if (account != null) {
				System.out.print(account.getAccNum()); //accountArray[0]의.getAccNum 1개 / accountArray[1]의.getAccNum 1개
				System.out.print(" ");
				System.out.print(account.getAccOwner()); // accountArray[0].getAccOwner(), accountArray[1].getAccowner(), ... accountArray[i].getAccOwner()
				System.out.print(" ");
				System.out.print(account.getAccMoney());
				System.out.print(" ");
			}
		}

	}

	// 3. 예금 메소드
	// 객체생성없이 바로 사용하기위해서 static을 붙임.
	// 다른 패키지에서도 호출 할 수 있도록 public을 붙임
	public static void deposit() { 
		// 요구사항 : 계좌번호가 기존 배열에 있는지 확인. -> 있다면 그 배열에 + plus money 해주면 됨.
		// 없다면? : 계좌가 없습니다 를 출력함.
		// 요구사항에 부합하기위해 추가로 기존배열에 있는지 확인하는 로직이 필요함.
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String accNum = scanner.next(); //계좌번호를 입력받음
		System.out.println("예금액: ");
		int plusMoney = scanner.nextInt(); // 예금액을 입력받음

		Account account = findAccount(accNum); 
		if (account == null) { //break되었기때문에 아무것도 없음.
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setAccMoney(account.getAccMoney() + plusMoney); 
		//account는 accountArray[i]값을 리턴해온것.
		//accountArray[0]의 돈을 set하겠다 -> accountArray[0].setAccMoney(accountArray[0].getAccMoney() + plusMoney);
		//						           계좌배열[0]에 입력된 accMoney값을(...로)set할 것입니다.
		//															     ㄴ(계좌배열[0]에 입력되어있는 accMoney값을 가져오고 + plusMoney한 값)
		//															  
		System.out.println("결과: 예금이 성공되었습니다");

	}

	// 4. 출금 메소드
	// 객체생성없이 바로 사용하기위해서 static을 붙임.
	// 다른 패키지에서도 호출 할 수 있도록 public을 붙임
	public static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String accNum = scanner.next();
		System.out.println("출금액: ");
		int minusMoney = scanner.nextInt();

		Account account = findAccount(accNum);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setAccMoney(account.getAccMoney() - minusMoney);
		System.out.println("결과: 출금이 성공되었습니다");
	}
	
	//5. 배열 내에 해당하는 값이 있는지 확인하기.
				   //클래스명 변수명(매개변수)
	private static Account findAccount(String accNum) {
		for (int i = 0; i < accountArray.length; i++) {
			//불러온 계좌안에 있는 계좌 번호와 매개변수로 받아본 계좌번호 accNum이 같은지 체크
			String ans = accountArray[i].getAccNum();
			if (accountArray[i] == null) { //배열[인덱스]가 없다면 break; 
				break;
			}// 불러온 계좌안에 있는 계좌 번호와 매개변수로 받아본 계좌번호 accNum이 같은지 체크 있으면 return해줌.
			if (ans.equals(accNum)) { //배열[인덱스]가 있는경우.getAccNum()으로 accNum값을 가져와서 .eqauls로 입력받은 accNum과 동일한지 확인
				return accountArray[i]; // 동일하다면 배열인덱스를 리턴함.
			}
		}
		return null;
	}
	
	//6. 배열 내에 해당하는 값이 있는지 확인하기
//	private static Account checkAccount(String accNum)
	
}
