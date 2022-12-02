package Nov4.Polymorphism;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Gosegu extends Youtube implements Introduce {
	
	double subRatio = 2.39;
	int people;
	
	@Override
	public void start() {
		System.out.println("방송 시작: 안녕하세요! 여러분들의 고정관념을 깰 아이돌! 고 세 구 입니다~ 화면이 거꾸로라 불편하시다고요? 그럼 핸드폰을 돌려주세요~ 감사합니다~ 킹~ 아!");
		
	}
	
	@Override
	public void memberName() {
		System.out.println("멤버 이름: 고세구");
		
	}

	@Override
	public void fandom() {
		System.out.println("팬덤 이름: 세균단");
		
	}

	@Override
	public void song() {
		System.out.println("대표곡: 팬서비스");
		
	}
	
	public String youtubeSub() {
		Youtube yousub = new Youtube();
		DecimalFormat df;
		df = new DecimalFormat("#,###");
		System.out.println("유튜브 구독자: "+ df.format((int)Math.round(youtubeSub * subRatio))+"명");
		System.out.println("구독하시겠습니까? (Y/N)");
		//스캐너 y/n
		Scanner sc = new Scanner(System.in);
		String yn = sc.nextLine();
		if (yn.equals("y")||yn.equals("Y")) {
			GoSub ++;
		} else if(yn.equals("n")||yn.equals("N")) {
			System.out.println("구독하지 않았습니다.");
		}
		people = (int)Math.round(youtubeSub * subRatio)+GoSub;
		return "유튜브구독자:" + df.format(people) + "명"; 
	}

}
