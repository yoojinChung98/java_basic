package oop.static_.singleton;

public class Singleton {

	/*
	  # 싱글톤 디자인 패턴: 클래스의 객체를 단 1개로 제한하기 위한 코드 디자인 패턴.(성능 최적화를 위해)
	  
	  1. 외부에서 이 클래스의 객체를 생성하지 못하게 생성자를 단 1개만 선언하고, private 접근 제한을 붙임.
	 */
	private Singleton() {
		System.out.println("객체 생성 완료");
	}
	
	//2. 생성자를 호출할 수 있는 영역은 같은 클래스 내부 뿐이므로 자신의 클래스 내부에서 스스로의 객체를 단 1개만 생성함.
	private static Singleton s = new Singleton();
	
	//3. 외부에서 이 클래스의 객체를 요구할 시, 2번에서 미리 만들어 놓은 단 하나의 객체의 주소값을 공개된 메서드를 통해서 리턴합니다.
	public static Singleton getInstance() { // 관례. 싱글톤주소를 주는 메서드의 이름은 getInstance
		return s;
	}
	
	//4. 외부에서 객체를 생성하지 않고 얘를 부르기 위해  static으로 메서드와 생성자를 설정해주고 
	// 근데 그럼 s가 static이 되어버리는데, 이러면 s에 직접접근이 가능해지므로 s에 null값 넣으면 어떡할건데...private으로 바꿈.
	
	
	///////////////////////////////////////////////
	
	public void method1() {
		System.out.println("여러 군데에서 쓰이는 굉장히 중요한 메서드");
	}
	
	public void method2() {
		System.out.println("프로그램 내에서 꼭 한번 불러야 하는 귀한 메서드");
	}
	// 메모리 누수. 객체생성속도가 GC보다 더 빨라져서 메모리가 줄줄 새는... 잘 이해 모담
	
	
}
