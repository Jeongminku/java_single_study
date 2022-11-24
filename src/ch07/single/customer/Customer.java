package ch07.single.customer;

public class Customer {
	//필드
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	//생성자
	public Customer() {
		initCustomer();
	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	
	//메소드
	private void initCustomer() {//고객을 생성한다.다만, 고객의 등급은 SILVER, 보너스비율은 0.01이 실버등급의 기본이다.
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	
	
	
	public int calcPrice(int price) {
		this.bonusPoint += (price * this.bonusRatio);
		return price;
	}
	
	
	
	public String showCustomerInfo() {
		return this.getCustomerName() + "님의 등급: " + this.getCustomerGrade() + ", 보너스 포인트: " + bonusPoint + "점 입니다.";
	}
	
	
	
	
	
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
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
