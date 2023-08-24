package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		
		/* 문제 예시
		 *** 덧셈 퀴즈 ***
		 11 + 97 = ???
		 > 
		 정답입니다!
		 틀렸습니다!
		 > 0
		 종료합니다.
		 ---------------------
		 정답 횟수: 6회
		 오답 횟수: 2회
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 덧셈 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해주세요");
		
		//사용자가 입력하는 값에 따라 언제 끝내야 할 지 모르므로 무한루프를 할 것.
		// 갯수를 저장하는 변수는 반복될 때마다 계속 초기화되면 곤란하므로 반복문 밖에서 선언 및 초기화
		int cCount = 0;
		int iCount = 0;
		
		while(true) {
			// 난수를 계속해서 2번씩 반복해서 뽑아야 하므로 while문 안에서 생성
			int rn1 =(int) ((Math.random()*100+1));
			int rn2 =(int) ((Math.random()*100+1));
			int num =(int) (Math.random()*2); //0이상2미만 -> 난수 0 1 만 나오는 것!
			
			int correct; // 정답.
			if(num == 0) {
				System.out.printf("%d + %d = ???\n", rn1, rn2);
				correct = rn1 + rn2;
			} else {
				System.out.printf("%d - %d = ???\n", rn1, rn2);
				correct = rn1 - rn2;
			}
			
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == correct) {
				System.out.println("정답입니다!");
				cCount++;
			} else if(answer == 0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("틀렸습니다~");
				iCount++;
			}
		}
		
		System.out.println("----------------------------");
		System.out.println("정답횟수: "+cCount+"회");
		System.out.println("오답횟수: "+iCount+"회");
		
		sc.close();
		
		
		
		
		
		
//		System.out.println("*** 연산 퀴즈 ***");
//		System.out.println("0을 입력하면 종료됩니다.");
//		
//		Scanner sc = new Scanner(System.in);
//		int cntC = 0;
//		int cntW = 0;
//		
//		while(true) {
//			// 난수 받아서 문제 출력
//			int num1 = (int)(Math.random()*101-1);
//			int num2 = (int)(Math.random()*101-1);
//			
//			// 연산기호 배열로 담아 하나 뽑기
//			String[] ops = new String[2];
//			ops[0] = "+";
//			ops[1] = "-";
//			String op = ops[(int)(Math.random()*1+1)];
//			
//			System.out.printf("%d %s %d = ???\n > ", num1, op, num2);
//			int numR = sc.nextInt();
//	
//			if(numR == 0) {
//				System.out.println("종료합니다.");
//				break;
//			} else {
//				switch(op) {
//				
//				case "+" :
//					if (numR == num1+num2){
//						System.out.println("정답입니다!");
//						cntC++;
//					} else {
//						System.out.println("오답입니다!");
//						cntW++;
//					}
//				break;
//				
//				case "-" :
//					if (numR == num1-num2){
//						System.out.println("정답입니다!");
//						cntC++;
//					} else {
//						System.out.println("오답입니다!");
//						cntW++;
//					}
//					
//				}//switch문 끝
//			} //53행 else 끝
//		}//While문 끝
//		System.out.println("-----------------");
//		System.out.printf("정답 횟수: %d회\n", cntC);
//		System.out.printf("오답 횟수: %d회\n", cntW);	
//		sc.close();
//		
//		
//		// 난수도 반복적으로 두개씩 뽑고
//		//* 연산기호 하나 뽑고(+/-)
//		// 문제를 출력하는데! (%s로 받고)
//		// 사용자의 값을 반복적으로 받고
//			// 정답이 맞으면 정답입니다! 출력 & 정답카운트 증가
//			// 아니면 틀렸습니다! 출력 & 오답 카운트 출력
//		
//		//그리고 다시 난수 두개 뽑고
//		// 사용자의 값 또 받고
//		// 정답이 맞으면 정답!...
//		
//		// 반복횟수 모름(무한반복)
//		// 탈출 : 입력값 =0
//		// 탈출시 수행할 내용: 종료되었습니다.---출력.
//		// +) 정답횟수, 오답횟수()
	}
}
