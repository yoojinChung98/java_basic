package etc.api.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {
	
	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<>();
		List<Integer> linked = new LinkedList<>();
		
		for(int i=0; i<100000; i++) {
			array.add(i);
			linked.add(i);
		}
		
		long start, end; //시작시간, 끝시간
		
		//배열리스트에서 데이터 제어 (삭제)
		start = System.currentTimeMillis();
		
		for(int i=0; i<array.size(); i++) {
//			array.remove(0);
			array.get(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("배열리스트의 소요시간: %d/ms\n", end-start);
		
		
		
		//링크드리스트에서 데이터 제어 (삭제)
		start = System.currentTimeMillis();
		
		for(int i=0; i<linked.size(); i++) {
//			linked.remove(0);
			linked.get(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("링크드리스트의 소요시간: %d/ms\n", end-start);
		
		/*
        ArrayList는 탐색 후 객체를 참조하는 경우에 유리하고,
        LinkedList는 잦은 삽입/삭제 등으로 리스트의 크기가 변할 때 유리.
        사이즈가 크지 않다면 크게 차이는 없습니다.
        */
		// ArrayList는 삽입/삭제할 때마다 배열의 크기를 늘이고 줄이고 값들을 땡기고 밀어야해서 오래걸리는데,
		//LinkedList는 값을 빼고 앞의 주소값만 쓱쓱 수정하면 돼서 오래걸리지 않음
		
		
		
		
		
		
		
	}
}
