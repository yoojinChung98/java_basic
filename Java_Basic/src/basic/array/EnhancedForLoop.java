package basic.array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		/*
        # 향상된 for문 (forEach)
        - 제어변수(인덱스)의 사용 없이 배열 내부의 요소를
         전체 참조할 수 있게 해 주는 반복문.
         
        ex)
        for(배열 요소를 받아줄 수 있는 변수 : 배열변수명) {
            반복 실행문
        }
        */
		
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
		/*
		for(int i=0; i<week.length; i++) {
			System.out.println(week[i]+"요일");
		}
		*/
		// 향상 for문 : 무조건 배열의 첫번째부터 끝까지 가야하는 것이 장점이자 단점. (배열의 중간부분만 배열돌린다? 불가능)
		// index값을 활용 불가능... 알아서 처음부터 끝까지 반복하므로 수동으로 카운팅 하지 않으면 모름.
		for(String day : week) {
			System.out.println(day+"요일");
		}
		//1. week의 첫번째 요소가 day에 전달되고 한바퀴
		//2. week의 두번째 요소가 day에 전달되고 한바퀴끝
		//.... i. 마지막요소 일이 day에 전달되고 한바퀴... 더 전달할 것이 없어서 끝.
		
		System.out.println("--------------------------------");
		
		/*
        1. scores라는 이름으로 int배열을 하나 선언해서
        점수 데이터를 저장하세요.
        {96, 88, 74, 63, 100, 55}
        
        2. 향상 for문(forEach)을 사용하여 총점과 평균을 구해보세요.
        총점(int), 평균(double, 소수점 둘째 자리까지 출력)
       */
		
		int[] scores = {96, 88, 74, 63, 100, 55};
		
		int sum = 0;
//		double cnt = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = (double)sum / scores.length;
		
//		for(int i =0; i<scores.length;i++) {
//			sum += scores[i];
//			cnt++;
//		}
		System.out.println("총점: "+sum+"점");
		System.out.printf("평균: %.2f점",avg);
		
		
		
		
	}

}
