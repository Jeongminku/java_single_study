package Nov4.Polymorphism;

import java.util.Scanner;

public class IsedolApp {

	
	
	public static void main(String[] args) {

		boolean st = true;

		while (st) {

			// Introduce introduce;
			System.out.println("================================================");
			System.out.println("당신의 아이돌을 선택해주세요.");
			System.out.println("1.아이네 2.징버거 3.릴파 4.주르르 5.고세구 6.비챤 7.종료");
			System.out.println("선택: ");
			Scanner scanner = new Scanner(System.in); // Scanner객체 생성.
			int selectIdol = scanner.nextInt();

			if (selectIdol == 1) {
				Ine();
				
			} else if (selectIdol == 2) {
				Jingburger();
				
			} else if (selectIdol == 3) {
				Lilpa();
				
			} else if (selectIdol == 4) {
				Jururu();
				
			} else if (selectIdol == 5) {
				Gosegu();
				
			} else if (selectIdol == 6) {
				Vichan();
				
			} else if (selectIdol == 7) {
				st = false;
			}
		}//while 끝
		System.out.println("검색을 종료합니다.");

	} //main 메소드 끝

	
	
	public static void Ine() {
		Introduce introduce;
		introduce = new Ine();
		introduce.start();
		introduce.memberName();
		introduce.fandom();
		introduce.song();
		introduce.youtubeSub();
		
	};
	
	public static void Jingburger() {
		Introduce introduce;
		introduce = new Jingburger();
		introduce.start();
		introduce.memberName();
		introduce.fandom();
		introduce.song();
		introduce.youtubeSub();
		
	};
	
	public static void Lilpa() {
		Introduce introduce;
		introduce = new Lilpa();
		introduce.start();
		introduce.memberName();
		introduce.fandom();
		introduce.song();
		introduce.youtubeSub();
		
	};
	
	public static void Jururu() {
		Introduce introduce;
		introduce = new Jururu();
		introduce.start();
		introduce.memberName();
		introduce.fandom();
		introduce.song();
		introduce.youtubeSub();
		
	};
	
	public static void Gosegu() {
		Introduce introduce;
		introduce = new Gosegu();
		introduce.start();
		introduce.memberName();
		introduce.fandom();
		introduce.song();
		introduce.youtubeSub();
		
	};
	
	public static void Vichan() {
		Introduce introduce;
		introduce = new Vichan();
		introduce.start();
		introduce.memberName();
		introduce.fandom();
		introduce.song();
		introduce.youtubeSub();
		
	};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
