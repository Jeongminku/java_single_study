package ch09.InnerOuterNoname;

public class Anonymous04 {
	Vehicle04 field = new Vehicle04() {

		@Override
		public void run() {
			System.out.println("자전거가 달립니다");
			
		}
		
	};
	
	void method1() {
		Vehicle04 localVar = new Vehicle04() {

			@Override
			public void run() {
				System.out.println("승용차가 달립니다");
				
			}
			
		};
				
		localVar.run();
	}
	
	void method2(Vehicle04 v) {
		v.run();
	}
}
