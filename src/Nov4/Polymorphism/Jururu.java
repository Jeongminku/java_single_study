package Nov4.Polymorphism;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Jururu extends Youtube implements Introduce{
	
	double subRatio = 1.92;
	int people;
	
	@Override
	public void start() {
		System.out.println("방송 시작: 밍나~ 콘르르 콘르르!");
		
	}
	
	@Override
	public void memberName() {
		System.out.println("멤버 이름: 주르르");
		
	}

	@Override
	public void fandom() {
		System.out.println("팬덤 이름: 주폭도");
		
	}

	@Override
	public void song() {
		System.out.println("대표곡: Ju. T'aime");
		
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
			JuSub ++;
		} else if(yn.equals("n")||yn.equals("N")) {
			System.out.println("구독하지 않았습니다.");
		}
		people = (int)Math.round(youtubeSub * subRatio)+JuSub;
		return "유튜브구독자:" + df.format(people) + "명"; 
	}


}
