package oop.final_.field;

public class Person {

	final String nation = "대한민국";
	final String name;
	int age;
	
	public Person(String name) {// 생성하는 동시에 초기화를 시켜주기 가능!
		this.name = name;
	}
	// final 을 사용하는 방버비
	//1. 직접 값 대입하기
	//2. 생성자를 통해 생성하는 동시에 초기화시키기
	
	//final 변수는 불변의 값을 의미합니다.
    //그렇기 때문에 반드시 초기화가 필요합니다.
    //초기화는 직접 하는 방법과, 생성자를 이용하는 방법이 있습니다.
	
}
