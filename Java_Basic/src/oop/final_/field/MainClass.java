package oop.final_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person kim = new Person("김철수");
//		kim.nation = "미국"; (X)
//		kim.name = "김마이클"; (X)
		kim.age = 30;
		
		Person park = new Person("박영희");
//		park.nation = "영국"; (X)
//		park.name = "박영국"; (X)
		
	}

}
