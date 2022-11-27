package Nov4.PolyFan;

import java.util.Scanner;

public class Fan {
	protected String fanName;
	private String fanGrade = "아메바";
	private String osi;
	
	public Fan() {
		initFan();
	}
	
	public Fan(String fanName) {
		initFan();
	}
	
	
	
	public Fan(String fanName, String osi) {
		this.fanName = fanName;
		this.osi = osi;
	}
	
	
	private void initFan() {
		this.fanGrade = "아메바";
	}
	
	public String showFanInfo() {
		return this.fanName + "님의 카페 등급은: " + this.fanGrade + "이며, 원픽은 " + this.osi + "입니다."; 
	}

	
	
	
	//get set
	
	
	public String getFanName() {
		return fanName;
	}

	public void setFanName(String fanName) {
		this.fanName = fanName;
	}

	public String getFanGrade() {
		return fanGrade;
	}

	public void setFanGrade(String fanGrade) {
		this.fanGrade = fanGrade;
	}

	public String getOsi() {
		return osi;
	}

	public void setOsi(String osi) {
		this.osi = osi;
	}
	
	public void typeCoercion() {
		System.out.println("강제타입변환 성공");
	}
	
	
	
	
	
}
