package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2; // 부모는 자식이 갖고있는 무엇도 알 수 없으므로 n2는 사용 불가
		p.method1();
		p.method2();
//		p.method3(); //부모는 자식의 메소드도 알 수 없음.
		
		System.out.println("---------------------------------------");
		
		Child c = new Child();
		c.n1 = 1; // 부모에게 물려받은 속성
		c.n2 = 2; // 자식의 고유 속성
		
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("----------------------------------------");
		
		//다형성 적용(promotion)
		Parent p2 = new Child();
		// Parent 라는 객체를 참조하고 있는 참조변수 p2. 정보임. 아! p2가 참조하고 있는 곳에는 Parent라는 객체가 들어있겠구나!
		p2.n1 = 1;
//		p2.n2 = 2; (x)
		
		p2.method1();
		p2.method2(); // 자식객체 클래스에서 재정의한 method2가 호출됨.
		// 일단 Parent는 method2의 존재를 알고 있고, 그 중에 실체인 Child가 갖고있는 method2가 호출되는 것...? 
//		p2.method3();
		
		/*
		 - 다형성이 적용되면 자식 클래스의 본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
		 - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
		 */
		
		Child c2 = (Child) p2; // 부모 타입을 자식 타입으로 강제 변환(Downcasting)
		c2.n2 = 2;
		c2.method2();
		c2.method3();
		System.out.println("p2의 주소값: "+p2);
		System.out.println("c2의 주소값: "+c2);
		
		Object o = new String("안녕하세요~~");
		String str = (String)o;
		System.out.println("문자열의 길이: "+str.length());
		
		// 다형성이 한 번도 발생하지 않은 경우에는 강제 형 변환을 사용할 수 없습니다.
		// 라기보다는, 내가 생각하는 방식으로 정리하면. 애초에 부모타입으로 생성한 객체를 갑자기 자식객체로 형변환을 할 수는 없다!
		Parent ppp = new Parent();
//		Child ccc = (Child) ppp; //(x) 불가능. 만약의 윗행 문장을 Parent ppp = new Child();로 하면 55행 코드 가능.
		// 자식객체를 생성할 땐 부모객체 + 자식객체 생성 -> 부모타입으로 변형 가능(왜냐면 같이 생성되었으니까 옮겨줄 연결다리 댈 수 있음)
		// 근데 부모객체를 생성하면 부모객체만 생성되고 자식객체 존재X -> 존재하지도 않은 것으로 변형 불가능(없으니까 옮겨줄 연결다리도 못댐)
		
		
		Child cc = new Child();
		Parent pp = cc;
		
	}

}
