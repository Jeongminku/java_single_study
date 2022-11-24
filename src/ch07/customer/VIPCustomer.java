package ch07.customer;

public class VIPCustomer extends Customer {
	//필드
	private int agentID; //상담원의 아이디
	double saleRatio; //VIP 고객의 할인비율
	
	
	
	//생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //부모 생성자 지정호출 + 그 안에있는 initCustomer()가 실행됨.
		super.customerGrade = "VIP"; //Customer.java  > initCustomer에서 정의한 기본 customerGrade가 SILVER이므로 초기값을 다시 정하여 VIP로 바꿔줌.
		super.bonusRatio = 0.05;//Customer.java > SILVER등급의 bonusRatio 가 없음이었으나 VIP부터는 0.05가 적용됨. 초기값을 0.05로 수정함.
		this.saleRatio = 0.1;//Customer.java > SILVER등급의 할인율은 없음 이지만, VIP의 할인율은 0.5이다.
		this.agentID = agentID;
	}
	
	
	//메소드
	@Override //할인금액 계산하는거 재정의
	public int calcPrice(int price) {//1만원을 지불했다면 1만원 * 0.1 -> 정수형으로 바꿔줌 -> 지불받은금액 - 할인금액(int)(price * saleRatio) 
		bonusPoint += (price * bonusRatio); //보너스 적립 공식은 똑같음.
		return price - (int)(price * saleRatio);//할인금액을 리턴
	}


	@Override //고객정보 재정의
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + ", 담당 상담원 아이디: " + agentID;
	}


	public int getAgentID() {
		return agentID;
	}
	
	
	
	
	
	
	

}
