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
		String str;
		String[] nums;
		
		input: while(true) {
			System.out.print("주민등록번호(- 포함)> ");
			str = sc.next();
			if(str.indexOf('-') == -1) { //'-' 미포함 시.
				System.out.println("하이픈(-)을 포함하여 다시 입력해주세요\n");
				continue;
			} else if(str.length()!=14) {//14자리 모두 입력하지 않았을 때
				System.out.println("주민등록번호 14자리 모두 입력해주세요\n");
				continue;
			}
			
			//나눠서 체크
			nums = str.split("-");

			//하이픈 제외 값이 숫자가 아닐 때
			try {
				Integer.parseInt(nums[0]);
				Integer.parseInt(nums[1]); 
			}catch(Exception e){
				System.out.println("숫자 이외의 값이 입력되었습니다.\n");
				continue;
			}
			
			//뒷자리가 1 2 3 4 로 시작하지 않을 때
			char c = str.charAt(7);
			if(!(c=='1'||c=='2'||c=='3'||c=='4')) {
				System.out.println("주민등록번호 뒷자리가 잘못 입력되었습니다.\n");
				continue;
			}
//			switch (nums[1].charAt(0)) { //내 방법.
//			case '0': case '5': case '6': case '7': case '8': case '9':
//				System.out.println("주민등록번호 뒷자리가 잘못 입력되었습니다.\n");
//				continue input;
//			}
		
			
			
//			try { // 선생님코드, 문자없이 순수하게 숫자로 이루어져 있는지 체크
//				String test = str.substring(0,6);
//				String test2 = str.substring(7);
//				Integer.parseInt(test);
//				Integer.parseInt(test);
//				break;
//			} catch (NumberFormatException e) {//문자열을 integer로 변환하는 과정에서 터지는 예외
//				System.out.println("숫자를 정확하게 입력해야합니다.");
//			}
			break;
		}//while end
		
		
		char c1 = nums[1].charAt(0);
		int year = Integer.parseInt(nums[0].substring(0,2));
			if(c1 == '1' || c1 == '2') year += 1900;
			else if (c1 == '3' || c1== '4') year += 2000;
			
		int month = Integer.parseInt(nums[0].substring(2,4));
		int day = Integer.parseInt(nums[0].substring(4,6));
		int age = LocalDateTime.now().getYear() - year;
		
		String gender=null;
			if(c1 == '1' || c1 == '3') gender = "남자";
			else if (c1 == '2' || c1== '4') gender = "여자";
			
		System.out.printf("%d년 %d월 %d일 %d세 %s\n",year, month, day, age, gender);
		sc.close();
		
		
		
		
	}

}
