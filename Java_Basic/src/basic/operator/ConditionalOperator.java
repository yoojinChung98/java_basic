package basic.operator;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		/*
        # 3항 연산자
        - 피 연산자(연산을 당하는 값)가 3개인 연산자를 말합니다.
        - (조건식 ? 좌항 : 우항);
        - 조건식을 비교하여 true일 경우에는 좌항이,
         false일 경우에는 우항의 값이 도출됩니다.
        */
		
		int x = 10, y = 20;
		
		String result = (x >y ? "x는 y보다 큽니다.": "x는 y보다 작습니다.");
		// 연산자는 항상! 연산하고 결과값을 내보냅니다! 그 결과값을 받아주지 않으면 빨간줄 쳐져욥!
		// 튀어나오는 값이 문자열이기 때문에, String으로 선언!
		System.out.println(result);
		
		
		//난수(亂數 random number)를 생성 방법
		// 난수를 발생시키는 메서드 Math.random()
		// 여기서 Math는 클래스. Math 안의 함수들을 사용하는 것.
		// 0.0 이상 1.0 미만의 실수 난수값을 반환.
//		double rn = Math.random();
//		System.out.println(rn);
		
		//1부터 10까지의 정수 난수를 발생시키고 싶어요~
//		int rn = Math.random()*11; // 1. 우선 뒷범위를 먼저 맞춰준다. 0.0<=~<11.0
//		int rn = (Math.random()*11) +1 ; // 2. 앞자리 맞춰주기 1.0<=~<12.0
		int rn = (int) ((Math.random()*10) +1) ; // 3. 뒷범위 다시 맞춰주기 1.0<=~<11.0
		System.out.println(rn);
		
		//10부터 100까지 정수 난수를 발생!
		int rn2 = (int) (Math.random()*91+10);
		System.out.println(rn2);
		
		//34~176 난수
		int rn3 = (int) (Math.random()*143 + 34);
		System.out.println(rn3);
		
		
		

	}

}
