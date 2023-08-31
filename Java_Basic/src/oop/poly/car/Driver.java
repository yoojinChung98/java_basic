package oop.poly.car;

public class Driver {
	
	//메서드 오버로딩
//	public void drive(Sonata s) {
//		System.out.println("운전을 시작합니다.");
//		s.run();
//	}
//	
//	public void drive(Porsche p) {
//		System.out.println("운전을 시작합니다.");
//		p.run();
//	}
//	
//	public void drive(Tesla t) {
//		System.out.println("운전을 시작합니다.");
//		t.run();
//	}
	
	
	// 다형성을 이용하면 오버로딩을 하지 않아도 돼! = 타입의 규격화
	public void drive(Car c) {
		System.out.println("운전을 시작합니다.");
		c.run();
	}
	
	
	// 리턴타입 다형성 예시.
//	public Tesla buyTesla() {
//		System.out.println("테슬라를 구입합니다.");
//		return new Sonata();
//	} //리턴 타입과 맞지 않아 불가넝
	
	public Car buyCar(String name) {
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다.");
			return new Sonata();			
		} else if(name.equals("포르쉐")) {
			System.out.println("포르쉐를 구입합니다.");
			return new Porsche();			
		} else if(name.equals("테슬라")) {
			System.out.println("테슬라를 구입합니다.");
			return new Tesla();			
		} else {
			System.out.println("무슨 차량을 구입하시는거죠?");
			return null;
		}
	}


}
