package etc.api.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		//추가
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		
		//처음에 List 형으로 참조할때 형변환을 한다면!
//		LinkedList<String> linkedList = (LinkedList<String>) list;
		
		
		//First(객체) , Last(객체) : 맨끝과 맨 앞에 뭔가를 하는 것!
		//(예: addFirst...
		//LinkedList는  Header와 Footer가 존재하므로 양 끝에 주소값으로 접근할 수 있는 것!
		//LinkedList는 Deque(<queue)를 구현하므로 양 끝이 뚫려있어 양 끝에 접근할 수 있는 것.
		list.addFirst("맨 앞");
		list.addLast("맨 뒤");
		System.out.println(list);
		
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.remove(0);
		System.out.println(list);
		
		//LIFO -> Last In First Out : stack의 자료구조 형태 (뒤로가기, 앞으로가기, 
		// stack의 메서드: push, pop, peek
		// 앞에서부터 추가하는 메서드
		list.push("김뽀삐"); 
		System.out.println(list);
		
		// 제일 최근 값 삭제하면서 데이트를 읽기
		// 뽑힌 데이터는 삭제가 된다고 합니다.
		System.out.println(list.pop());
		System.out.println(list);
		
		// 제일 최근 값 삭제하지 않으면서 데이터 읽기
		System.out.println(list.peek());
		System.out.println(list);
		
		//FIFO -> First In First Out : Queue의 자료구조 형태 (대기열, 버퍼, 인쇄대기열,,,)
		// queue에서 제공하는 메서드 : offer, poll, peek
		
		//뒤에서부터 하나씩 더 붙여줌
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list);
		System.out.println("-------------------------------");
		System.out.println(list.poll());
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list);
	}

}
