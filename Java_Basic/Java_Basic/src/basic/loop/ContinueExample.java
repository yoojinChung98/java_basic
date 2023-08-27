package basic.loop;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) continue; //홀수면 건너뛰어죠!
			
			System.out.println(i + " ");
		}
		System.out.printf("\n반복문 종료!");
		
		
		
		
		
	}

}
