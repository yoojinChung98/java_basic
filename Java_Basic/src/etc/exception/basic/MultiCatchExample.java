package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		try {
			System.out.println("정수: ");
			// int 이외의 값이 들어오면 터짐 InputMismatchException
			int n = sc.nextInt();
			
			// 나누기는 늘 터지기 좋지 ArithmeticException
			int result = 100 / n;
			
			// result 값이 뭐가 나올 줄 알고...? ArrayIndexOutOfBoundsException
			System.out.println("arr[result]");
			
			// null로 주소를 가리킨다고...? NullPointerException
			String s = null;
			s.equals("메롱");
			
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println("0빼고 정수만 입력하라고~");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났어용~");
		} catch (Exception e) {
			System.out.println("예측하지 못한 에러 발생! ");
			System.out.println("에러 원인: " + e.getMessage());
		}
		
		System.out.println("프로그램 정상 종료!");
		
		sc.close();
		
		
		
		
		
	}

}
