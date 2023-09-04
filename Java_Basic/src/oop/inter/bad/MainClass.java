package oop.inter.bad;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("진행하실 번호를 입력하세요");
		System.out.println("1. 가입  2. 로그인  3. 정보수정  4. 탈퇴");
		System.out.println("> ");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			Join j = new Join();
			j.join();
		} else if(menu == 2) {
			Login log = new Login();
			log.login();
		} else if(menu == 3) {
			Update update = new Update();
			update.update();
		} else if(menu == 4) {
			Delete delete = new Delete();
			delete.delete();
		}
		// 각 객체의 변수 이름이 다 다른게 싫음. 선언하기도 싫음. 그 변수의 타입도 생성하려는 객체에 맞춰서 타입설정하는 것도 불만
		// 메서드 이름도 객체마다 메서드의 이름도 다 다른게 싫음

	}

}
