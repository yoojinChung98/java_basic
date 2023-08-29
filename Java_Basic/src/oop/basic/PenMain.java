package oop.basic;

public class PenMain {

	public static void main(String[] args) {

		/*
		 설계도에 작성한 속성과 기능을 사용하려면 반드시 실체(객체)를 생성하셔야 합니다.
		 클래스만 제작된 채로는 아무 기능도 수행할 수 없습니다.
		 */
		
		//객체 생성 문법: 클래스타입 변수명 = new 클래스 이름();
		Pen redPen = new Pen();
		//객체는 변수가 담기에는 너무나 커..(너무많은 속성과 기능...)
		// 힙에 생성된 객체의 고유한 주소값을 변수에 담아놓습니다!
		//redPen은 Pen 이라는 객체를 참조하고 있는 타입입니다! = Pen redPen
		
		Pen bluePen = new Pen();
		//위의 펜과는 또 다른애야!!!
		Pen blackPen = new Pen();
		
		//주소값으로 찾아가보자!
		//참조 연산자(.)를 통해 객체로 접근한 뒤 객체가 갖고있는 속성을 지정하고 기능을 사용할 수 있다.
		redPen.color = "빨강";
		//redPen이 참조하고 있는 Pen이라는 객체로 접근한뒤, 걔가 가지고 있는 color라는 속성에 빨강이라는 값을 줄거야!
		redPen.price = 500;
		bluePen.color = "파랑";
		bluePen.price = 600;
		blackPen.color = "검정";
		blackPen.price = 1000;
		
		redPen.write();
		bluePen.write();
		blackPen.write();
		redPen.priceInfo();
		bluePen.priceInfo();
		blackPen.priceInfo();
		
		System.out.println(redPen);
		System.out.println(bluePen);
		System.out.println(blackPen);
	}

}
