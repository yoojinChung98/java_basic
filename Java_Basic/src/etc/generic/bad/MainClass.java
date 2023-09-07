package etc.generic.bad;

public class MainClass {

	public static void main(String[] args) {

		Box box = new Box();
		box.setObj(new String("홍길동"));
		
		//리턴 타입이 object라서 string의 고유 메서드는 사용 불가.
		System.out.println(((String)box.getObj()).charAt(0));
		// getObj()로 리턴받고(참조연산자) -> String으로 형변환하고(형변환 연산자) -> charAT(0)메서드 실행)
		
		Box p = new Box();
		box.setObj(new Person());
		
		Person p2 = (Person) p.getObj();
		System.out.println(p2);
		
	}

}

//컴파일러는. jvm이는. 클래스로만 상속관계를 대충 확인하는거야....
//Box box = new Box();
//box.setObj(new String("홍길동")); -> box의 Object라는 변수에 String타입을 넣었어.
//Box b1 = box.getObj; -> Box형 참조변수 b1에는 Object형 (String객체)의 주소값이 들어옴.
//String str = (String)b1; : 컴파일러는 일단 String클래스와 b1의 데이터형의 클래스가 상속관계인지 확인해. String과 Object는 상속관계가 맞네
// 



