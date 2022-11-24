package ch07.single2.customer;

public class VIPCustomerOther extends Customer {
	int agentID;
	double saleRatio;
	
	public VIPCustomerOther(int customerID, String customerName, int agentID) {
		
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
	
}
