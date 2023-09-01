package oop.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		//외부에서는 아래처럼 객체를 생성하지 못하게 하겠다!!
//		Singleton s = new Singleton();
//		s.method1();
//		s.method2();
		// 단 하나뿐인 생성자에 private 붙여서 해결!
		
		Singleton s1 = Singleton.getInstance();
		s1.method1();
		s1.method2();
		
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
