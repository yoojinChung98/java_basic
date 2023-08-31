package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A{ //만일 A의 클래스가 protected라면... extends A 자체가 불가능... 아직 자식클래스가 아닌데 얘를 어떻게 지목해서 자식클래스로 만들래...? 

//	A a1 = new A(30); // protected 자식 클래스만 가능
//	A a2 = new A(5.67); // default 다른패키지라서 불가능
	A a3 = new A(true); // public은 역시 가능!
//	A a4 = new super.A(30); // ㅈㄹㄴ
	
	// 자 봐! 부모 클래스를 지목하는 방법은 super밖에 없는데, super는 이미 만들어진 부모 인스턴스를 참조하는 것 밖에 못하고...
	// 생성 자체부터 부모 클래스를 지목할 방법이 아예 없는데! 어떡할거야? 그러니가 protected는 클래스에 사용할 수 없는거야!
	
	public C() {
		
		/*
		 - protected 제한자는 패키지가 다른 경우, 두 클래스 사이에 상속 관계가 있다면
		     super 키워드를 통해 참조를 허용.
		 */
		
		super(30);
//		super(5.67); // defualt는 안돼
		super.x = 1;
//		super.y = 2; // default
		super.method1();
//		super.method2(); // defualt
		
	}
	
}
