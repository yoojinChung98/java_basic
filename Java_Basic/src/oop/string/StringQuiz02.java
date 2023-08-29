package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		/*
        1. 주민등록번호 13자리를 입력받습니다.
        2. 주민등록번호는 -을 포함해서 받을 예정입니다.
        3. 13자리가 아니라면 다시 입력받습니다.
        4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호: ");
		while(true) {
			String idNum = sc.nextLine();
			idNum = idNum.replace(" ", "");
			idNum = idNum.replace("-", "");
			if(idNum.length() != 13) {
				System.out.println(idNum.charAt(6)%2 != 0? "남성입니다.":"여성입니다.");
				break;
			} else {
				System.out.print("잘못 입력되었습니다. 다시 입력해주세요\n> ");				
			}
		}
		
		sc.close();
	}

}
