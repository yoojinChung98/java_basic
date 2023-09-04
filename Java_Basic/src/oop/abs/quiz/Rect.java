package oop.abs.quiz;

public class Rect extends Shape {

	
	private int side;
	private int width;
	private int height;
	
	public Rect(String name, int side){ //이름과 변의 길이를 받는 생성자
		super(name);
		setSide(side);
		System.out.printf("길이가 %d인 정사각형이 생성되었습니다.\n", side);
	}
	
	public Rect(String name, int width, int height){ //이름과 변의 길이를 받는 생성자
		super(name);
		setSide(width);
		setHeight(height);
		System.out.printf("너비가 %d, 높이가 %d인 직사각형이 생성되었습니다.\n", width, height);
	}
	

	@Override
	public double getArea() {
		if(side!=0) {
			return side * side;
		} else {
			return width * height;
		}
		
	}

	public int getSide() {
		return side;
	}
	
	public void setSide(int side) {
		if(side <=0) {
			System.out.println("잘못된 값이 입력되었습니다.(음수 입력)\n");
			return;
		}
		this.side = side;	
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width <=0) {
			System.out.println("잘못된 값이 입력되었습니다.(음수 입력)\n");
			return;
		}
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height <=0) {
			System.out.println("잘못된 값이 입력되었습니다.(음수 입력)\n");
			return;
		}
		this.height = height;
	}


	
	
	
	

	
	
}
