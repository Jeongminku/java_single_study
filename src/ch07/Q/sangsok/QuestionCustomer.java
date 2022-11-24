package ch07.Q.sangsok;

public class QuestionCustomer {
}


/*
고객 등급 만들기
어느 마트에서 고객 등급별 보너스 포인트와 가격을 알려주는 프로그램을 개발하려고 한다. 
마트 주인이 원하는 고객 등급별 규정은 아래와 같으며 VIP는 둘 중 어떤걸 적용할지 모른다고 한다. 
아래 내용들을 참고하여 프로그램을 완성하시오.

고객등급 :  실버   골드   vip 	VIP    vip와 VIP 뭐를 할지 모른다고함. (다형성 활용)
보너스비율: 0.01  0.02  0.05  0.03
할인율:      X    0.1   0.1   0.2
담당상담원
지원여부     X     X     O     O





자바 파일은 각각 CustomerApplication.java, Customer.java, GoldCustomer.java, VIPCustomer.java 파일을 작성한다.



VIP는 마트 주인이 아직 어떤걸 적용할지 모른다고 했기 때문에 VIPCustomerOther.java라는 이름으로 하나 더 생성해 코드를 작성해 놓는다.



CustomerApplication.java에서 ArrayList를 이용하여 Customer 객체를 관리한다.



파일을 작성하며 클래스 구조 및 사용되는 필드, 생성자, 메소드는 위의 클래스 다이어그램과 같다.



CustomerApplication.java는 main 메소드로 프로그램을 실행하는 클래스다.



Customer는 고객 객체를 생성할수 있는 클래스며 Silver등급을 기본으로 한다.



Customer는 부모 클래스이며 GoldCustomer, VIPCustomer, VIPCustomerOther는 자식클래스다.
										0.5vip       0.03VIP



*/