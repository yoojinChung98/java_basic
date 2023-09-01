package oop.static_.init;

public class DBManager {
	
	public static String addr;
	public static String uid;
	public static String upw;
	// 하나의 값이 모두에게 그 모습이 공유될 수 있어야 하기 때문에 static을 붙임.
	
	// 정적 변수를 자동으로 초기화하려면 정적 초기화자가 필요합니다. (스태틱블록 = 스태틱 멤버(변수) 랑 스태틱초기화자를 의미)
	static {
		System.out.println("정적 초기화자가 호출되었습니다");
		addr = "192.168.0.2:8181/XEPDB1";
		uid = "abc1234";
		upw = "aaa1111!";
	}
	// 정적 초기화자는 조건이 맞으면 자동으로 호출됨.
	// 그 조건은 
	/*
    - 정적 초기화자를 호출하려면 클래스를 로딩하시면 됩니다.
    # 클래스 로딩 방법
    1. 클래스의 이름을 참조하여 static 멤버를 호출.
    2. 객체를 생성함.
    - 정적 초기화자는 클래스 로딩 시 최초 '1회만' 호출됩니다.
    */
	
	
	public DBManager() {
		System.out.println("생성자가 호출되었습니다");
		addr = "192.168.0.2:8181/XEPDB1";
		uid = "abc1234";
		upw = "aaa1111!";
	}
	
	

}
