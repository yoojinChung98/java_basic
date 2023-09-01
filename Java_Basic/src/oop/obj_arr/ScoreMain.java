package oop.obj_arr;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		/*
        - Score 객체를 담을 수 있는 배열을 선언하세요.
         배열의 크기는 넉넉하게 100개로 하겠습니다.
         
        - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
        입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
        총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
        (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
        객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
        이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.
        
        - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
         scoreInfo()를 모두 불러주세요. (반복문)
         주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
         모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
        */
		
		Scanner sc = new Scanner(System.in);
		Score[] stuList = new Score[100];
		int cnt = 0;
		
		for(int i=cnt; i<stuList.length; i++) {
			System.out.println("*** 새로운 성적 등록을 시작합니다. 중단을 원하시면 '그만'을 입력해주세요.");
			Score s = new Score();
			
			System.out.print("이름 >");
			String n = sc.next();
			if (n.equals("그만")) break;
			
			System.out.print("국어성적 >");
			int k = sc.nextInt();
			System.out.print("영어성적 >");
			int e = sc.nextInt();
			System.out.print("수학성적 >");
			int m = sc.nextInt();
			
			stuList[i] = s;
			stuList[i].setName(n); stuList[i].setKorean(k); stuList[i].setEnglish(e); stuList[i].setMath(m);
			stuList[i].scoreCalc();
			cnt++;
		}
		sc.close();
		
		System.out.println("********************************************");
		System.out.println("모든 학생의 성적을 출력합니다.");
		for(Score s: stuList) {
			if(s == null) break;
			s.scoreInfo();
		}
		System.out.println("출력을 완료했습니다.");
	}

}
