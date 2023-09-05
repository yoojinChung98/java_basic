package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {

		Person park = new Person("박영희", 25);
		Person hong = new Person("홍길동", 24);
		
//		park.PersonInfo();
//		hong.PersonInfo();
		
		
//		String str = new String("hello");
//		System.out.println(str.toString());
		
		//객체 타입의 변수를 출력하거나 값을 얻을 때는 뒤에 자동으로 toString()이 붙어서 진행됨
		System.out.println(park.toString());
		System.out.println(hong);
		
		//equals는 원래 객체의 주소값이 같냐고 물어보는 boolean반환 메서드
		if(hong.equals(park)) {
			System.out.println("이름과 나이가 같네요!");
		} else {
			System.out.println("이름이나 나이가 다르네요!");
		}
		
		
		
		//finalize 는 조건이 맞으면 자동을 호출되는 메서드로
		// gc가 호출되는 순서가 보장되지 않기 때문에 사용이 권장되지 않음(deprecated)
//		hong = null;
//		park = null;
//		System.gc(); // 가비지 컬렉터를 호출. (불러도 바로 안 올수도 있습니다.)
		
		Person kim = new Person("김복제인간",100);
		
		try {
			Person clonePerson = (Person)kim.clone();
			System.out.println("복사된 객체 정보: " + clonePerson);
			System.out.println("kim의 객체 정보: "+kim);
			System.out.println("kim의 주소: "+kim.hashCode());
			System.out.println("복제된 객체 주소: "+clonePerson.hashCode());
			
			kim.setName("김메롱");
			System.out.println(kim.getName());
			System.out.println(clonePerson.getName());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
	
	}

}
