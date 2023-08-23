package basic.loop;

public class WhileExample2 {
	public static void main(String[] args) {
		
		// 48~150 사이의 정수 중 8의 배수만 가로로 출력해보세요.
		
		// 시작은 48부터 : 제어변수 48로 초기화 : begin
		int i = 48;
		
		// 반복문 시작. 횟수x 150까지o : end
		while(i<=150) {
			// 8의 배수라면 수행/ 8의배수=true.
			if(i%8 == 0) {
				
				//개행 포함하지 않고 가로로 i 나열.
				System.out.print(i+" ");
			}
			//i 증가 -> 증감식 : step
			i++;
		}
		System.out.println();
		// 단순 줄 개행

		
		
		
		//1~100까지의 정수 중 4의 배수이면서 8의 배수는 아닌 수를 가로로 출력.
		int n = 1; //begin

		while(n<=100) { //end
			// 4의 배수 이면서 8의 배수가 아닌 수(논리연산자 사용이 가장 보기 좋음)
			if(n%4 == 0 && n%8 != 0) {
				System.out.print(n+" ");
			}
			//일단 4의 배수만 거른다
//			if(n%4 == 0) {
//				//8의 배수가 아닌애들!
//				if(n%8 != 0) {
//					System.out.print(n+" ");
//				}	
//			}
			
			n++; //step
		}
		System.out.println("");
		
		
		
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력.
		int j = 1; //begin
		// 배수의 개수를 세 줄 변수
		int count = 0;
		
		while(j<=30000) {
			if(j%258 == 0) {
				count++; // count += 1; 도 가능!
			}
			j++; //step
		}
		System.out.println("1부터 30000중 258의 배수의 갯수: "+count+"개");
		
			
		
		
		//1000의 약수의 개수를 구하세요.
		// 1~1000까지 하나씩 나눴을 때 나눠 떨어지는 애가 약수!
		
		int k = 1;
		int cnt = 0;
		
		while(k<=1000) {
			if(1000%k == 0) {
				cnt++;
			}
			k++;
		}
		System.out.printf("1000의 약수의 개수는: %d개\n",cnt);
		
	}

}
