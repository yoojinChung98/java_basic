package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
         
        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
       */
       
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		System.out.print("소수: ");
		for(int i=2; i<=num; i++) {// 소수 판별 대상 나열 (1은 소수가 아니므로 애초에 배제하고 시작)
			
			
			int cnt = 0; // 나누어 떨어진 횟수(2=약수)를 세줄 변수. i의 값이 변할 때마다 0으로 초기화 되어야 함!(숫자가 바뀌면 당연히 다 초기화 해놔야징) (위치 중요)
			
			for(int j=1; j<=i; j++) { // 각 대상(i)를 소수로 판별하기 위한 반복
				if(i%j == 0) { //i를 j로 나누었을 때 나누어떨어지면
					cnt++; //약수 이므로 약수 횟수 증가.
				}
			}// 반복이 모두 끝난 후 약수의 갯수를 체크하여 소수 판별\
			
			
			if(cnt == 2) { //값이 소수 일 때!
			//값이 소수이면 반복할 수행
				System.out.print(i+" ");
				count++; //소수의 갯수를 체크하는 변수 +1
			}
		
		
		}
		
		System.out.println("\n소수의 개수: "+count+"개");
		
		sc.close();
		
		
		
	}

}
