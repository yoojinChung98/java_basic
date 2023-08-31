package oop.poly.car;

public class Car {

	Tire frontLeft; //frontLeft에 HTire 인스턴스의 주소가 들어감.
	Tire frontRight;
	Tire rearLeft;
	Tire rearRight;
	
	
	void run() {
		System.out.println("자동차가 달립니다~");
	}
	
}
