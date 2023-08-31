package oop.obj_arr;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		/*
        - 스캐너를 이용하여 Person객체를 생성하는 데 필요한
         정보를 입력받으시면 되겠습니다.
         입력받은 정보를 토대로 Person객체를 생성한 후
         여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.
         
        - 배열의 크기는 3개로 하겠습니다. 반복문을 이용하여
         입력을 반복해서 받아주시면 됩니다.
         
        - 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여
         각 객체의 personInfo()를 호출해 보세요. 
        */
		
		Scanner sc = new Scanner(System.in);
		
		Person[] people = new Person[3];
		
		//향상for문 진쯔 으릅드
		
//		for(int i=0; i<people.length; i++) {
//			System.out.print("이름을 입력하세요: ");
//			String name = sc.next();
//			System.out.print("나이를 입력하세요: ");
//			int age = sc.nextInt();
//			System.out.print("성별을 입력하세요: ");
//			String gender = sc.next();		
//			people[i] = new Person(name, age, gender);
//		}
		
//		for(Person p : people) { //여기서 people 의 기본값은 null...?
//			System.out.print("이름: ");
//			String name = sc.next();
//			System.out.print("나이: ");
//			int age = sc.nextInt();
//			System.out.print("성별: ");
//			String gender = sc.next();
//			p = new Person(name, age, gender);
//			// 여기서 문제는!
//			// 향상for문은! 이미 완성된 배열의 '값'을 꺼내서 Person타입의 p에다 담는거야! 
//			// 뭐 그래 Person 타입의 p에 new Person(name, age, gender);를 담았다 쳐!
//			// 그러면? people 배열에 영향을 미쳐? 못 미치지? 단절돼있잖아! 뭔상관이야? 값을 꺼내와서 p에 담아서 p에서 다했는데
//			// 그걸 다시 people에 넣는다던지의 행위를 했어? 아니지? 그러면 당연히 people은 여전히 비어있겠지!
//			// 그러니까 밑의 출력문이 작동하지 않지... 왜냐면 people은 여전히 비어있으니까...
//		}
		
		// 객체를 먼저 생성해서 객체 속에 값을 직접 입력하는 방식
//		for(int i=0; i<people.length; i++) {
//			people[i] = new Person();
//			
//			System.out.print("이름: ");
//			people[i].setName(sc.next());
//			System.out.print("나이: ");
//			people[i].setAge(sc.nextInt());
//			System.out.print("성별: ");
//			people[i].setGender(sc.next());
		
//			System.out.println("*** 정보 입력 완료 ***\n");
//		}
		
		
		
		//출력
		for(Person p : people) {
			p.personInfo();
		}
		
		sc.close();
		
	}

}
