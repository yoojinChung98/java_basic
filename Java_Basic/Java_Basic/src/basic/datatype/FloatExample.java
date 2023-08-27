package basic.datatype;

public class FloatExample {
	public static void main(String[] args) {
		
		//실수 리터럴의 기본 데이터 타입은 double 임.
		
		float f1 = 7.12345F;
			// error: Type mismatch: cannot convert from double to float
		
		double d1 = 7.12345;
		
		////////////////////////////////////////////
		
		float f2 = 1.23456789123456789F;
		double d2 = 1.23456789123456789;
		
		System.out.println(f2);
		System.out.println(d2);
		
		
	}
}
