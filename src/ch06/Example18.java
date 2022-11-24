package ch06;

class Example18 {
int iv = 10;
static int cv = 20;
int iv2 = cv;
static int cv2 = iv; // 라인 A - 컴파일 에러     --- static변수의 초기화에 인스턴스변수를 사용할 수 없다.

static void staticMethod1() {
System.out.println(cv);
System.out.println(iv); // 라인 B - 컴파일 에러 --- 스태틱 메소드에 인스턴스변수를 사용할 수 없다.
}

void instanceMethod1() {
System.out.println(cv);
System.out.println(iv); // 라인 C
}

static void staticMethod2() {
staticMethod1();
instanceMethod1(); // 라인 D - 컴파일 에러 --- 스태틱 메소드에 인스턴스 메소드를 사용할 수 없다.
}

void instanceMethod2() {
staticMethod1(); // 라인 E
instanceMethod1();
}

}

//파일에 컴파일 에러 있는거 정상임.