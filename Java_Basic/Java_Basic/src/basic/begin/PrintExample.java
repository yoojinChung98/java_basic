package basic.begin;

public class PrintExample {

	public static void main(String[] args) {

		// 자바의 표준 출력 형식은 크게 3가지 입니다.
		// 1. 개행을 포함하지 않는 print()
		// 2. 자동으로 개행을 포함해주는 println()
		
		System.out.print("안녕하세요~!");
		System.out.println("Hello~!");
		System.out.print("byebye~~");
		System.out.println("안녕히 가세요ㅜㅜ");
		
		//3. 형식 지정 표준 출력 함수 printf()
		// 서식 문자를 이용해서 문자열을 완성시킨 후 서식 문자에 들어갈 값을 지정해서 출력하는 방식
		// 변수에 있는 값을 이용해서 뭔가를 출력하고자 할 때 유용함.
		
		/* printf에만 동작
        # 포맷팅 서식 문자 종류
        %d: 부호가 있는 정수 데이터 (decimal (십진법 이라는 뜻))
        %f: 실수 데이터 (floation point)(기본 소숫점자릿수가 6자리임!)
        	%.nf = 소숫점 n자리까지 표현하고 반올림. )
        %s: 문자열 (String)
        %% : %를 문자로 쓰고 싶으면 두개 동시에 쓰세용~
        
        # 탈출 코드 (escape code) -> printf에만 동작하는 게 아니에요.println, print에도 동작! js python모두 동작
        - 반드시 따옴표 내에 위치해야 합니다
        - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호입니다.
        \n: 줄 개행 명령
        \t: 가로 공백 (스페이스 4칸)
        */
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
		//12월 25일은 크리스마스 입니다.
		System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");
		System.out.printf("%d월 %d일은 %s입니다.\t\n", month, day, anni);
		
		System.out.println("메롱메롱");
		
		Double rate = 64.126;
		System.out.printf("합격률은 %.2f%%입니다.\n", rate);
		
		String s = "그는 나에게 \"도와줘!\" 라고 말했다.";
	}

}
