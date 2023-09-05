package etc.api.lang.math;

public class MathExample {

	public static void main(String[] args) {

		//올림 ceil()의 반환값은 double
		int i = (int)Math.ceil(1.1);
		System.out.println(i);
		
		//내림
		double d = Math.floor(1.5);
		System.out.println(d);
		
		//반올림
		double d2 = Math.round(3.141592*1000)*0.001;
		System.out.println(d2);
		//1. 점의 위치를 이동 : 3.141592 ---x100--> 314.1592
		//2. round() 때리기 : 314.0
		//3. 원상복구       : 314.0 * 0.01 = 3.14
		
		//제곱
		double d3 = Math.pow(3.0,  4.0);
		System.out.println(d3);
		
		//최대값
		int max = Math.max(2, 10);
		System.out.println(max);
		
		//최소값
		int min = Math.min(24, 34);
		System.out.println(min);
		
		//절대값 abs
		int k = Math.abs(-37);
		System.out.println(k);
		//원주율 pi
		
		
	}

}
