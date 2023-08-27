package basic.array;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9, 11, 13};
		
		//배열은 삭제라는 개념이 없음! 배열의 크기가 고정되어있기 때문
		
		//1. 삭제하려는 데이터의 인덱스 값을 찾음(위치)
		//2. 삭제하려는 값을 기준으로 뒤에있는 데이터들을 앞으로 한칸씩 당겨줌. 마지막값은 앞으로 땡기고 빈칸은 걍 걔로 냅둬
		//3. 기존의 배열보다 길이가 1 짧은 배열 선언.
		//4. 값을 하나씩 넣어주고 나머지는 버리기.
		
		/*
		arr[3] = arr[4];
		arr[4] = arr[5];
		arr[5] = arr[6];
		*/
		
		// 삭제되는 값을 기준으로 뒤에 있는 값을 한 칸씩 앞으로 땡기는 작업
		// 추후에 생성될 새 배열에 값을 그대로 대입하기 편하게 하기 위해
		for(int i = 3; i<arr.length-1; i++) { //어차피 맨 마지막 값은 필요없엇 .length-1 한것
			arr[i] = arr[i+1];
		}
		
		// 기존의 배열보다 크기가 하나 작은 새 배열을 생성
		int[] temp = new int[arr.length-1];
		
		// 원본 배열의 값을 새 배열에 인덱스를 맞춰서 그대로 대입!
		// temp[0] = arr[0];
		// temp[1] = arr[1];
		// temp[2] = arr[2];
		for(int j=0; j<temp.length; j++) {
			temp[j] = arr[j];
		}
		
		System.out.println(Arrays.toString(temp));
		//temp 배열의 주소값을 arr에게 넘긴다
		arr = temp;
		temp = null; // temp의 주소값을 지워서 temp는 자동소멸되게 함! GB야 얼른 치워줘!
		
		System.out.println(Arrays.toString(arr));
		
	}

}
