package etc.api.util.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysExample {

	public static void main(String[] args) {
		
		//배열의 복사 (복사할 배열, 어디미만까지 복사?)
		char[] arr = {'J', 'A', 'V', 'A'};
		char[] arr2 = Arrays.copyOf(arr, arr.length);
		char[] arr3 = Arrays.copyOfRange(arr2, 1, 3);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//배열의 탐색: binarySearch(배열, 검색할 값)
		//반드시 정렬이 선행되어야 합니다! (이진탐색을 하기 때문 : 반쪼개서 체크하고 또 반쪼개서 탐색하고 그거)
		
		int[] numbers = {1,3,5,7,9,11,13};
		System.out.println("9의 위치: "+Arrays.binarySearch(numbers, 9)); //9 위치의 인덱스 반환.
		
		//배열의 정렬
		Integer[] nums = {42, 11, 35, 88, 34, 100};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//역순정렬(내림차 정렬) (Integer[](객체배열)을 지원)
		Arrays.sort(nums, Collections.reverseOrder());
		System.out.println(Arrays.toString(nums));
		
		//배열 내부 요소가 모두 동일한지의 여부 확인 (반환형 boolean)
		System.out.println(Arrays.equals(arr, arr2));
		
				
		
		
	}
	
}
