package basic.loop;

import java.util.Scanner;

public class ForExample {
	
	public static void main(String[] args) {
		
		/*
		//1부터 10까지 누적합 구하기 while로
		int i = 1;
		int total = 0;
		while(i<=10) {
			total += i;
			i++;
		}
		*/
		
		//for문으로 작성
		int total = 0;
		for(int i = 1; i<=10; i++) {
			total += i;
		}
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 (for문) 출력
		System.out.print("1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수:");
		for(int i=1; i<=200; i++) {
			if(i%6 == 0 && i%12 != 0) {
				System.out.print(" "+i);
			}
		}
		
		System.out.println();
		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요(for)
		int count = 0;
		for(int i=1; i<=60000; i++) {
			if(i%177 == 0) {
				count++;
			}
		}
		System.out.println("1~60000까지의 정수 중 177의 배수의 개수: "+count+" 개");
		
		
		//정수를 하나 입력받아서 입력받은 정수까지의 팩토리얼 값을 구하세요!
		// 5! = 5*4*3*2*1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("팩토리얼 계산을 할 정수를 입력해주세요: ");
		int num = sc.nextInt();
		
		int fac = 1; // 팩토리얼 최종 값을 담을 변수
//		for(int i=1; i<=num; i++) {
//			fac *= i;
		for(int i=num; i>=1; i--) { // 큰 수부터 곱하는 방법.
			fac *= i;
		}
		System.out.printf("%d! = %d\n", num, fac);
		
		sc.close();
	}
}
