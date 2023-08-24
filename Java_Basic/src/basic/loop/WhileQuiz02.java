package basic.loop;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WhileQuiz02 {

	public static void main(String[] args) {
		/*
         1. 정수를 두개 입력받으세요. (x, y)
         2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
         ex) 입력: 3, 7 -> "3부터 7까지의 누적합계: 25"
         
         처음에는 x에 무조건 작은 값이 들어올 것이라고 예상하고 작성하겠습니다.
         다 하신 분은 만약 x에 큰 값이 들어왔을 경우에는
         어떻게 대처할 지 생각해 보세요.
         (x에 큰 값이 들어와도 정상적으로 출력이 되었으면 좋겠습니다.
         입력: 7, 3 -> "3부터 7까지의 누적합계: 25")
         - while문을 if else 로 나눠서 두번 쓰는 것은 지양하겠습니다.
        */
		
		Scanner sc = new Scanner(System.in);
		
		//콤마로 입력받기
		System.out.print("정수를 두 개 입력해주세요(콤마로 구분): ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, ",");
		int numX = Integer.parseInt(st.nextToken());
		int numY = Integer.parseInt(st.nextToken());
		
		int count = numX-numY; //반복 횟수
		
		// 부호에 따라서 어디서 더할지 정하는 if문
		// numX-numY>0 : +, numX가 더 큼.
		
		int sum =0;
		int i = 0;
		while(i<=Math.abs(count)) {
			if(count<0) {
				sum += numX;
				numX++;
			} else {
				sum += numY;
				numY++;
			}
			i++;
		}
		System.out.println(sum);
		
	sc.close();
	}

}
