package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
	
		// 서로 다른 데이터타입의 합은 무엇일까?
		char c = 'B';
		int i = 2;
		
		int intResult = c + i;
		char charResult = (char)(c + i);
		// 작은 쪽이 큰 쪽에 맞추어져 연산된다! 따라서 char가 int(66)로 맞추어져 연산된다!
		// (int)66 을 char로 바꾸었으니 D가 나온 것
		
		System.out.println(intResult);
		System.out.println(charResult);
		// 서로 타입이 다른 기본 데이터의 연산 시에는
		// 데이터 타입이 큰 쪽에 작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행됨
		
		
		int k = 10;
		double d = k/4.0;
		System.out.println(d);
			// double d = k/4; k도 int, 4도 int. int끼리 계산하고 나면 2. 이걸 이제 double에 넣자니 //2.0
			// 한쪽만 더블로 올려도 됨(알아서 옆쪽이 변환한 뒤 계산하므로)
			// (double)k/4;  k/4.0; 둘 중에 하나만 써도 2.5로 받을 수 있음
		
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2);
			//  int보다 작은 크기의 데이터 연산은 자동으로 값이 int로 변환됨.
			// (데이터 손실의 방지 를 위해)
		
	}

}
