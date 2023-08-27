package basic.begin;

//1. Scanner api 로딩 (java에서 제공되는 Scanner 클래스를 현재 클래스로 호출해주자!(가져오자!)) 
//import java.util.Scanner; //java라는 곳에 util이라는 패키지의 Scanner 객체를 가져올거야!)
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		
		// 2. 스캐너 객체 생성.
//		Scanner sc = new Scanner(System.in);
		// new Scanner(System.in) 객체 생성
		// 생성한 객체를 선언한 변수에 대입(sc에 Scanner 객체를 넣을 것이므로 변수 데이터타입은 Scanner로 설정)
		// 이것이 바로 객체 생성문.
		//System.out = 자바의 표준 출력 명령
		//System.in = 자바의 표준 입력 명령
		
		// 1a . 스캐너 객체 생성
		// scanner 자동완성기능을 이용하면 자동으로 import까지 넣어줌
		Scanner sc = new Scanner(System.in);
		
		
		
		
		/*
        3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
        	// 자기가 받을 수 있는 값만 받을 수 있음!!(다른 타입이 오면 터짐)
        	// 원래는 문자열로 받은 뒤 입력받은 타입을 구별해서~ 넘어감~
        - next(): 공백이 없는 문자열을 입력받습니다.
        - nextLine(): 공백을 포함한 문자를 입력받습니다.
        - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
        ex)
            nextInt(): 정수 데이터를 입력받습니다.
            nextDouble(): 실수 데이터를 입력받습니다.
        */
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		//next()는 공백이 발생하면 입력이 끝났다고 생각함.
		//공백포함해서 받고싶으면 nextLine();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.printf("제 이름은 %s이고 나이는 %d세 입니다.", name, age);
		
		// 4. Scanner 객체를 반납
		// 객체를 반납한다 = 객체를 메모리에서 해제하겠다는 뜻.
		sc.close();
		// close 가비지컬렉터에게 이 객체를 우선순위로 처리해(버려)달라고 요청하는 것.
		// close는 우리가 직접 Scanner를 메모리에서 제거하는 것이 아닌, 제거 우선순위를 높이는 것.
		// java에서 메모리 정리는 가비지컬렉터 담당!
		// 저 sc 다 썼어요~ 이제 치워주셔도 돼요~

	}

}
