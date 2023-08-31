package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

//		Person kim = new Person("김철수", 32, "남자");
//		Person lee = new Person("이영희", 25, "여자");
//		Person park = new Person("박뽀삐", 50, "남자");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
		
		//100명이면 어떻게 이걸 다 하나하나 다 써.... 함... 반복문 돌려...? 제어변수는... 배열로 담아서 걍 돌려?
		
//		int[] arr = new int[5];
//		Person[] people = new Person[3];
//		people[0] = new Person("김철수", 32, "남자");
		
//		int[] arr = {1, 2, 3, 4, 5};
		Person[] people = {
				new Person("김철수", 32, "남자"),
				new Person("이영희", 25, "여자"),
				new Person("박뽀삐", 50, "남자")
		};
//		System.out.println(Arrays.toString(people));
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();	
		
//		for(int i = 0; i<people.length; i++) {
//			people[i].personInfo();
//		}
		
		// 너 진짜 향상포문좀 연습해야돼.... 
		for(Person p : people) {
			p.personInfo();
		}
		
		
		
	}

}
