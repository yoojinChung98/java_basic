package basic.begin;

public class VariableExample {

	public static void main(String[] args) {
		
		/*
        # 변수 (Variable)
        
        1. 변수는 데이터가 저장되는 *공간에 이름*을 붙여놓은 것입니다.
        2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
        적당한 데이터 타입을 선언해야 합니다.
        ex) int: 4바이트의 정수, String: 문자열(문장)
        3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
        4. 변수 내부의 값은 언제든지 변경이 가능합니다.
        */
		
		//변수의 선언 : [자료형(데이터 타입)] [변수명];
		int age;	// age에는 4byte의 정수가 들어갈거야!(age라는 공간이 생성됨)
		
		//변수의 초기화(initialization)=초깃값을 주는 행위 : [변수명] = [값]
		age = 40; // 대입연산자 'area = value' 좌항의 영역에 우항의 값을 넣는다(할당한다). assignment operator = 대입(할당)연산자.
		
		// 40이라는 값을 참조하기 위해 age를 부르기만 하면 됨.
		// 즉, 변수의 값을 참조한다(=사용한다)
		System.out.println(age);
		
		// 변수는 선언과 초기화를 동시에 할 수 있습니다!
		// 대신 처음 만들 때 한 번만 가능합니다!
		// 데이터 타입이 앞에 붙는 다? 변수를 새로 만들겠다는 뜻
		int score = 90;
		
//		int score = 95; -> 불가능. 같은 이름의 변수를 중복선언 할 수 없음 The local variable result may not have been initialized
		
		// 변수 하나당 값을 하나밖에 대입할 수 없기 때문에 기존 값이 소멸하고 새로운 값이 할당됨
		// 기존의 값은 소멸됨. 중요한 값이라면 아예 변수를 다르게 선언하던지 따로 잘 보관해두세용.
		score = 95; // 기존에 있던 애를 지목한 것이라 괜춘
		System.out.println(score);
		
		// 변수에는 다른 변수의 값도 저장이 가능합니다.
		int myScore = score -20;
		// 우항의 값(score의 value -20)을 좌항의 myScore영역에 대입하겠다.
		System.out.println(myScore);
		
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능함.
//		int count = "한번"; // 자바는 정적 타이핑 언어.
//		int count = 23.5 // 23.5는 실수라서 int는 받을 수 없음
//		String str = 100; // String은 문자열을 받음.(타입 불일치로 할당 불가능)
		
		// 변수는 자료형(데이터 타입)이 달라도 이름이 동일하다면 중복선언 불가능!
		String name = "홍길동";
//		int name = 1004; // 동일한 이름으로 변수 중복선언 불가능
		// 메모리상에는 변수가 Stack에 아래부터 쌓여서 올라감. 근데 여기서 data type은 함께 저장되지 않아서 메모리상에선 구분이 불가능.
		
		// 선언 및 초기화하지 않는 변수는 사용 불가능. 안만든건 당연히 못쓰죵...
//		int result = myScore + num; // num을 선언하지 않은 것 같은데요... num cannot be resolved to a variable
		int result;
//		System.out.println(result);  // 초기화가 안된 것 같은데요... The local variable result may not have been initialized
		
		

	}

}
