package ch07.customer;

public class Customer {
	//필드 - 접근제어자 필드명: 데이터 타입
	protected int customerID; // # customerID: int  // 고객 아이디
	protected String customerName; // # customerName: String // 고객이름
	protected String customerGrade; // 고객 등급
	int bonusPoint; // ~ bonusPoint: int // 포인트 적립
	double bonusRatio; // 보너스 포인트 적립 비율
	
	//생성자
	public Customer(){
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) { 
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	
	//메소드
	//고객 등급 초기화 메소드
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	//1.보너스 포인트 계산, 2.지불가격 리턴,      3.보너스포인트는 적립개념이므로 누적합산(+=).  
	public int calcPrice(int price) { //price = 지불 금액
		bonusPoint += (price * this.bonusRatio);
		return price; //4.일반고객은 할인율이 없으므로 지불금액 그대로 리턴시켜줘야.
	}
	
	
	//고객정보 보여주기
	public String showCustomerInfo() { //고객 정보 출력 메소드 " (고객이름)님의 등급:(등급), 보너스 포인트: (보너스포인트)  "
		return customerName + "님의 등급: " + customerGrade + ", 보너스 포인트: " + bonusPoint; 
	}

	
	//get, set 메소드 ---  protected    
	public int getCustomerID() { //get : 해당 필드의 값을 얻어옴
		return customerID;
	}

	public void setCustomerID(int customerID) { //set : 해당 필드의 값을 수정함
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
	
	
	
}


/*
고객 객체를 생성할 수 있는 클래스이며, Silver등급을 기본으로한다.
# : protected
~ : default
+ : public
- : private

*/