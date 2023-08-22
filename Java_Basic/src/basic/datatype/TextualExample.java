package basic.datatype;

public class TextualExample {

	public static void main(String[] args) {
		
		char c1 = 'A';
//		char c1 = "A"; //"" 문자열
//		char c1 = 'AB'; // 단일문자
		System.out.println(c1);
		
		char c2 = 65;
			// 65는 유니코드 문자번호로 A 의미. A=65=1000001 로 저장됨. 그래서 숫자를 받을 수 있음.
		char k1 = 44032;
			// 한글은 44032부터 시작
		System.out.println(c2);
		System.out.println(k1);

		//////////////////////////////////////
		
		/*
        # 문자열을 저장할 수 있는 데이터 타입 String
        - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
        - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
        기본 데이터 타입처럼 사용합니다. (사실은 객체 타입)
        - 문자열의 길이에 따라서 크기가 달라질 수 있는데 애를 기본데이터타입에 넣을 수 있겠..니?
        - 그래서 더 많은 문자열을 유동적으로 담을 수 있도록 하기 위해서 String이라는 클래스를 기반으로 String객체타입으로 넣음.
        - String은 객체타입이기 때문에 키워드(예약어)는 아님!
        */
		
		String s1 = "my dream ";
			//공백포함, s1의 길이는 9자리.
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		//자바에서는 문자열의 덧셈 연산을 지원합니다.
		//연산 결과로는 문자열을 연결해서 결합한 결과가 도출됩니다.
		System.out.println(s1+s2);
		
		//문자열과 다른 데이터 타입 간의 연산
		//결과는 무조건 문자열의 덧셈 연산과 같습니다.
		System.out.println("=========================================");
		
		System.out.println(100 + 100);
		System.out.println("100"+"100");
		System.out.println(100+"100");
		// +에 문자열이 있으면 결국 모두 연결연산자로 연결됨
		System.out.println(3.14+"hi");
		
		int month = 10;
		int day = 13;
		
		//내 생일은 10월 13일 입니다.
		System.out.println("내 생일은 "+month+"월 "+day+"일 입니다.");
		
		
	}

}
