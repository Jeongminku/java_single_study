package Nov4.Polymorphism;

import Nov4.PolyFan.Fan;

public class Gosegu extends Fan implements Introduce {
	
	@Override
	public void start() {
		System.out.println("안녕하세요! 여러분들의 고정관념을 깰 아이돌! 고 세 구 입니다~ 화면이 거꾸로라 불편하시다고요? 그럼 핸드폰을 돌려주세요~ 감사합니다~ 킹~ 아!");
		
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

	@Override
	public void youtubeSub() {
		System.out.println("유튜브구독자: 23.9만명");
		
	}


}
