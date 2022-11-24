package ch07.single2.customer;

import java.util.ArrayList;

public class CustomerApplication {

	protected static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static void main(String[] args) {
	
	Customer customerZeus = new Customer(10010, "최우제"); 
	Customer customerOwner = new Customer(10020, "현준이");
	Customer customerGumayusi = new GoldCustomer(10030, "이민형");
	Customer customerKeria = new GoldCustomer(10040, "케리아");
	Customer customerFaker = new VIPCustomer(10050, "페이커", 99999);
	
	customerList.add(customerZeus);
	customerList.add(customerOwner);
	customerList.add(customerGumayusi);
	customerList.add(customerKeria);
	customerList.add(customerFaker);
	
	showAllCustomer();
	
	Customer customer1 = findCustomer(10050);
	Customer customer2 = findCustomer(10030);
	Customer customer3 = findCustomer(10010);
	
	if (customer1 != null) {
		showPriceBonus(customer2, 10000);
	} else {
		System.out.println("존재하지않는 회원입니다.");
	}
	
	}

	public static void showAllCustomer() {
	System.out.println("=====모든 고객 정보 출력=====");
	for (Customer customer : customerList) {
		System.out.println(customer.showCustomerInfo());
	}
	}

	public static Customer findCustomer(int customerID) {
		Customer resultCustomer = null;
		for (Customer customer : customerList) {
			if (customer.getCustomerID() == customerID) {
				resultCustomer = customer;
			}
		}
		return resultCustomer;
	}

	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("===== 해당 고객의 할인율과 보너스 포인트 계산 =====");
		int cost = customer.calcPrice(price);
		System.out.println(customer.getCustomerName() + "님의 지불금액: " + cost + "원");
		System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트: " + customer.bonusPoint + "점");
	}
	
}
