package etc.enum_.basic;

public class MainClass {

	public static void main(String[] args) {

		Developer kim = new Developer();
		kim.name = "김철수";
		kim.career  = 3;
		kim.lang = Languages.JAVA;
//		kim.lang = "메롱"; //Type mismatch: cannot convert from String to Languages
		
		Developer hong = new Developer();
		hong.name = "홍길동";
		hong.career  = 10;
		hong.lang = Languages.PYTHON;
		
		Developer park = new Developer();
		park.name = "박뚜띠";
		park.career  = 5;
		park.lang = Languages.JAVASCRIPT;
		
		
		System.out.println("kim의 주력 언어: "+kim.lang);
		System.out.println("hong의 주력 언어: "+hong.lang.getName());
		System.out.println("park의 주력 언어: "+park.lang.getName());
		
		//Languages 라는 eNum타입의 상수를 모두 꺼내볼 수 있는 메서드
		//values(): 열거형 타입에 존재하는 모든 상수를 배열에 담아서 리턴.
		for(Languages l : Languages.values()) {
			System.out.println(l);
		}
		
		//Languages에서 몇번째로 열거되어 있는지
		//ordinal() : 해당 상수가 열거형 타입에 열거되어 있는 순서를 정수값으로 인턴
		System.out.println(park.lang.ordinal());
		
		//valueOf(str): 매개값으로 전달된 문자열과 일치하는 요소를 리턴
		System.out.println(Languages.valueOf("CPP"));
//		System.out.println(Languages.valueOf("메롱")); //IllegalArgumentException 유효하지 않은 값이 입력되었을 때의 예외
		
		//출력을 했을 때, 상수의 이름이 아닌, 다른 값으로 지정해서 출력하고 싶을 때 (상수에 다른 값을 심어놓고 싶을 때)
		//해당 eNum에서
		
		
	}

}
