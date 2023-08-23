package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		
		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)인지 판별해보자!
		 소수는 자기자신과 1, 두개의 약수를 갖는 수.
		 1부터 끝까지 나누었을 때 나눠 떨어지는 횟수가 2번이면 약수!
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt(); 
		
		int i = 1; //begin 소수의 판별을 위해 입력받은 정수 num을 지속적으로 나누어볼 변수
		int count = 0; //나누어 떨어진 횟수를 기억할 변수
		
		while(i<= num) {
			if(num%i == 0) {
				count++;
			}
			i++;
		}
		if(count == 2) {
			System.out.printf("%d는 소수입니다.\n",num);
		} else {
			System.out.printf("%d는 소수가 아닙니다.\n", num);
		}
		
		System.out.println("=====================");
		
		int j = 2; // begin
		while(num%j != 0) {
			j++;
		}
		System.out.printf("%d은(는) %s\n",num, (num == j ? "소수입니다." : "소수가 아닙니다."));
		
		
		
//		int i = 2;
//		boolean res = false; 
//		while(i <= num) {
//			if(num/i == 1) {
//				res = true;
//			}
//			i++;
//		}
//		if(res) {
//			System.out.printf("%d는 소수입니다.\n",num);
//		}else {
//			System.out.printf("%d는 소수가 아닙니다.\n",num);
//		}
		
		sc.close();
	}

}
