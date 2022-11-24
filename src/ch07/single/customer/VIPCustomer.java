package ch07.single.customer;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		this.bonusPoint += (price * this.bonusRatio);
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ", 담당 상담원 ID: " + agentID;
	}
	
	
	
}

