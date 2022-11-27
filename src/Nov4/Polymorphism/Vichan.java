package Nov4.Polymorphism;

public class Vichan implements Introduce{
	
	@Override
	public void start() {
		System.out.println("나 멜론 36위 가수야!");
		
	}
	
	@Override
	public void memberName() {
		System.out.println("멤버 이름: 비챤");
		
	}

	@Override
	public void fandom() {
		System.out.println("팬덤 이름: 고라니");
		
	}

	@Override
	public void song() {
		System.out.println("대표곡: 그냥 살아!");
		
	}

	@Override
	public void youtubeSub() {
		System.out.println("유튜브구독자: 21.4만명");
		
	}


}
