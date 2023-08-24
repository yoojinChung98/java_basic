package basic.constate;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SwitchQuiz01 {

	public static void main(String[] args) {
		/*
         - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
          다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
          연산 결과를 출력해 주시면 됩니다. (switch문 사용)
          연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
          결과를 말씀해 주세요.
         */
		
		Scanner sc = new Scanner(System.in);
		
		// , 로 구분하기
		System.out.print("정수와 연산자를 하나씩 입력해주세요(콤마로 구분): ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, ",");
		int num1 = Integer.parseInt(st.nextToken());
		String operator = st.nextToken();
		
//		// 엔터로 입력받기
//		System.out.println("정수와 연산자를 하나씩 입력해주세요(엔터로 구분)");
//		int num1 = sc.nextInt();
//		String operator = sc.next();
	
		System.out.print("연산할 정수를 하나 입력해주세요: ");
		int num2 = sc.nextInt();
		
		switch(operator) {
		
		case("+"):
			System.out.println("===== 연산결과 =====");
			System.out.printf(" %d %s %d = %d",num1, operator, num2, num1+num2);
			break;
		 case("-"):
				System.out.println("===== 연산결과 =====");
				System.out.printf(" %d %s %d = %d",num1, operator, num2, num1-num2);
				break;
		 case("*"):
				System.out.println("===== 연산결과 =====");
				System.out.printf(" %d %s %d = %d",num1, operator, num2, num1*num2);
				break;
		 case("/"):
				System.out.println("===== 연산결과 =====");
				System.out.printf(" %d %s %d = %d",num1, operator, num2, num1/num2);
				break;
		 case("%"): 
				System.out.println("===== 연산결과 =====");
				System.out.printf(" %d %s %d = %d",num1, operator, num2, num1%num2);
				break;
		default: 
			System.out.println("올바른 값을 입력해주세요");
		}
		
	sc.close();
	}

}
