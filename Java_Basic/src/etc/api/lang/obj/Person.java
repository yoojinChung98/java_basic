package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [이름: " + name + ", 나이: " + age + "]";
	}

	@Override
	// Person 객체의 이름을 비교해주는 메서드로 override
	public boolean equals(Object obj) {
		if(this == obj) return true; // 같은 사람을 비교하는거면(주소가 같으니까) true.
		if(obj instanceof Person) { //모든 객체가 다 들어올 수 있으므로 우선 Person객체가 맞는지 확인.
			Person p = (Person)obj; //Object 타입을 Person 타입으로 형변환(name과 age 사용을 위해)
			if(this.name.equals(p.name) && this.age==p.age) {
				return true;
			}
		}
		return false; // Person객체가 아니면 무조건 다 false로 들어올 것.
	}
	
	// equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행하는 것이 좋다!
	// equals를 재정의한다는 것은, 기존에는 주소값을 비교했으나, 이제는 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
	// hashcode의 값도 그에 맞게 같이 재정의가 되어야 함.(hash 주소를 equals에 맞게 정의)
	// equals를 해서 같다고 한다면, 당연히 주소도 같아야 겠지! 왜냐면 동일한 애니까!
	// 그래야 그 객체(동일한 걔네)로부터 '항상' 같은 값을 받는다는 것이 보장되고, 메모리 낭비도 줄일수 있으니까!
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	
	
	
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동으로 호출 (gc가 실행될 때)
		System.out.println(this.name+"이(가) 주것습니다 ㅜㅜ");
	}
	
	// 객체 복사 메서드
	// Cloneable 인터페이스를 구현해서 사용해야 정상동작 됨.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}



	public void PersonInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age + "세");
	}
	
	
}
