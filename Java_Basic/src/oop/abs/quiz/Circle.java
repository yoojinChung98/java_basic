package oop.abs.quiz;

public class Circle extends Shape {

	int radius;
	
	Circle(String name, int radius){
		setName(name);
		setRadius(radius);
		System.out.printf("반지름이 %d인 원이 생성되었습니다.\n", this.radius);
	}
	
	
	@Override
	double getArea() {
		double area = this.radius * this.radius * Math.PI;
		return area;
	}

	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		if(radius<0) {
			System.out.println("잘못된 값이 입력되었습니다.(음수 입력)\n");
			return;
		}
		this.radius = radius;
	}
}
