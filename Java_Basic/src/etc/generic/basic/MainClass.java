package etc.generic.basic;

import etc.generic.bad.Person;

public class MainClass {

	public static void main(String[] args) {
		
		/*
        # 제네릭
        - 클래스 내부에서 타입을 지정하는 것이 아니라 
         외부에서 객체를 생성할 때 타입이 지정될 수 있게 하는 문법.
         제네릭을 사용하면 객체로 생성할 때 사용할 타입을 지정할 수 있고
         따로 타입을 체크하고 변환해줄 필요가 없습니다.
         관리가 용이하고 잘못된 타입이 들어올 수 있는 것을 방지하기 때문에
         유지보수성, 코드의 재사용성이 높아집니다.
        */
		
		Box<String> box = new Box<>(); // 자바7이후로 생성자 타입은 생략 가능.
		box.setObj("홍길동");
		String name = box.getObj();  // return 타입 또한 선언할 때 입력한 타입으로 동일화되므로 형변환도 따로 필요 없다.
		
		//제네릭에는 기본 데이터 타입을 지정할 수 없음
//		Box<int> intBox = new Box();
		Box<Integer> intBox = new Box();
		intBox.setObj(2); //int타입이 autoboxing되어 들어감
		int num = intBox.getObj(); // Integer타입이 int 타입을 autounboxing되어 나옴
		
		Box<Person> pBox = new Box<>();
		pBox.setObj(new Person());
		pBox.getObj();
		
		
		
	}
}
