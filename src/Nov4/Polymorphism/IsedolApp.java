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
			String selectIdol = scanner.nextLine();
			
			if (selectIdol.equals("1")) {
				Manage.Ine();
				
			} else if (selectIdol.equals("2")) {
				Manage.Jingburger();
				
			} else if (selectIdol.equals("3")) {
				Manage.Lilpa();
				
			} else if (selectIdol.equals("4")) {
				Manage.Jururu();
				
			} else if (selectIdol.equals("5")) {
				Manage.Gosegu();
				
			} else if (selectIdol.equals("6")) {
				Manage.Vichan();
				
			} else if (selectIdol.equals("7")) {
				st = false;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
				
			
		}//while 끝
		System.out.println("검색을 종료합니다.");

	} //main 메소드 끝
}
