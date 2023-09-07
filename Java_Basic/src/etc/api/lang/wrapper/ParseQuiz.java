package etc.api.lang.wrapper;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		/*
		주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.

		ex) 입력값: 9201013-1234567
		출력값: 1992년 10월 13일 31세 남자 

		입력값: 040906-4123456
		출력값: 2004년 9월 6일 19세 여자 

		입력값은 하이픈이 포함된 문자열이어야 합니다. 
		하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
		또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		String str1;
		String[] nums;
		
		while(true) {
			System.out.print("주민등록번호(하이픈 포함)> ");
			str1 = sc.next();
			//하단의 str1.indexOf = -1 이면 재입력.
			if(str1.indexOf('-') == -1) {
				System.out.println("하이픈(-)을 포함하여 다시입력해주세요");
				continue;
			}
			
			//나눠서 체크
			nums = str1.split("-");

			//하이픈 제외 값이 숫자가 아닐 때
			try {
				Integer.parseInt(nums[0]);
				Integer.parseInt(nums[1]);
//				if(str1.length()!=14) throw new 
			}catch(Exception e){
				System.out.println("주민등록번호 앞자리 및 뒷자리에 숫자 이외의 값이 입력되었습니다.");
				continue;
				//다중 캐치로 배열 사이즈가 안돼서 터지는거는 주민번호 16자리를 모두 입력해주세요 출력하자
			}
			
			//뒷자리가 1 2 3 4 로 시작하지 않을 
			switch (nums[1].charAt(0)) {
			case 0: case 5: case 6: case 7: case 8: case 9:
				System.out.println("주민등록번호가 잘못 입력되었습니다.");
				continue;
			}
			
			break;
		}
		
		int year = Integer.parseInt(nums[0].substring(0,2));
			if( year <2000) year += 1900;
			else year += 2000;
		int month = Integer.parseInt(nums[0].substring(2,4));
		int day = Integer.parseInt(nums[0].substring(4,6));
		int age = LocalDateTime.now().getYear() - year;
		String gender=null;
			if(nums[1].charAt(0) == 1 || nums[1].charAt(0) == 3) gender = "남자";
			else if (nums[1].charAt(0) == '2' || nums[1].charAt(0) == '4') gender = "여자";
			
		System.out.printf("%d년 %d월 %d일 %d세 %s\n",year, month, day, age, gender);
		sc.close();
		
		
		
		
	}

}
