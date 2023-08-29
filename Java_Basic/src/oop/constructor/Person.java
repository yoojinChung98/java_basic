package oop.constructor;

public class Person {

	String name;
	int age;
	int height;
	
	Person() {} // 기본 생성자는 늘 하나쯤 만들어 놓는 것이 좋아! 그래야 나중에 내가 원하는 형태로 객체를 생성할 수 있어!
	
	Person(String pName, int pAge, int pHeight){
		name = pName;
		age = pAge;
		height = pHeight;
	}
	
	void info() {
		System.out.println("*** 정보 출력 ***");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age+"세");
		System.out.println("키: "+height+"cm");
	}
	
}
