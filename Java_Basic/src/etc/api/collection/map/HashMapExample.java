package etc.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		/*
    # Map
    - Key / Value가 한 세트를 이루는 자료구조
    - Key값을 통해 Value를 참조하는 방식.
    - Key는 중복 저장을 허용하지 않는다. (인덱스가 없고 데이터 구분은 key로 함)
		 */
		
		//Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 설정.
		Map<String, String> map = new HashMap<>();
		
		
		// put(key, value) : Map에 데이터를 추가하는 메서드
		map.put("멍멍이", "김철수");
		map.put("야옹이", "홍길동");
		map.put("짹짹이", "박영희");
		System.out.println(map);
		
		//Map은 Key의 중복을 허용하지 않음
		//만약 중복 Key를 사용하여 put을 호출하면 Value만 수정됨
		map.put("멍멍이", "김뽀비"); //key중복 : value 수정
		map.put("어흥이", "홍길동"); //value중복: 새로운 객체 추가
		System.out.println(map);
		
		// Map 내부에 key의 존재 유무를 확인하는 메서드: containsKey(key)
		System.out.println(map.containsKey("메뚜기")); // false
		
		// get(key): Map 내부의 값을 참조하는
		System.out.println(map.get("메뚜기")); // 없는 값: null
		
		//null 값을 반환받으면 나중에 예외 생길 가능성이 있으니까 아예 없으면 get을 하지 말자고! 이렇게!
		String name = "야옹이"; //스캐너로 야옹이를 입력받았다 치고
		if(map.containsKey(name)) {
			System.out.printf("%s의 별명을 가진 학생은 %s입니다.\n", name, map.get(name));
		} else {
			System.out.println("그런 별명을 가진 학생은 없습니다.");
		}
		
		// Map의 크기를 확인하는 메서드: size
		System.out.println("map의 크기" + map.size());
		
		//keySet() : Map에서 key들만 추출하는 메서드
		// Map은 향상포문으로 받을 수 없음(두가지 타입을 한 객체로 모아서 저장하므로) for문도 i가 의미가 없음..
		// Key만 set으로 받아올 수 있음.
		// 모든 key들을 Set에 담아서 반환합니다.
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k+" : "+map.get(k));
		}
		
		//remove(key): Map의 객체를 삭제
		//key를 주면 value도 함께 제거됩니다.
		map.remove("야옹이");
		System.out.println(map);

		//clear() : Map의 모든 객체 삭제
		map.clear();
		System.out.println(map);
		
		
		
		
		
	}
	
}
