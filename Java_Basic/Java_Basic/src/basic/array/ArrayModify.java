package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));
		
		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));
		
		System.out.println("------------------------");
		
		//1 맘에 안드는 음식이 무엇인지 먼저 찾음 (인덱스값 찾기)
		//2 반복문 이용해서 비교해서 찾기
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요: ");
		String name = sc.next();
		
		// int i; //두번째 방법 for문의 int선언 제거
		// boolean flag = false;
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색완료");
				System.out.println("인덱스: "+i+"번");
				//flag = true; //세번째 방법
				break;
			// 마지막 인덱스번호까지 올라갔는데 아직도 못끝냈어..? 그럼 없는거지!
//			}else if(i==foods.length-1) {
//				System.out.println("없는 음식입니다.");
//			}
		}
		/*
		//두번째 방법
		if(i == foods.length){
			System.out.println("없는 음식입니다.");
		}
		*/
		
			/*
		//세번째 방법
		if(!flag) {
			System.out.println("없는 음식입니다.");
		}
		*/
		sc.close();
		
	}

}
}
