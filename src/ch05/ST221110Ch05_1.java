package ch05;


import java.lang.reflect.Array;

public class ST221110Ch05_1 {

	public static void main(String[] args) {
/* 
1. 참조 타입에 대한 설명으로 틀린 것은 무엇입니까?
답 : 4번 // null값으로 초기화 할 수 있었음.
➊ 참조 타입에는 배열, 열거, 클래스, 인터페이스가 있다.
➋ 참조 타입 변수의 메모리 생성 위치는 스택이다.
➌ 참조 타입에서 ==, != 연산자는 객체 번지를 비교한다.
➍ 참조 타입은 null 값으로 초기화할 수 없다.
*/
/*
2.자바에서 메모리 사용에 대한 설명으로 틀린 것은 무엇입니까?  
답 : 3번 // 자동제거 했던것 같음.
➊ 로컬 변수는 스택 영역에 생성되며 실행 블록이 끝나면 소멸된다.
➋ 메소드 코드나 상수, 열거 상수는 정적(메소드) 영역에 생성된다.
➌ 참조되지 않는 객체는 프로그램에서 직접 소멸 코드를 작성하는 것이 좋다.
➍ 배열 및 객체는 힙 영역에 생성된다.
*/
/*
3. String 타입에 대한 설명으로 틀린 것은 무엇입니까?  
답 : 2번 // String 문자열 비교는 equals 사용.
➊ String은 클래스이므로 참조 타입이다.
➋ String 타입의 문자열 비교는 ==를 사용해야 한다.
➌ 동일한 문자열 리터럴을 저장하는 변수는 동일한 String 객체를 참조한다.
➍ new String (“문자열”)은 문자열이 동일하더라도 다른 String 객체를 생성한다.
*/
/*
4. 배열을 생성하는 방법으로 틀린 것은 무엇입니까?  
답 : 2번 // 이미 선언된 배열은 array = new int[] {1,2,3}; 으로 생성해야.
➊ int[ ] array = { 1, 2, 3 };
➋ int[ ] array; array = { 1, 2, 3 };
➌ int[ ] array = new int[3];
➍ int[ ][ ] array = new int[3][2];
*/
/*
5. 배열의 기본 초기값에 대한 설명으로 틀린 것은 무엇입니까?
답 : 3번 // boolean타입 배열 항목의 기본 초기값은 false 
➊ 정수 타입 배열 항목의 기본 초기값은 0이다.
➋ 실수 타입 배열 항목의 기본 초기값은 0.0f 또는 0.0이다.
➌ boolean 타입 배열 항목의 기본 초기값은 true이다.
➍ 참조 타입 배열 항목의 기본 초기값은 null이다.
 */
/*
6. 다음은 배열의 길이를 출력하는 코드이다. 실행결과를 예상하고 작성해 보시오.
int[ ][ ] array = {
    { 95, 86 },
    { 83, 92, 96 },
    { 78, 83, 93, 87, 88 },
}
System.out.println(array.length);    답 3
System.out.println(array[2].length); 답 5
*/

/*
7.다음 배열에 담긴 값을 모두 더하는 프로그램을 만드시오(for 문 이용).
int[] arr = {10, 20, 30, 40, 50};
int sum = 0;
for (int i = 0; i < arr.length; i++) {
	sum += arr[i];
}
System.out.println(sum);
*/

/*
8. 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요(for 문 이용).
int[] array = { 1, 5, 3, 8, 2 };		
int max = 0;
for (int i = 0; i < array.length; i++) {
if(max < array[i]){
max = array[i];
}}
System.out.println(max);
*/
/*
9.주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요(중첩 for 문 이용).
		int[][] array = {
		      {95, 86},
		      {83, 92, 96},
		      {78, 83, 93, 87, 88}
		};
		int totalStudent = 0;
		int totalSum = 0;
		int totalAvg = 0;
		
		for (int i = 0; i < array.length; i++) {
			totalStudent += array[i].length; // 학생 수
			for (int j = 0; j < array[i].length; j++) { //i 가 0일때는 1반, i가 1일때는 2반을 돔.
				totalSum += array[i][j];
				totalAvg = totalSum / totalStudent;
			}
		}
		System.out.println("배열 항목의 합: "+totalSum+" 배열 항목의 평균: "+totalAvg);
*/

/*
10. 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다. 
( )에 알맞은 코드를 넣어서 프로그램을 완성하시오.
[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
*/	
int[] ballArr = {1,2,3,4,5,6,7,8,9};
int[] ball3 = new int[3];
//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
for (int i = 0; i < ballArr.length; i++) {
	int j = (int) (Math.random() * ballArr.length);
	int tmp = 0;    
	tmp = ballArr[i];
	
	ballArr[i] = ballArr[j];
	
	ballArr[j] = tmp;
	
}
	//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
	System.arraycopy(ballArr, 0, ball3, 0, 3);

	for (int i = 0; i < ball3.length; i++) {
		System.out.println(ball3[i]);
	}
	System.out.println();

}
}