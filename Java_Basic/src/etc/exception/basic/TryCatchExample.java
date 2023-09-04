package etc.exception.basic;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int i = sc.nextInt();
		System.out.print("정수2: ");
		int j = sc.nextInt();
		
		System.out.println("나눗셈 시작!");
		
		try {
			//try 블록에는 예외 발생 가능성이 있는 코드를 작성합니다.
			System.out.printf("%d / %d = %d\n", i, j, i/j);
		} catch(Exception e) {
			//catch 블록에는 try 블록에서 실제 예외가 발생했을 경우 실행할 코드를 작성합니다.
			System.out.println("0으로 나누시면 어떡해요");
		}
		
		sc.close();
		
		System.out.println("프로그램 정상 종료!");
		
		//j=0일때 17행 i/j에서 발생, java.lang.ArithmeticException(얘는 클래스명임): / by zero
		
		
	}

}
