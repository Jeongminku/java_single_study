package Nov4.Polymorphism;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Jingburger extends Youtube implements Introduce{

	double subRatio = 2.17;
	int people;
	int human;
	
	@Override
	public void start() {
		System.out.println("방송 시작: 당신은 오늘 햄버거를 먹어야합니다");
		
	}
	
	@Override
	public void memberName() {
		System.out.println("멤버 이름: 징버거");
		
	}

	@Override
	public void fandom() {
		System.out.println("팬덤 이름: 똥강아지");
		
	}

	@Override
	public void song() {
		System.out.println("대표곡: How To Love(O.Y.T)");
		
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
			JingSub ++;
		} else if(yn.equals("n")||yn.equals("N")) {
			System.out.println("구독하지 않았습니다.");
		}
		people = (int)Math.round(youtubeSub * subRatio)+JingSub;
		return "유튜브구독자:" + df.format(people) + "명"; 
	}
	
/*
	@Override
	public void youtubeSub() {
		super.subRatio = (double) 2.17;
		DecimalFormat df;
		df = new DecimalFormat("#,###");
		System.out.println("유튜브구독자: "+ df.format(Math.round(youtubeSub * subRatio)) + "명");
		
	}
*/

}
