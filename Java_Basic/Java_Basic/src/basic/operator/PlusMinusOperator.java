package basic.operator;

public class PlusMinusOperator {

	public static void main(String[] args) {
		
		//증감 연산자(++ --)
		//변수의 값을 단순히 하나 올리거나 내릴 때 사용.
		
		//후위연산(선연산 후증감)
		int i = 1;
		int j = i++;	// i=1을 j에 대입. i=2로 증가.
		int k = i--;	// i=2를 k에 대입. i=1로 감소.
		
		System.out.println("i의 값:"+i);
		System.out.println("j의 값:"+j);
		System.out.println("k의 값:"+k);
		// 대입연산자 이후 증감연산자 계산.
		
		System.out.println("-----------------------------------------");
		
		//전위연선(선증감 후연산)
		int x = 1;
		int y = ++x;	// x=2로 증가. x=2를 y에 대입. 
		int z = --x;	// X=1로 감소. x=1을 z에 대입.
		
		System.out.println("x의 값:"+x);
		System.out.println("y의 값:"+y);
		System.out.println("z의 값:"+z);
		
		
		
		int a = 3;
		int b = ++a + 5 * 3; //a먼저 증감 후 연산
		
		System.out.println(b); // 19
		System.out.println(a); // 4
	}

}
