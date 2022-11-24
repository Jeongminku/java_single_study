package ch07.customer;

public class GoldCustomer extends Customer {
	//필드
	double saleRatio; //GOLD 고객의 할인비율
	
	
	//생성자
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName); //부모 생성자 지정호출 + 그 안에있는 initCustomer()가 실행됨.
		super.customerGrade = "GOLD"; //initCustomer에서 정의한 기본 customerGrade가 SILVER이므로 초기값을 다시 정하여 GOLD로 바꿔줌.
		super.bonusRatio = 0.02;//bonusRatio 가 없음이었으나 GOLD부터는 0.02가 적용됨. 초기값을 0.02로 수정함.
		this.saleRatio = 0.1;//SILVER는 없음 이지만, GOLD의 할인율은 0.1이다.
	}
	
	
	//메소드
	@Override
	public int calcPrice(int price) {//1만원을 지불했다면 1만원 * 0.1 -> 정수형으로 바꿔줌 -> 지불받은금액 - 할인금액(int)(price * saleRatio) 
		bonusPoint += (price * bonusRatio); //보너스 적립 공식은 똑같음.
		return price - (int)(price * saleRatio);//할인금액을 리턴
	}
	
	
}
