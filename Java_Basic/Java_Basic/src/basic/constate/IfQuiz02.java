package basic.constate;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		/*
         # 스캐너를 사용하여 정수를 하나 입력받으세요.
         
         - 입력받은 값이 7의 배수라면 "7의 배수입니다." 를 출력.
         - 입력받은 값이 7의 배수가 아니라면 "7의 배수가 아닙니다." 를 출력.
         - 입력받은 값이 0이라면 "0입니다." 를 출력하세요.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		
		
		/* 0을 처음부터 거르고 넘어가던지!
        if(num == 0) {
            System.out.println("입력된 값은 0 입니다.");
        } else if(num % 7 == 0) {
            System.out.println(num + "은(는) 7의 배수입니다.");
        } else {
            System.out.println(num + "은(는) 7의 배수가 아닙니다.");
        }
        */
		
		
		// 아예 0인지를 같이 넣어서 체크하던지 
		if(num%7 == 0 && num != 0) {
			System.out.println("입력된 값은 7의 배수입니다.");
		} else if(num == 0) {
			System.out.println("입력된 값은 0입니다.");
		} else {
			System.out.println(num + "은(는) 7의 배수가 아닙니다.");
		}
		
		
		// 왜 자꾸 if속에 if를 넣고 넣고 넣고..... 빡대가리니...
//		if(num != 0) {//입력받은 값이 0이 아닐 때
//			if(num%7 == 0) {
//				System.out.println("7의 배수입니다.");
//			} else {
//				System.out.println("7의 배수가 아닙니다.");
//			}
//		} else { //입력받은 값이 0일 때
//			System.out.println("0 입니다.");
//		}
		
		
		sc.close();
	}

}
