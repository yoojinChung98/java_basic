package basic.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
		System.out.println("현재 저장된 친구들: "+ Arrays.toString(kakao));

		while(true) {
			
			if(kakao.length == 0) {
				System.out.println("더이상 삭제가 불가능 하므로 프로그램이 종료되었습니다.");
				break;
			}
			
			System.out.print("삭제를 원하는 친구를 입력하세요: ");
			String name = sc.next();
			
			boolean nameF = false;
			for(int i = 0; i<kakao.length; i++) {// 이름이 매칭되는 배열값 찾는 반복문
				
				if(name.equals(kakao[i])) {// 찾으면
					nameF = true; //여기서 true로 바꿔줘야해!!
					
					for(int k = i; k<kakao.length-1; k++) {// 해당값부터 뒷값 땡겨오기 (마지막 열은 반복문 안돌아요!)
						kakao[k] = kakao[k+1];
					}
				} else if(nameF) { //찾은 뒤에는 더이상 매칭찾기for문이 돌아가지 않아도 됨
					break;
				}// else if문 끝.
			}// 매칭for문 끝.
			
			if(nameF) {
				//새로운 배열 생성해서 갈아끼우고 주소값까지 바꾸기
				String[] temp = new String[kakao.length-1];
				for(int j =0; j<temp.length; j++) {
					temp[j] = kakao[j];
				}
				kakao = temp;
				temp = null;
				
				//배열 출력
				System.out.print("현재 저장된 친구들: ");
				System.out.println(Arrays.toString(kakao));
			}
				
		}
			
		sc.close();
		
	}

}
