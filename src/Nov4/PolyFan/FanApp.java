package Nov4.PolyFan;

import java.util.ArrayList;

public class FanApp {

	private static ArrayList<Fan> fanList = new ArrayList<Fan>();
	
	public static void main(String[] args) {
		//아메바
		Fan poong = new Fan("풍신","아이네");
		
		//진드기
		Fan eviFry = new FanJin("새우튀김","릴파");
		
		//왁무새
		Fan biKim = new FanWak("비즈니스 킴", "고세구"); 
		
		//침팬치
		Fan roent = new FanChim("뢴트게늄","주르르");
		
		
		fanList.add(poong);
		fanList.add(eviFry);
		fanList.add(biKim);
		fanList.add(roent);
		
	
		showAllFan();
		
		
		
		//강제타입변환 써보기
		if (roent instanceof Fan) {
			Fan typeCoer = (Fan) roent;
			typeCoer.typeCoercion();
		}
		
		
		
	}

	public static void showAllFan() {
		System.out.println("========팬 목록 출력========");
		
		for (Fan fan : fanList) {
			System.out.println(fan.showFanInfo());
		}
	}
	

}
