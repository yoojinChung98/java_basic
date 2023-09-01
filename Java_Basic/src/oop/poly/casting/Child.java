package oop.poly.casting;

public class Child extends Parent {

	public int n2; // 자식 고유의 필드
	// 부모는 n2의 존재를 알 수 없음.
	
	@Override
	public void method2() {
		System.out.println("재정의한 2번 메서드 호출!");
		
	}
	
	public void method3() { // 자식 고유의 메서드. 역시나 부모는 method3의 존재 여부조차 모름
		System.out.println("자식 고유의 3번 메서드 호출!");
	}
	
	
	
}
