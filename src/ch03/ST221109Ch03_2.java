package ch03;


import java.util.Scanner;

public class ST221109Ch03_2 {

	public static void main(String[] args) {
/*
1. 다음 문장들을 조건식으로 표현하시오.
             1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식-> 10 < x && x < 20
             2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
             3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
             4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
             5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
             6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로
                 나눠떨어지지 않을 때 true인 조건식
             7. boolean형 변수 powerOn가 false일 때 true인 조건식
             8. 문자열 참조변수 str이 “yes”일 때 true인 조건식

정답:
1. if(x>10 && x<20);
2. if(ch != '' || ch != '\t');
3. if(ch == 'x'|| ch == 'X');
4. if(ch >= '0'&& ch <= '9');
5. if((ch >= 'A'&& ch <= 'Z')||(ch >= 'a' && ch<= 'z'));
6. if((year%400 == 0) || (year%4 == 0 && year%100 != 0));
7. if(!powerOn)  
8. if(str.String.equals("yes"))
 
 */

/*2. for 문을 이용하여 1~100까지의 정수 중 3의 배수 총합을 구하는 코드를 작성하시오.
 
int sum = 0;
for (int i=0 ; i<=100; i++) {
	if (i%3 == 0) {
		sum +=i;
		System.out.println(sum);
	}
		  
  
 */

/*3. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 코드를 작성하시오. 총합 73
		int sum = 0;
	for (int i=0; i<=20; i++) {
		if(i%2!=0 && i%3!=0) {
			sum +=i;
			System.out.println(sum);
		}
	}
*/


/*4. while 문과 Math.random( ) 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1,
눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추
는 코드를 작성해보세요. 눈의 합이 5가 되는 경우는 (1, 4), (4, 1), (2, 3), (3, 2)입니다.
	while(true) {
			int num1 = (int)(Math.random()*6 +1);
			int num2 = (int)(Math.random()*6 +1);
			System.out.println("눈1: " + num1 + "눈2: " + num2);
			if(num1 + num2 == 5) {
				break;
			}
			
		}
*/

/* 5. 중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드를 작성해보세요. 
 * 단, x와 y는 10 이하의 자연수입니다.	  
	for (int x = 0; x <= 10; x++) {
		for (int y = 0; y <= 10; y++) {
			if (4*x + 5*y == 60) {
				System.out.println("x는: " + x + "  y는: " + y);
			}
		}
		
	}
 */

		
/*6. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
 * 몇까지 더해야 총합이 100이상이 되는지 구하는 프로그램을 작성하시오.	
  			int num = 0;
		int sum = 0;
		

		while (sum < 100) {
			num++;
			if (num%2 == 0) {
				 sum +=(num * -1);
			}else {
				sum +=num;
			}
			System.out.println("num="+num+"sum="+sum);
		}
		System.out.println(num+"일 때, 총합이 "+sum+"이 된다.");
*/

/*7. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.(이중 for문 이용)
for (int i = 1; i<=6; i++) {
	for (int j = 1; j<=6; j++) {
		if (i + j == 6) {
			System.out.println("1번주사위: "+ i +" 2번주사위: " + j);
		}
	}
}
*/

/* 8.int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
 * 만일 변수 int num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (문자 변환 금지)
		int num = 12345;
		int sum = 0;

//		int num2 = num % 10;
//		System.out.println(num2);
		
		while (num > 0) {
			sum += num % 10; // 나머지를 구해 더한다.
			num /= 10; // 남은 num값을 10으로 나누면 1234.5 -> int값이므로 1234 -> num > 0 이므로 다시 처음부터 반복. 
			System.out.println("num의 값: " + num);
			System.out.println("sum의 값:" + sum);
		}

		System.out.println("sum 최종 값:" + sum);
	
*/	

/* 9. 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 
 * 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 
 * 1과 1부터시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.

 int num1 = 1;
 int num2 = 1;
 
 for (int i = 3; i<= 10; i++) {
	 int Fibo = num1 + num2;
	 System.out.println("num1과 num2의 합은: " + Fibo);
	 num1 = num2;
	 num2 = Fibo;
 }

*/

		
/* 10.다음은 숫자맞추기 게임을 작성한 것이다. 
 * 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 
 * 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 
 * 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. 
 * 네모에 알맞은 코드를 넣어 프로그램을 완성하시오.

	//1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
 	int answer = (int)Math.random()*100 + 1;
	int input = 0; // 사용자 입력을 저장할 공간.
	int count = 0; // 시도횟수를 세기위한 변수.
	//화면으로부터 사용자입력을 받기 위해서 Scanner 클래스 사용.
	java.util.Scanner s = new java.util.Scanner(System.in);
	do {
		count++;
		System.out.println("1과 100사이의 값을 입력하세요: ");
		input = s.nextInt(); //입력받은 값을 변수 input에 저장한다.	
		if (input == answer) {
			System.out.println("정답입니다.");
			break;
		}else {
			System.out.println("틀렸습니다 다시 입력해주세요.");
		}
	
	} while (true); //무한 반복문
 */

/* 12.while 문과 Scanner의 nextLine ( ) 메소드를 이용해서 
 * 다음 실행 결과와 같이 키보드로부터 입력된 데이터로 
 * 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		 
		while (run) {
			System.out.println("---------------구분선-----------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------구분선-----------");
			System.out.println("선택: ");

			String strNum = scanner.nextLine();

			if (strNum.equals("1")) {
//				System.out.println("선택> 1");
//				System.out.println("예금할 금액을 입력해주세요.");
				String data = scanner.nextLine();
				System.out.println("선택> 1");
				System.out.println("예금액: " + data );
			} else if (strNum.equals("2")) {
//				System.out.println("선택> 2");
//				System.out.println("출금할 금액을 입력해주세요.");
				String data = scanner.nextLine();
				System.out.println("선택> 2");
				System.out.println("출금액: " + data );
			} else if (strNum.equals("3")) {
//				System.out.println("선택> 3");
//				System.out.println("잔고에 표시할 금액을 입력해주세요.");
				String data = scanner.nextLine();
				System.out.println("선택> 3");
				System.out.println("잔고: " + data );
			} else if (strNum.equals("4")) {
				System.out.println("선택> 4");
				
				System.out.println("프로그램 종료");
				run = false;
				break;
			}


 */
//	boolean run = true;
//	int balance = 0;
//	Scanner scanner = new Scanner(System.in);
//	while(run) {
//		System.out.println("---------------구분선-----------");
//		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//		System.out.println("--------------구분선-----------");
//		System.out.println("선택> ");
//		int menuNum = scanner.nextInt();
//		switch (menuNum) {
//		case 1:
//			System.out.println("예금액> ");
//			balance += scanner.nextInt();
//			break;
//		
//		case 2:
//			System.out.println("출금액> ");
//			balance -= scanner.nextInt();
//			break;
//		case 3:
//			System.out.println("잔고> ");
//			System.out.println(balance);
//			break;
//		case 4:
//			run = false;
//			break;
//		}
//		System.out.println();
//		}
//		System.out.println("프로그램 종료");
//
		
	
	
	
	}}