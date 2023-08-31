package oop.poly.basic;

/*
- 자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있습니다.
 밀접한 연관이 있는 클래스를 모아 놓기 위해 사용합니다.
- 단, 파일명과 동일한 클래스가 반드시 존재(해당 클래스만 퍼블릭을 가질 수 있음)해야 하고,
 해당 클래스만 public으로 선언할 수 있습니다.
*/
//각각의 클래스가 진짜 밀접할 때는 이렇게 한 파일에 여러 클래스를 선언하기도 함.
class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	/*
	 - 다형성이란 자식 객체가 모든 부모의 타입을 가질 수 있다는 것을 의미.
	 
	 - 즉, 부모 타입 변수에 자식 객체의 주소값을 얼마든지 저장할 수 있다는 것을 의미
	 */
	
	// 라잌 형변환 (하위 타입의 값이 상위 타입으로 형변환)
	A v1 = new B(); // 클래스 타입 B -> A타입으로 자동 형 변환(promotion)
	// VM이 이걸 보면...
	// 1. A와 B가 부모와 자식 관계인지 확인(상속 관계 확인)
	// 2. 누가 상위타입인지 확인. 음! A가 상위타입이고...
	// 3. 하위타입을 상위타입으로 변환시켜서 넣으면 되겠다! ><
	
	A v2 = new C();
	A v3 = new D(); // D는 B의 자식이고, B는 A의 자식이니, 상속관계는 연결되므로 가넝~
	A v4 = new E();
	A v5 = b;
	
	B v6 = new D();
	C v7 = new E();
	// v6에 담겨있는 주소값은 D타입에도, B타입에도, A타입에도, Object타입에도 다 넣을 수 있다!
	
	//상속 관계가 없다면 다형성 적용이 불가능!
	// 즉, 다형성은 무조건 상속 관계 하에서만 발생한다
//	B v8 = new C();  // (x) 둘은 아무 관계도 아님
//	C v9 = new D(); //(x) D는 B의 자식! C랑 아무 관계 없음
//	B v10 = new E(); // (x)
//	D v11 = new E(); //(X)
	
	// Object는 자바의 최상위 클래스입니다.
	// 모든 클래스는 결국 Object의 자식입니다.
	// Object타입의 변수에는 어떠한 객체도 들어올 수 있습니다.
	Object o1 = new A();
	Object o2 = new B();
	Object o3 = new C();
	Object o4 = new D();
	Object o5 = new E();
	Object o6 = new String("안녕하세요!");
	Object o7 = new Basic();

}
