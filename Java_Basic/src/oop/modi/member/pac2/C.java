package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {
	
	public C() {
		
		A a = new A();
		a.x = 1; //public 은 다른 패키지도 가능!
//		a.y = 2; //default는 다른 패키지라서 컷
//		a.z = 3; //private는 같은 클래스 아니면 다 컷
		
		a.method1(); // 아 public은 누구에게나 open door~~~
//		a.method2(); // default는 기본적으로 다른 패키지면 컷
//		a.method3(); // private는 걍... 클래스 다르면 아무도 못써...
		
		
	}

}
