package ch11.moduleQ;

import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDateFormatEX16 {

	public static void main(String[] args) {
		Date nowDate = new Date();
		System.out.println("포맷 지정 전: " + nowDate);

		SimpleDateFormat sDF = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 kk시 mm분");
		String forNowDate = sDF.format(nowDate);
		System.out.println(forNowDate);
	}

}
