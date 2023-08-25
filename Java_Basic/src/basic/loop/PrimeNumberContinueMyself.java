package basic.loop;
import java.util.Scanner;
public class PrimeNumberContinueMyself {
	public static void main(String[] args) {
	
		//continue 할만한게 뭐가 있을까!
		// 입력받은 값 까지의 소수 구하기를! 하는데! 
		//cnt가 2이상이 되면 걍 break;로 날려버리자!! X
		// 잘못 생각했음. continue를 선택했어야 함!!!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요: ");
		int num = sc.nextInt();
		
		System.out.print("소수: ");
		//숫자 1부터 num까지 나열하기(i 반복문)
		// 약수 카운팅할 값 선언 및 초기화 (int ctn = 0;)
		// 약수가 2개이면 소수. 따라서 i를 1부터 본인까지(j반복문, i까지) i%j == 0이면 약수 카운팅
		// 만약 cnt가 2이상이면 continue로 하단 모두 생략하고 외부 반복문의 증감식으로 이동;
		
		int count = 0;
		
		outer: for(int i = 2; i<=num; i++) {
			int cnt = 0;

			for(int j =1; j<=i; j++) {
				if(i%j == 0) cnt++;
					
				if(cnt >2) continue outer; //2 넘었으면 여기부턴 생략하고 outer의 증감식으로 이동해!
			}

		System.out.println(i+" ");
		count++;
		}// outer for문의 끝
		System.out.println("소수의 갯수: "+count);
	}
}