package oop.overloading;

public class Calculator {

	/*
    # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
     생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.
     
    - 오버로딩 적용 조건:
    1. 매개 변수의 데이터 타입이 다를 것! or
    2. 매개 변수의 전달 순서가 다를 것! or
    3. 매개 변수의 개수가 다를 것.
    */
	
	//*호출 할 때* 구분이 되면 중복 허용!(매개변수로 구분할게욥!)
	void inputData() {}
	
	void inputData(int a) {}
	
	void inputData(int a, int b) {}
	
//	void inputData(int b, int a) {} (x) 매개변수 이름이 중요한게 아니야... inputData(100,200) 하면 바로위랑 얘랑 뭘로 고를래...?
	
	void inputData(String s) {}
	
	void inputData(int a, double d) {}
	
	void inputData(double d, int a) {}
	
//	void inputData(int number) {} (x) 정수 매개값 1개 받는 메서드가 이미 선언되어있음
	
//	int inputData(int number) {
//		return 0;
//	} // 메서드를 호출할 땐 리턴타입(반환유형)을 따로 기입하지 않으므로 결국 두번째와 구분이 안됨...
	
	
	

//////////////////////////////////////////////////////////////////////////////////////////	

	
	
	int calcRectArea(int side) {
		int area = side*side;
		// -> Math.pow(side,2); // side의 2승.
		return area;
	}
	
	int calcRectArea(int width, int height) {
		int area = width*height;
		return area;
	}
	
	double calcRectArea(int bottom, int topSide, int height) {
		double area = (bottom+topSide)*height/2.0;
		return area;
	}
	
	
	
	
}
