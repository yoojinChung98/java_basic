package basic.begin;

public class identifier {

	public static void main(String[] args) {
		
		// 1. 식별자의 이름은 중복을 허용하지 않음. 대/소문자를 철자하게 구분함.
		
		int age = 35;
//		int age = 40; // (x) 중복 선언이라 불가능.
		int Age = 40; // (o) 대문자 Age 라서 가능.
		
		System.out.println(age);
		System.out.println(Age);
		
		// 2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하면 안됨.
//		int 700 = 365; //할당연산자의 좌항에는 반드시 변수가 와야함!(숫자는 아예 변수이름으로 쳐주지도 않음) The left-hand side of an assignment must be a variable
//		int 7number = 7; //문법에러~ 7이란 토큰 삭제해! Syntax error on token "7", delete this token
		int number7 = 7; // (o)
		int num7ber = 7; // (o)
		
		// 3. 식별자 이름에 공백을 포함할 수 없음.
//		int my birth day = 19980326;
		int myBirthDay = 19980326; // camel case 표기법 (연결단어의 첫글자를 대문자로 적어주는 기법)
		
		// 4. 식별자에 쓸 수 있는 특수문자는 언더바_, 달러기호$ 뿐! but 사용을 권장하진 않음.
			//해당 특수문자는 사용하기로 약속된 것이 지정되어 있음.
		String $hello_ = "안녕";
		// _ : static final로 상수를 선언할 때, 상수변수는 모두 대문자로만 작성하기 때문에 단어 사이에 구분을 주기 위해 사용
		// $ : 클래스파일이 존재하는 경로를 표시할 때 사용함
		
		// 5. 키워드(예약어)는 식별자 이름으로 사용이 불가능.
		// 키워드는 이미 어떠한 내용을 내포하고 있는 지정문자.
//		String class="클래스"; // class : 클래스 선언 시 사용하는 키워드.
		String Class="클래스"; // 곧 죽어도 사용하고 싶다면... 대문자로 쓸 수 있긴 한데(키워드는 모두 소문자)... 헷갈릴 수 있음...
		String className = "클래스"; // 차라리 다른 단어를 붙여서 사용하세요!
		
		// 6. 한글이나 한자 같은 식별자 이름도 지정이 가능하나 사용을 권장하진 않음.
		// 코드소스는 영어로 작성되는데, 거기에 타언어가 섞이면 가독성이 떨어짐.
		// 협업 시에 걸림돌이 될 수 있음.
		// 유니코드 문자판을 이용할 수 없는 경우 변수명에 에러가 생겨서 문제가 생기 ㄹ수 있음. 
		int 숫자 = 10;
		String 名 = "춘식이";
		System.out.println(숫자);
		System.out.println(名);
		
		
		
		

	}

}
