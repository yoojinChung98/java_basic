package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz {

	public static void main(String[] args) {
		
		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.
        
        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.
         
        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)
        
         추가 문제 
        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
        '이미 존재하는 음식입니다.' 를 출력하고
        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
        
       */
		
		String[] foods = new String[50];
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("먹고 싶은 음식을 입력해주세요.");
		System.out.println("'배불러'를 입력하시면 종료됩니다.");
		
		
		//값 입력
		inputFood: for(int i =0; i<foods.length; i++) {
				System.out.print(">");
				String newFood = sc.next();
				
				if(newFood.equals("배불러")) {
					System.out.println("입력을 종료합니다.");
					System.out.println("-------------------------");
					break;
				} else {
					boolean flag_NDupFood = true;
					for(int k = 0; k<=i; k++){//목록돌려서 플래그 세울지 체크
						if(newFood.equals(foods[k])) {
							System.out.println("이미 존재하는 음식입니다.");
							flag_NDupFood = false;
							i--;
							continue inputFood;
						}
					}
					if(flag_NDupFood) foods[i] = newFood;
				}
		}
		
		
		//출력
		System.out.println("입력한 음식:");
		for(String f : foods) {
			if(f == null) break;
			System.out.print(" "+f);
		}
		System.out.printf("\n음식 목록 출력이 끝났습니다.");
		
		// 내가 쓴 for문 부검참시 하자!
//		for(int j=0; j<foods.length; j++) {
//			if(foods[j] != null) {
//			System.out.print(" "+foods[j]);
//			} else {
//				System.out.printf("\n음식 목록 출력이 끝났습니다.\n");
//				break;
//			}
//		}
		
		
		sc.close();
		
		
		
		
	}

}
