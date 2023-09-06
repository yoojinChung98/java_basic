package etc.api.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		/*
        # ArrayList
        - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
        - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
        - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.
        */
		
		//제네릭: <>: 타입 안정성을 위해 타입을 고정시키는 역할 (변수타입에서 설정하면 뒤에는 안적어도 됨)
		// 다형성을 위해 대부분은 인터페이스 타입으로 설정해줌. (나중에 다른 리스트로 교환할 수 있도록)
		// 인터페이스 다형성 공부해야겠다! 리스트를 구현하는 모든 클래스를 다 다 다 바꿔서 사용할 수 있음.
		// <> -> 제네릭 (타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법)
		List<String> nick = new ArrayList<>();
		
		String str = "야옹이";
		
		//add(객체) : 리스트에 객체를 추가하는 메서드
		nick.add(str);
		nick.add("멍멍이");
		nick.add(new String("개구리"));
		nick.add("짹짹이");
		// 인덱스로 구분하면 되니까! 중복 허용!
		nick.add("야옹이");
		System.out.println(nick);
		
		//add(인덱스, 객체) : 특정 인덱스에 객체를 삽입하는 메서드
		nick.add(3,"어흥이");
		System.out.println(nick);
		
		//get(인덱스) : 리스트 내부의 객체를 참조하는 메서드
//		String name = nick[3]; (X) 배열의 방법
		String name = nick.get(0);
		System.out.println("3번 인덱스의 값: "+name);
		
		//size() : 리스트의 크기 반환
		System.out.println("nick의 크기: "+nick.size());
		
		//set(인덱스, 수정할 객체) : 리스트 내부의 객체를 수정
		nick.set(2, "삐약이");
		System.out.println(nick);
		
		//remove(인덱스), remove(객체)
		nick.remove(5);
		System.out.println(nick);
		nick.remove(str);
		System.out.println(nick);
		
		//리스트의 반복문 처리
		for(int i=0; i<nick.size(); i++) {
			System.out.println(nick.get(i));
		}
		
		System.out.println("--------------------------------");
		for(String s : nick) {
			System.out.println(s);
		}
		
		//contains(객체): 리스트 내의 객체의 존재 유무를 파악하는 메서드.(리턴: boolean)
		System.out.println(nick.contains("메뚜기"));
		
		//indexOf(객체): 특정 객체의 인덱스 탐색 (존재유무와 위치까지 궁금하면 indexOf)
		// 객체가 존재하지 않으면 -1 반환
		int idx = nick.indexOf("메롱이");
		System.out.println(idx);
		
		//clear(): 리스트 내부 요소를 전체 삭제
		nick.clear();
		System.out.println(nick);
		System.out.println(nick.size());
		
		//isEmpty() : 리스트가 비어있는지 여부 확인(nick.size()==0?)
		System.out.println(nick.isEmpty());
		
		/*
		 # 컬렉션 객체들은 Collections의 기능을 사용할 수 있습니다!
		 Collections는 컬렉션 객체들의 부가 기능들을 지원합니다.
		 (자주 사용하진 않지만 필요할 때 사용하면 좋은 부가 기능 지원!)
		 */
		
		List<Integer> score = new ArrayList<>();
		score.add(65); //Autoboxing: new Integer(65)로 넣지 않아도 됨!
		
		//addAll(리스트, 객체들... ) 한번에 객체 많이 추가하기 : 컬렉션 클래스가 제공하는 메서드!
		Collections.addAll(score, 78, 100, 88, 79, 21, 56, 100);
		System.out.println(score);
		
		//frequency(컬렉션, 객체) 컬렉션에서의 등장 횟수 구하기 
		System.out.println("100점 학생 수 : "+Collections.frequency(score, 100));
		
		//max(컬렉션)  min(컬렉션)  최대값, 최소값 구하기
		System.out.println("최대값: "+Collections.max(score));
		System.out.println("최대값: "+Collections.min(score));
		
		Collections.reverse(score); // 역순정렬
		System.out.println(score);
		
		//sort(정렬하고픈 리스트(컬렉션)) 오름차 정렬 (작은 값부터 순서대로 커지는 정렬)
//		Collections.sort(score);
//		System.out.println(score);
		
		//.sort(컬렉션, Collections.reverseOrder()) 내림차 정렬 (큰 값부터 순서대로 작아지는 정렬)
		Collections.sort(score, Collections.reverseOrder());
		System.out.println(score);
		
		// swap(리스트, i, j): 두 요소의 위치를 교체
		Collections.swap(score, 3, 7);
		System.out.println(score);
		
		//shuffle(리스트) 리스트 내의 요소를 무작위로 섞기
		Collections.shuffle(score);
		System.out.println(score);
		
		//fill(리스트, 원하는 값) 원하는 값으로 컬렉션 초기화
		Collections.fill(score, 100);
		System.out.println(score);
		
	}

}
