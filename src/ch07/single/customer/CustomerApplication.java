package ch07.single.customer;

import java.util.ArrayList;

public class CustomerApplication {
	
	private static ArrayList<Customer> CustomerList = new ArrayList<Customer>();
	
	public static void main(String[] args) {
	//실버등급 생성
	Customer customerZEUS = new Customer(10010, "최우제"); 
	Customer customerOner = new Customer(10020, "문현준");
	
	//골드등급 생성
	GoldCustomer customerGumayusi = new GoldCustomer(10030, "이민형"); 
	GoldCustomer customerKeria = new GoldCustomer(10040, "류민석");
			
	//VIP등급 생성
	VIPCustomer customerFaker = new VIPCustomer(10050, "이상혁", 99999);
	
	VIPCustomerOther customerDeft = new VIPCustomerOther(10070, "김혁규", 88888);
	
	VIPCustomerOther customerChovy = new VIPCustomerOther(10000, "정지훈", 55555);
	//배열안에 생성한 객체들을 집어넣음.
	CustomerList.add(customerZEUS);
	CustomerList.add(customerOner);
	CustomerList.add(customerFaker);
	CustomerList.add(customerGumayusi);
	CustomerList.add(customerKeria);
	CustomerList.add(customerDeft);
	CustomerList.add(customerChovy);

	showAllCustomer();	
	
	
	//id로 고객 찾기
	//findCustomer(10050);
	Customer customer = findCustomer(10050); //객체이므로 받아줘야.
	Customer customer2 = findCustomer(10070);
	if (customer == null) {
		System.out.println("존재하지 않는 회원입니다.");
	} else {
		showPriceBonus(customer, 10000);
	}
	if (customer2 == null) {
		System.out.println("존재하지 않는 회원입니다.");
	} else {
		showPriceBonus(customer2, 10000);
	}
	

	
	
}	
	public static void showAllCustomer() {
		for (Customer customer : CustomerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}

	
	public static Customer findCustomer(int CustomerID) {
		Customer resultCustomer = null;
		for (Customer customer : CustomerList) {
			if (customer.getCustomerID() == CustomerID) {
				resultCustomer = customer;
			}
		}
		return resultCustomer;
	}
	
	
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("=====해당 고객의 할인율과 보너스 포인트 계산=====");
		int cost = customer.calcPrice(price);
		System.out.println(customer.getCustomerName()+"님의 지불금액: "+ cost + "원");
		System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트: "+ customer.bonusPoint + "점 입니다.");
	}
	
	
	
	
	
}
