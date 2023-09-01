package oop.final_.method;

public class Child extends Parent{

	@Override
	void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	} //import가 없으면 같은 패키지가 우선.

	

//	void method3() {
//		System.out.println("오버라이딩 해야지~");
//	}   ->  final 메서드는 오버라이딩을 막음. (물려주는 대로 써
	
}
