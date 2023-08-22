package basic.casting;

public class CastingExample2 {

	public static void main(String[] args) {
		
		int i = 72;
		char c = (char) i;
			// char 가 더... 작네...? 자동으로 해결 불가능. (직접형변환, 명시적 형변환 필요!)
			// i 라는 변수를 char c = (char)i;로 끌어내리겠다! 직접형변환
			// i에 해당하는 숫자가 char에 맞는 번호로 변형되어서 대입되겠지!
		System.out.println("72의 문자값: "+c);
		
		// 값의 손실이 발생할 수 있는 예시
		double d = 4.98765;
		int j = (int) d;
			// int j = (int) d; 이 경우 소숫점이 전부 누락되어 4로 대입됨(값의 손실 발생)
		System.out.println("여러분들의 이번 달 월급: " +j*1000000);
		// 작은 차이로 전체 로직이 흔들릴 가능성이 있다!(값의 누락 가능성..!)
		
		//값이 박살나는 경우
		int k = 1000;
		byte b = (byte) k;
			// k=1000= 0011 1110 1000
			// b = byte -> 8bit .. 뒤에서 부터 맞춰넣어서 1000은 없어짐 -> 1110 1000 = 
		System.out.println(b);
		
		/*
        - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
         반드시 형 변환 연산자(type casting operator): (type)를 사용하여 명시적으로
         형 변환을 진행해 주셔야 합니다. (DownCasting)
         
        - 명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
         저장 공간이 줄어들어 데이터 손실의 가능성이 항상 존재하기 때문입니다.
         (overflow(양수쪽으로 터지는 것), underflow(음수쪽으로 터지는 것))
        */

	}

}
