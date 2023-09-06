package etc.api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//실수 난수: 0.0<= ~ < 1.0
		double d = r.nextDouble();
		System.out.println(d);
		
		//정수 난수: nextInt();   
		int i = r.nextInt();    //기본 범위: int의 전범위
		System.out.println(i);
		
		// 사용자 지정범위 난수(0~5) : 끝값이 미만으로 인식
		int j = r.nextInt(6);
		System.out.println(j);
		
		//10~100 정수난수
		int k = r.nextInt(91)+10;
		
		boolean flag = r.nextBoolean();
		System.out.println(flag);
		
	}
	
}
