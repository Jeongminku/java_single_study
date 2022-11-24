package ch07.single.customer;

public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName){
		super(customerID, customerName); //부모 생성자 지정 호출     ==== 실버 계정,이름으로 우선불러옴
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		this.bonusPoint += (price * this.bonusRatio);
		return price - (int)(price * saleRatio);
	}
	
	
	
	
	
}
