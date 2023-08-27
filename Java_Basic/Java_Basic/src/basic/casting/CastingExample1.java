package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		 자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해 줌.
		 (promotion, UpCasting)
		 */
		
		byte b = 10; // 이 부분은 jvm이 알아서 내가 선언한 타입에 맞추어 변형해서 넣어줌. 
		int i = b;  // byte -> int 변환 후 대입 연산 진행.
			// 자바가 자동으로 형변환을 해줌. 음.. 대입연산하려는데 변수는 int인데 값은 byte네?
			// 음.. 그럼 뭐 그냥 byte를 int로 올려서 대입해도 뭐 상관 없겠다!^^/ 
			// 타입을 맞춰준 다음에 대입이 진행되는 것. (promotion, UpCasting)
		System.out.println(i);
		
		char c = '홓';
		int j = c;
			// char -> int로 맞춰서 (A를 int에 맞춰 65로 바꾸고) j에 대입. 
		System.out.println("홓의 문자 번호:" + j);
		
		int k = 500;
		double d = k;   // double 이 더 큼. int -> double로 변환 후 d에 대입
		System.out.println(d);
		
		// 형변환을 하기 전에 좌항과 우항의 크기를 비교해 줄 줄 알아야 함!!!
		

	}

}
