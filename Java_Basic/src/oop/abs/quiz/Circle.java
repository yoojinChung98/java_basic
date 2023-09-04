package oop.abs.quiz;

public class Circle extends Shape {

	private int radius;
	
	public Circle(String name, int radius){
		super(name);
//		this.radius = radius; // 같은 클래스니까 굳이 setRadius 쓰지 않아도 되는데, 나는 조건 걸어놨네?
		setRadius(radius);
		System.out.printf("반지름이 %d인 원이 생성되었습니다.\n", this.radius);
	}
	
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		if(radius<=0) {
			System.out.println("잘못된 값이 입력되었습니다.(음수 입력)\n");
			return;
		}
		this.radius = radius;
	}
}
