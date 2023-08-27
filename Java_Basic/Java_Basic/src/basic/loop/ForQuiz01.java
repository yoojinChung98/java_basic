package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		//2~19까지의 난수를 생성해서 구구단 출력하기 (for)
		int rNum = (int)(Math.random()*18+2);
		System.out.printf("난수 : %d\n",rNum);
		System.out.printf("**%dX19단 출력***\n",rNum);
		
		for(int i=1; i<=19; i++) {
			System.out.printf("%d X %d = %d\n",rNum, i, rNum*i);
		}
		
		
	}

}
