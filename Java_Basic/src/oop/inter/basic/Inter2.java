package oop.inter.basic;

// 클래스가 상속 가능한 것처럼 인터페이스도 extends를 사용하여 인터페이스 간의 상속을 구현할 수 있습니다.
// 인터페이스들끼리는 다중 상속도 가능합니다.
public interface Inter2 extends ParentInter {

	int I = 5; // static final
	
	//컴파일 과정에서 자동으로 abstract가 붙어서 컴파일됨
	void method2(); // abstract
	
	
	
	
	
}
