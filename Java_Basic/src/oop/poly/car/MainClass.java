package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {

		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		s1.run(); s2.run(); s3.run(); p1.run(); p2.run(); p3.run();
//		t1.run(); t2.run(); t3.run(); t4.run();
		
//		Sonata[] sonatas = {s1, s2, s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		// 다형성을 적용해서 이종모음 배열을 선언할 수 있다!
		// 메서드 이름이 같네? 어 부모가 같나??? 오~~ 다형성!!!!
		Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
		// s1의 변수형이 Sonata에서 Car로 형변환이 일어나며 배열로 들어감!
		for(Car c : cars) {
			c.run();
		}
		
		
		
		System.out.println("----------------------------");
		//멤버 변수의 다형성 발생
		
		System.out.println("*** 타이어 교체 작업! ***");
		t1.frontLeft = new HTire();
		t1.frontRight = new HTire();
		t1.rearLeft = new HTire();
		t1.rearRight = new HTire();
		
		
		
		
		System.out.println("----------------------------");
		//매개 변수의 다형성 발생
		
		Driver kim = new Driver();
		kim.drive(s2);
		kim.drive(t3);
		kim.drive(p1);
		
		
		
		
		System.out.println("----------------------------");
		//리턴값의 다형성 발생
		
		Car c1 = kim.buyCar("테슬라");
		c1.run();
		Car c2 = kim.buyCar("포르쉐");
		c2.run();
		
	}

}
