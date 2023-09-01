package oop.static_.method;

public class Count {

	public int a; // 인스턴스 변수
	public static int b; //정적 변수
	
	/*
    # 인스턴스 메서드: 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드
     인스턴스 메서드 안에서는 정적(static) 변수와
     인스턴스 변수 모두를 참조할 수 있습니다.
    */
	public int method1() {
		return this.a + Count.b;
	}
	
	
	
	/*
    - static블록(메서드, 정적 초기화자) 내부에서는
     static이 붙은 변수나 메서드만 사용할 수 있습니다.
     this는 사용할 수 없습니다. -> 나타낼 주소값이 없기 때문 -> 객체 생성 없이도 호출되기 때문.
     
    - static 블록 내부에서 non-static멤버를 사용하려면
     반드시 객체를 생성해서 주소값을 통해 참조해야 합니다.
    */
	public static int method2() {
		Count ccc = new Count();
		return ccc.a + Count.b;
		// static 메서드를 호출할 때 주소가 쓰이지 않으므로(클래스명.메서드()) this.a에서 는 어떤 주소를 참조해야해...?
		// + 객체를 생성하지 않고도 static을 호출할 수 있으므로 애초에 말이 안돼
		
		// 참고로 같은 클래스 내부에서 static메서드를 부를 땐, 클래스 이름을 생략해도 ㄱㅊ, 다른 클래스 static 부르려면 알짤없음.
	}
	
}
