package ch02;


public class ST221108CH02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	1번문제[
   논리형 1byte = boolean 
   문자형 2byte = char
   정수형 2,4,8byte = short int long
   실수형 4,8byte = float double
 
*/	
	
		
		
/* 2번문제 : 타입변환시 허용범위가 큰 순 -> 작은 순
  byte < short,char < int < long < float < double 
 */


		
/* 3번문제 : 출력결과를 예상 후 코드 실행
System.out.println(“1” + “2”) → ( )  12
System.out.println(‘A' + 'B') → ( )  65,66 -> 131
System.out.println('1' + 2) → ( )    char 1 -> 49   + 2  ==> 51
System.out.println('1' + '2') → ( )  char 1 -> 49, char 2 -> 50  ==> 99
System.out.println('J' + “ava”) → ( ) Java
  
*/		
		

		
		
/* 4번문제 : 다음 자동 타입 변환에서 컴파일 에러가 발생하는 것을 선택하세요.  : 정답 : 3번
 * 이유 : char와 short는 동일크기(?)이지만 서로가 서로로 갈 수 없음. 강제로 형변환해야.
 * 선생님 : short의 범위는 -215 ~ 215-1(-32768~32767)이고 char의 범위는 0~216-1(0~65535)이므로 서로 범위가 달라서 둘 중 어느 쪽으로의 형변환도 값 손실이 발생할 수 있으므로 자동적으로 형변환이 수행될 수 없다.
byte byteValue = 10;
char charValue = ‘A’;


➊ int intValue = byteValue; 
➋ int intValue = charValue;
➌ short shortValue = charValue; 
➍ double doubleValue = byteValue;
*/

		
		
/* 5번문제 : 다음 강제 타입 변환에서 컴파일 에러가 발생하는 것을 선택하세요.  : 정답 : 4번
 * 이유 : char의 값은 문자처럼 보이지만 사실 숫자임. 따라서 String 문자열 A를 그대로 가져와봤자 쓸 수가 없음.
 * 선생님 : *String은 클래스이고 char는 2byte로 정수로 이루어진 기본형 타입(primitive type)중에 하나이다.

int intValue = 10; 
char charValue = 'A'; 
double doubleValue = 5.7; 
String strValue = "A";

 
➊ double var = (double) intValue; 
➋ byte var = (byte) intValue; 
➌ int var = (int) doubleValue; 
➍ char var = (char) strValue;
 
*/	


/* 6번문제 : 연산식의 타입 변환 중에서 컴파일 에러가 발생하는 것을 선택하세요. : 정답 : 1번
 * 이유 : 연산하면 자동으로 int형이 되버려서 byte에서 쓰려면 강제형변환 없이 못씀. byteValue라고 쓰여있지만 사실은 int값인것.
byte byteValue = 10; 
float floatValue = 2.5F; 
double doubleValue = 2.5;

➊ byte result = byteValue + byteValue; 
➋ int result = 5 + byteValue; 
➌ float result = 5 + floatValue; 
➍ double result = 5 + doubleValue;
    
*/
		
		
/* 7번문제 : 문자열을 기본 타입으로 변환하는 코드로 틀린 것을 고르세요. : 정답 : 2번
 * 이유 : Int형의 기본타입 변환코드는 Integer.parseInt(str); 이다.
String str = “5”;

➊ byte var1 = Byte.parseByte(str); 
➋ int var2 = Int.parseInt(str); 
➌ float var3 = Float.parseFloat(str); 
➍ double var4 = Double.parseDouble(str)
 
*/
		
		
		
/* 8번문제 : 다음 코드에서 컴파일 에러가 나는 라인을 모두 적어보세요.  
 * 이유 : v3를 설정한 if 밖에서 v3를 쓸수없으며 v2또한 v2를 설정한 if 밖에서 v2를 쓸수없다.
 * 다만, if 내부에서는 외부에 선언한 변수를 가져오는것이 가능하다.
 * 선생님 : 자바는 변수가 해당 중괄호의 범위를 벗어나면 사용할 수 없다.
 int v1 = 1;
 System.outprintln("v1: " + v1);
 if(true) {
 	int v2 = 2;
 	if(true) {
 		int v3 = 2;
 		System.outprintln("v1: " + v1);
 		System.outprintln("v2: " + v2);
 		System.outprintln("v3: " + v3);
 	}
 	System.outprintln("v1: " + v1);
 	System.outprintln("v2: " + v2);
 	System.outprintln("v3: " + v3);       오류
 }
 System.outprintln("v1: " + v1);
 System.outprintln("v2: " + v2);          오류
 
 */		

		
		
/* 9번 다음의 문장에서 리터럴,  변수,  키워드를 구분하여 적으시오.
int a = 20;
double num = 1.2;
char ch = ‘a’;

 -리터럴: 20, 1.2, a
 -변수: a num ch
 -키워드: int double char

*/	

		
		

/* 10번 다음 중 변수를 잘못 초기화 한것은? 정답 : 1,2,3번
 * 1번이유: byte의 범위는 -128~127  256은 over이므로 초기화 할 수 없음.
 * 2번이유: char은 반드시 한개의 문자를 지정해야 한다.
 * 3번이유: char 는 1글자만 사용 가능.
 * 4번: double에 float값을 넣는것은 가능하다. 
➊ byte b = 256; 
➋ char c = '';     
➌ char answer = 'no';  
➍ double d = 1.4e3f; 

   
 */


		
		
/* 11번 다음 중 형변환을 생략할 수 있는 것은?  정답 : 4번 
 * 2번이 아닌 이유 : 
 * //char타입의 허용범위에는 음수가 포함되어있지 않음. 0 ~ 65535
   //그런데 byte의 허용범위에는 음수가 포함되어있음. -128 ~ 127

 * 4번 : 낮은것을 상위로 형변환하는것은 자동이기때문에 생략 가능.
byte b = 10; 
char ch = 'A';
int i = 100; 
long l = 1000L;

➊ b = (byte)i;           int -> byte     반드시 형 변환 필요.    
➋ ch = (char)b;    		 byte -> char    허용범위가 다르므로 형 변환 필요.
➌ short s = (short)ch;   char -> short   같은 2byte이지만 범위가 달라서 형 변환 필요.
➍ i = (int)ch;           ch -> int       하위에서 상위로 가는것은 생략 가능.

 
 */
		
		
		
		
		
		
		System.out.println("아니라고해");
		
		
		

	}

}
