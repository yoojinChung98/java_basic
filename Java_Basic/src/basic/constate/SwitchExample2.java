package basic.constate;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		
		// Switch문이 불리한... 별로 안 좋은 방법!!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		
		switch(point/10) { //int끼리 연산은 int니까!
		
		case 10:
			if(point>100) {
				System.out.println("잘못된 점수입니다.");
				break;
			} // if문에서 false인 경우(100) if문을 유유히 빠져나와 break;가 없으니 아래로 흘러내릴 것!
		case 9:
			System.out.println("당신의 학점은 A 입니댜.");
			break;
		case 8:
			System.out.println("당신의 학점은 B 입니댜.");
			break;
		case 7:
			System.out.println("당신의 학점은 C 입니댜.");
			break;
		case 6:
			System.out.println("당신의 학점은 D 입니댜.");
			break;
	
		default:
			if(point>100 || point<0) {
				System.out.println("점수를 잘못 입력하셨습니다.");
			} else {
				System.out.println("당신의 학점은 F 입니다.");
			}
//		default:
//			System.out.println("F 입니다.");
//			// 그런데...누가 109점 입력하면 어떻게...?
//			// 실수로 955 입력하면 어떡해...?
//			// 디폴트에 또 if 넣을꺼야?
		}
		sc.close();
	}

}
