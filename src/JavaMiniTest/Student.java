package JavaMiniTest;

public class Student {
	String name = "김유신";
	int ban = 3;
	int no = 13;
	int kor = 50;
	int eng = 60;
	int math = 53;
	
	
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage( ) {
		float sum = getTotal();
		return (float)((int)(sum * 100)/3)/100;
 
	}

	@Override
	public String toString() {
		return "학생의 이름은: " + this.name + " 반은: "
				+ "" + this.ban +"반" + " 번호는: " + this.no + "번입니다."; 
	}
	
	
}