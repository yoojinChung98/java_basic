package basic.operator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		// 비교(관계)연산자 ( < <= > >= == != )
		// 좌항과 우항의 크기를 비교하여, 결과값으로 논리형 타입의 값을 도출
		
		
		int x = 10, y = 20;
		System.out.println(x != y);
		
		/*
        # 논리 연산자 (&, &&, |, ||)
        - 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
        1. &, &&(and 연산자): 양쪽 항의 논리값이 모두 true일 경우에만 true가 도출됩니다.
        2. |, ||(or 연산자): 양쪽 항의 논리값 중 한 쪽만 true여도 true를 도출합니다.
        
        &&, || -> 단축 평가 연산 (short circuit operation)
        - 좌항의 연산 결과가 전체 연산 결과에 영향을 미칠 경우 우항의 연산을 진행하지 않습니다.
        */
		
		System.out.println(x > 10 && (y/0 == 10));
			//좌항이 false 이므로 and연산자는 우항을 건너 뜀. 따라서 우항에서 error는 발생하지 x
			//&는 단축 평가 연산하지 않고 우항도 계산하기 때문에 error가 발생함.
		System.out.println(x >= 10 || (y/0 == 10));
			// || 는 단축평가 연산으로 좌항이 true 이므로 우항은 패스~
			// | 는 좌항의 값과 상관없이 우항을 연산하므로, error 발생

			// 논리 반전 연산자(!: 단항)
			// 단순히 논리값을 반전시킬 때 사용
			// true -> false  ,  false -> true
		
		int z = 10;
		System.out.println(!(z == 10));

	}

}
