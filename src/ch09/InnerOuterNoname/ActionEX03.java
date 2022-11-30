package ch09.InnerOuterNoname;

public class ActionEX03 {

	public static void main(String[] args) {
		Action03 action = new Action03() {
			@Override
			public void work() {
				System.out.println("복사를 합니다");
			}
		};
		
		action.work();
		

	}

}
