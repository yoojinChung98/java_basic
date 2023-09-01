package oop.abs.quiz;

public class Rect extends Shape {

	
	
	private int side;
	
	Rect(String name, int side){ //이름과 변의 길이를 받는 생성자
		setName(name);
		setSide(side);
		System.out.printf("길이가 %d인 정사각형이 생성되었습니다.\n", this.side);
	}
	

	@Override
	double getArea() {
		double area = this.side * this.side;
		return area;
	}


	public int getSide() {
		return side;
	}
	
	public void setSide(int side) {
		if(side <0) {
			System.out.println("잘못된 값이 입력되었습니다.(음수 입력)\n");
			return;
		}
		this.side = side;
		
		
		
	}


	
	
	
	

	
	
}
