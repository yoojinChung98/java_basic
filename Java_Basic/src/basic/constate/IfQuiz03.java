package basic.constate;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IfQuiz03 {

	public static void main(String[] args) {
		/*
		         - 정수 3개를 입력 받습니다.
		         - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
		         
		         # max, mid, min이라는 변수를 미리 선언하셔서
		          판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		          마지막에 한번에 출력하시면 되겠습니다.
		         */
		
		Scanner sc = new Scanner(System.in);
		
//		// 그냥 줄 개행으로 받기
//		System.out.println("정수를 3개 입력해주세요(엔터로 구분)");
//		int numA = sc.nextInt();
//		int numB = sc.nextInt();
//		int numC = sc.nextInt();
		
		//콤마로 구분해서 받기
		System.out.print("정수를 3개 입력해주세요(콤마로 구분): ");
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input, ",");
		// st에 담긴 토큰을 각각 정수에 대입
		int numA= Integer.parseInt(st.nextToken());
		int numB = Integer.parseInt(st.nextToken());
		int numC = Integer.parseInt(st.nextToken());
		
		
		//교수님 풀이! 먼저 num1을 최댓값이라고 상정하고 num2-3를 비교
//		int max, mid, min;
//		
//		if(numA > numB && numA > numC) {//num1이 max다!
//			max = numA;
//			if(numB > numC) {
//				mid = numB; min = numC;
//			} else {
//				mid = numC; min = numB;
//			}
//		} else if(numB> numA && numB > numC) {//num2가 max다
//			max = numB;
//			if(numA > numC) {
//				mid = numA; min = numC;
//			}else {
//				mid = numC; min = numA;
//			}
//		} else { //num3 가 max다!
//			max = numC;
//			if(numA > numB) {
//				mid = numA; min = numB;
//			} else {
//				mid = numB; min = numA;
//			}
//		}
//		
//		System.out.println("-------------------------------");
//		System.out.println("최대값: "+ max);
//		System.out.println("중간값: "+ mid);
//		System.out.println("최소값: "+ min);
		
		
		
//		int max, mid, min;
//		// A>B B>C = A가 가장 크다
//		// A>B B<C = A C 크기 비교 & B가 가장 작다
//				//A>C : a c b       C>A  c a b
//		if(numA>=numB) {
//			if(numB>=numC) {
//				max = numA; mid = numB; min = numC;
//			}else{
//				if(numA>=numC) {
//					max = numA; mid = numC; min = numB;
//				} else {
//					max = numC; mid = numA; min = numB;
//				}
//			}
//		} else { // B>A 일때 A>C 이면 b a c   //A<C  B와C비교   B>C : bca  C>B cba
//			if(numA>=numC) {
//				max = numB; mid = numA; min = numC;
//			}else{
//				if(numB>=numC) {
//					max = numB; mid = numC; min = numA;
//				} else {
//					max = numC; mid = numB; min = numA;
//				}
//			}
//		}	
//		System.out.printf("가장 큰 값: %d, 중간값: %d, 가장 작은 값: %d\n",max,mid,min);
		
		sc.close();
	}

}
