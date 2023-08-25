package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받은 수: ");
		int num = sc.nextInt();
		
		//---1부터 입력받은 수까지(1부터 증가하는 값.i)나열 반복문 i로 받는다.
		//---입력받는 수가 소수인지 판별
		//1과 본인만을 약수로 갖는 수 = 소수.
		// ---1부터 본인까지(1부터 증가하는 값j. i까지) 나누었을 때 나누어떨어지는(i%j ==0 의 횟수(cnt)가 2) 것이 오직 2회인 수만 소수
		
		// cnt가 2인 숫자만 모아서 출력한다
		int count = 0; //소수의 갯수를 기억할 변수
		System.out.print("소수: ");
		for(int i=1; i<=num; i++) { //1부터 입력받은 수까지(1부터 증가하는 값.i)나열 반복문 i로 받는다.
			int cnt = 0; // 각 숫자(i)의 약수의 갯수를 담고 초기화할 변수
			for(int j=1; j<=i; j++) {// 입력받는 수의 약수의 개수 구하는 반복 // 1부터 본인까지(1부터 증가하는 값j. i까지) 나누었을 때 나누어떨어지는(i%j ==0 의 횟수(cnt)가 2) 것이 오직 2회인 수만 소수
				if(i%j == 0) cnt++;
			}
			if(cnt == 2) {
				System.out.print(i+" ");
				count++; 
			}
		}
		System.out.println();
		System.out.println("소수의 갯수: "+count);
		
		sc.close();
		
	}

}
