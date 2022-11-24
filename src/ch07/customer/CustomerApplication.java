package ch07.customer;

import java.util.ArrayList;

public class CustomerApplication {
	//Customer 객체를 저장할 ArrayList를 생성
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	//ArrayList<E>list = new ArrayList<E>();     E는 저장할 데이터 타입
	public static void main(String[] args) {
		//일반 고객(SILVER)
		Customer customerLee = new Customer(10010, "리신");
		Customer customerShin = new Customer(10020, "신드라");
		
		//골드 고객(GOLD)
		GoldCustomer customerCait = new GoldCustomer(10030, "케이틀린");
		GoldCustomer customerYu = new GoldCustomer(10040, "유미");
		
		//VIP고객(VIP)
		VIPCustomer customerVic = new VIPCustomer(10050, "빅토르", 99009); //ID, 이름, 상담원ID
		VIPCustomerOther customerAh = new VIPCustomerOther(10060, "아리", 77007);
		//변수명.add = ArrayList에 넣어줌 , 인덱스번호 0 1 2 3 4 다 있음.
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerCait);
		customerList.add(customerYu);
		customerList.add(customerVic);
		
		showAllCustomer(); //static이라서 그냥 실행 가능.  
		
		//id로 고객 찾기
		// findCustomer(10050); //빅토르를 찾아봅시다
		Customer customer = findCustomer(10050); //객체이므로 받아줘야.
		
		
		//id로 찾은 고객의 실제 지불금액, 보너스 포인트 출력
		if (customer == null) { //입력한 id값이 없는 경우
			System.out.println("존재하지 않는 회원입니다");
		}else {
			//고객의 실제 지불금액, 보너스 포인트를 출력
			showPriceBonus(customer, 10000); //10000 = 만원
		}
		
	
	}
	
	//모든 고객의 정보를 출력합니다.
	public static void showAllCustomer() {
		System.out.println("===============모든 고객 정보를 출력==============");
		
		//향상된 for 문     배열(customerList)에서 값을 얻어와서 customer 에 넣어줌
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}
	
	
	//id로 해당 고객객체를 찾아주는 메소드
	public static Customer findCustomer(int customerID) {
		Customer resultCustomer = null; //데이터타입 Customer, 변수명 resultCustomer
		
		for (Customer customer : customerList) {
			//해당 객체의 customerID와 매개변수로 받아온 customerID가 같은지 비교함
			//customer.getCustomerID()     ==     customerID
			if (customer.getCustomerID() == customerID) {
				resultCustomer = customer; //일치하므로 객체 자체를 resultCustomer에 넣어줌.
				break;//for문을 종료함.
			}
		}
		return resultCustomer;
	}
	
	
	
	
	public static void showPriceBonus(Customer customer, int price) {//price = 고객이 물건 살때 지불한 금액
		System.out.println("======해당 고객의 할인율과 보너스 포인트 계산 ======");
		//cost에는 지불할 비용을 출력할것.
		int cost = customer.calcPrice(price); //VIPCustomer에서 오버라이드 된 calcPrice가 실행이 됨.
		System.out.println(customer.getCustomerName() +"님의 지불금액: " + cost + "원");
		System.out.println(customer.getCustomerName() +"님의 현재 보너스 포인트: " + customer.bonusPoint + "점 입니다.");
	}
	
	
}


/*
CustomerApplication.java에서 ArrayList를 이용하여 Customer 객체를 관리한다.


*/