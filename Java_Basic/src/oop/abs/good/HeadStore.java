package oop.abs.good;

public abstract class HeadStore {

	/*
    # 추상 클래스, 추상 메서드
    
    1. 추상 클래스의 메서드에 abstract를 붙이면 해당 메서드는
     실체가 없는 추상 메서드가 되며, 이 메서드는 상속을 통해 자식 클래스에서
     무조건 오버라이딩을 하도록 강요됩니다.
     
    2. 추상메서드는 실체가 존재하지 않는 틀 역할을 하기 때문에
     메서드의 바디 ({})부분이 없고, 세미콜론으로 메서드 선언을 마감합니다.
     
    3. 일반 클래스에서는 추상 메서드를 선언할 수 없습니다. 추상 메서드가
     하나라도 존재하는 경우에는 반드시 해당 클래스를 추상 클래스로 선언해야 합니다.
    
    4. 추상 클래스에 추상 메서드만을 선언할 필요는 없습니다.
     일반 멤버변수 및 메서드도 얼마든지 선언이 가능합니다.
     
     - 기본 베이스는 상속이며 자식 클래스에서의 오버라이딩을 강요하기 위함.
     (무조건 오버라이딩이 필요하거나, 메서드의 내부를 어떻게 작성해야할지 모르겠거나(자식 클래스에서 어떻게 쓸지 잘 몰겠음), 내부를 적을 필요성이 없을 때)
    */
	
	public String name;
	
	public HeadStore() {
		System.out.println("HeadStore의 생성자!");
	}
	
	public abstract void orderApple();
	public abstract void orderBanana();
	public abstract void orderGrape();
	
	public void orderWatermelon() {
		System.out.println("수박 쥬스의 가격은 4000원 입니다.");
		
		/*
        - 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에
         프로그래머의 오버라이딩 실수를 방지할 수 있고, 부모 클래스에서
         메서드를 선언할 때 메서드 내부에 어떤 내용을 써야 할 지 막연할 때도
         구현하기가 편합니다.
         
        - 다형성을 적용시켰을 경우에도 안전하게 사용이 가능합니다.
        */	
		
		
	}
	
	
}
