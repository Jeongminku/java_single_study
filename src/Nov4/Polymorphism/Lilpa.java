package Nov4.Polymorphism;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lilpa extends Youtube implements Introduce{
	
	double subRatio = 2.28;
	int people;
	

	//필드
	
	@Override
	public void start() {
		System.out.println("방송 시작: 에블바리 세이~ 리라리라~!");
		
	}
	
	@Override
	public void memberName() {
		System.out.println("멤버 이름: 릴파");
		
	}

	@Override
	public void fandom() {
		System.out.println("팬덤 이름: 박쥐");
		
	}

	@Override
	public void song() {
		System.out.println("대표곡: 마지막 재회");
		
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
			LilSub ++; 
		} else if(yn.equals("n")||yn.equals("N")) {
			System.out.println("구독하지 않았습니다.");
		}
		people = (int)Math.round(youtubeSub * subRatio)+LilSub;
		return "유튜브구독자:" + df.format(people) + "명"; 
	}
/*
	@Override
	public void youtubeSub() {
		super.subRatio = (double) 2.28;
		DecimalFormat df;
		df = new DecimalFormat("#,###");
		System.out.println("유튜브구독자: "+ df.format(Math.round(youtubeSub * subRatio)) + "명");
		
		
	}
*/

}
