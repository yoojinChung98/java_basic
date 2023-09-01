package oop.static_field;

public class MainClass {

	public static void main(String[] args) {
		Count c1 = new Count();
		
		c1.a += 5;
		c1.b += 5;
		
		System.out.println("인스턴스 변수 c1.a: "+c1.a);
		System.out.println("정적 변수 c1.b: "+c1.b);
		
		System.out.println("--------------------------------------");
		
		Count c2 = new Count();
		
		c2.a += 7;
		c2.b += 7;
		
		System.out.println("인스턴스 변수 c2.a: "+c2.a);
		System.out.println("정적 변수 c2.b: "+c2.b);
		
		System.out.println("--------------------------------------");
		
		Count c3 = new Count();
		
		c3.a += 8;
		c3.b += 8;
		
		System.out.println("인스턴스 변수 c3.a: "+c3.a);
		System.out.println("정적 변수 c3.b: "+c3.b);
		System.out.println("정적 변수 c1.b: "+c1.b);
		System.out.println("정적 변수 c2.b: "+c2.b);
		
		/*
		 - static 이 붙은 데이터는 그 static 데이터가 선언된 클래스의 이름으로 바로 참조할 수 있습니다.
		 - 일반 멤버변수(필드)와 혼동할 가능성이 있기 때문에 주소값으로 접근하지 않습니다.
		 - static은 객체와 무관하고 따로 저장되는 공간이 있으므로 주소값이 필요하지 않음 (즉, 객체를 생성하지 않아도 접근 가능)
		 - 그리고 모든 (클래스)객체가 이 하나의 변수를 공유하는 형태!
		 */
		
		Count.b += 2;
		
		System.out.println("정적 변수 Count.b: "+ Count.b); // 클래스의 이름으로 참조하는 것이 올바른 참조.
		
		

		
		
	}

}
