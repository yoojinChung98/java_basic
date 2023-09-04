package oop.inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스는 객체를 생성할 수 없는 추상적인 개념입니다.
		//Cannot instantiate the type Inter
//		Inter i1 = new Inter(); (X)
		
		//static 데이터 호출은 가능.
		System.out.println("상수: "+Inter.NUM);
		Inter.staticMethod();
		
		ImplClass1 i1 = new ImplClass1();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.parenteMethod();
		
		System.out.println("----------------------------------------");
		
		/*
        - 다형성은 상속이 전제되어야 하는 것이 원칙이지만
         예외로 인터페이스와 클래스간의 구현 관계에서도
         다형성 발생을 허용합니다.
         인터페이스 변수 = new 객체();
        */

		//인터페이스에 구현 객체가 들어옴
		Inter it1 = new ImplClass1();
		it1.method1();
//		it1.method2(); // Inter 인터페이스에는 method2가 없으므로 사용불가
//		it1.method3(); // ImplClass1이 가지고 있는 method라 없어서 사용불가
		it1.parenteMethod(); // 부모로 상속받은 거라 사용 가능.
		
//		(ImplClass1)it1.method2(); //연산자의 우선순위로 에러가 뜸.
		//(참조연산자 . 의 우선순위가 더 높으므로 it1의 형변환이 늦게 발생(it1.method2())부터 하려고 해서 에러가 뜸)
		((Inter2)it1).method2();
		
		Inter2 it2 = new ImplClass1();
		it2.method2();
		it2.parenteMethod();
		((Inter) it2).method1(); // 다른 인터페이스로 형변환
		((ImplClass1) it2).method3(); // 자기 클래스타입으로 형변환
		
		Inter it3 = new ImplClass2();
		Inter it4 = (Inter) new ImplClass3();
		it4.method1();
		
		ParentInter[] inters = {it1, it2, it3, it4};
		// 얘네들이 구현하는 인터페이스가 모두 ParentInter에서 상속된 인터페이스라서 부모 인터페이스 타입으로 모두 담을 수 있음.
		
		
		//연산자의 우선순위
		//괄호() -> 참조(.) -> 단항 -> 2항 -> 3항 -> 대입
		
		
		/*
        - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
         정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.
         
        - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
         구현하는 클래스들끼리 서로 즉시 형 변환이 가능합니다.
        */
		
		
	}

}
