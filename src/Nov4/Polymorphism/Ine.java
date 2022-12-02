package Nov4.Polymorphism;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ine extends Youtube implements Introduce{

	double subRatio = 2.47;
	int people;

	
	@Override
	public void start() {
		System.out.println("방송 시작: 으으으으으으으으으으으으음~ 하이네!");
		
	}
	
	@Override
	public void memberName() {
		System.out.println("멤버 이름: 아이네");
		
	}

	@Override
	public void fandom() {
		System.out.println("팬덤 이름: 비둘기");
		
	}

	@Override
	public void song() {
		System.out.println("대표곡: 부엉이");
		
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
			IneSub ++;
		} else if(yn.equals("n")||yn.equals("N")) {
			System.out.println("구독하지 않았습니다.");
		}
		people = (int)Math.round(youtubeSub * subRatio)+IneSub;
		return "유튜브구독자:" + df.format(people) + "명"; 
	
	
}
}
