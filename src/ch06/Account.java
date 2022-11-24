package ch06;

public class Account {
	//필드생성
	private String accNum; //계좌번호
	private String accOwner; // 계좌주
	private int accMoney;  //계좌잔액

	//생성자 선언
	public Account(String accNum, String accOwner, int accMoney) {
		this.accNum = accNum; 
		this.accOwner = accOwner;
		this.accMoney = accMoney;

	}
	//계좌번호 get set
	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	
	//계좌주 get set
	public String getAccOwner() {
		return accOwner;
	}

	public void setAccOwner(String accOwner) {
		this.accOwner = accOwner;
	}

	//계좌잔액 get set
	public int getAccMoney() {
		return accMoney;
	}

	public void setAccMoney(int accMoney) {
		this.accMoney = accMoney;
	}

}

/*
 * 23. 다음은 키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램입니다. 계좌는Account2 객체로 생성되고
 * BankApplication에서 길이 100인 Account[ ] 배열로 관리됩니다. 실행 결과를보고, Account와
 * BankApplication 클래스를 작성해보세요 (키보드로 입력받을 때는 Scanner의 nextLine ( ) 메소드를 사용).
 * 
 * 요구사항 계좌번호, 계좌주, 입금액
 * 
 * 목록을 짤 수 있어야.
 * 
 * 
 */