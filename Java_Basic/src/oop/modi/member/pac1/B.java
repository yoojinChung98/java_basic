package oop.modi.member.pac1;

public class B {
	
	public B() {
		
		A a = new A();
		a.x = 1;
		a.y = 2;
//		a.z = 3; // private이라서 안됨
		
		a.method1();
		a.method2();
//		a.method3(); // private라서 안됨
		
	}

}
