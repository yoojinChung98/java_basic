package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		 
		/*
        사용자에게 섭씨온도를 입력받아서
        화씨온도로 변환하여 출력하는 로직을 작성하세요.
        변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
        화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
        # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)
        */
		
		Scanner sc = new Scanner(System.in);
		
		//섭씨 온도 값을 실수로 입력받아 cel에 대입.
		System.out.print("섭씨 온도(℃)를 입력해주세요: ");
		double cel = sc.nextDouble();
		
		//섭씨 -> 화씨 변환하여 화씨온도를 fahr에 대입
		double fahr = ((double)cel * 1.8 ) + 32;
		
		System.out.printf("%.1f℃는 %.1fＦ와 같습니다.", cel, fahr );
		
		sc.close();
		
		
		
	}

}
