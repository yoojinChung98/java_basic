package oop.abs.good;

public class MainClass {

	public static void main(String[] args) {
		
		// 추상 클래스는 스스로의 객체 생성이 불가능합니다.
		// 하지만, 추상 클래스의 객체가 아예 새엇잉 안 되는 것이 아니라
		// 자식 객체를 통해 실체화가 가능합니다.
		// 즉, 스스로는 생성이 될 수 없지만 자식 클래스가 생성되면서 부모인 추상클래스도 함께 생성됨.
//		HeadStore h = new HeadStore(); (X)
		

		HeadStore s = new SeoulStore();
		
		s.orderApple();
		s.orderBanana();
		s.orderGrape();
		s.orderWatermelon();
		
	}

}
