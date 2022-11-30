package JavaMiniTest;

public class Student1 {
	
	String name;
	public static int ban;
	int no;
	int kor = 14;
	int eng = 12;
	int math = 11;
	
	public static void main(String[] args) {
	
		System.out.println(getTotal());
		System.out.println(getAverage());
		
		
		

	}

	
	static int getTotal() {
		return this.kor + eng + math;
	};
	
	static float getAverage( ) {
		float sum = getTotal();
		return (float)((int)(sum * 100)/3)/100;
		
	}
	
	
}
