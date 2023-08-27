package basic.constate;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IfQuiz01 {

	public static void main(String[] args) {
		/*
		- 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
        혹은 같은지를 판별하시면 됩니다.
        ex)
        입력받은 수: 4, 7 -> 7이 큰 수 입니다.
        입력받은 수: 10, 3 -> 10이 큰 수 입니다.
        입력받은 수: 5, 5 -> 같은 수 입니다.
       */
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("입력받은 수: ");
		//문자열로 전부 받아내기
		String str_Num = sc.nextLine();
		//콤마를 기준으로 문자열 나누어 st에 대입
		StringTokenizer st = new StringTokenizer(str_Num, ",");
		
		//첫번째 st의 토큰을 정수형으로 변환하여 num1에 대입
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		if(num1>num2) { //1이 더 클 때
			System.out.printf("%d이 큰 수 입니다.",num1);
		} else if(num2 > num1) { //2가 더 클 때
			System.out.printf("%d이 큰 수 입니다.",num2);
		} else { // 수가 같을 때
			System.out.printf("같은 수 입니다.");
		}
		
		
		//, 로 받는 방법을 모르겠...어....
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력받은 수: ");
//		int num1 = sc.nextInt();
////		System.out.print(",");
//		int num2 = sc.nextInt();
//		
//		if(num1>num2) { //1이 더 클 때
//			System.out.printf("%d이 큰 수 입니다.",num1);
//		} else if(num2 > num1) { //2가 더 클 때
//			System.out.printf("%d이 큰 수 입니다.",num2);
//		} else { // 수가 같을 때
//			System.out.printf("같은 수 입니다.");
//		}
//		
		
		
		sc.close();
	}

}
