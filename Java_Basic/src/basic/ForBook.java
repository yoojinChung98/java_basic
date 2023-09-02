package basic;

public class ForBook {
	public static void main(String[] arg) {
		/*
API문서를 참조하여 String클래스의 메서드 중 charAt(int index)를 이요하여
프로그램이 시작될 때 전달된 arg[0]체서 첫 문자가 소문자인지, 또는 숫자인지를 알아내는 프로그램을 작성하시오
        */
       
		
		char str = arg[0].charAt(0);
		
		if(str>=48 && str<=57) System.out.println("숫자입니다");
		else if(str>=97 && str<=122) System.out.println("소문자입니다");
		else System.out.println("소문자도 숫자도 아닙니다");
		
	
		
	}
}