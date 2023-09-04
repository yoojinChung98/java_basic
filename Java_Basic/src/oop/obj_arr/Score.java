package oop.obj_arr;


public class Score {

	/*
- 이름, 국어, 영어, 수학, 총점, 평균(double)을
 담을 수 있는 객체를 디자인하세요.
 
- 학생의 모든 정보를 한 눈에 확인할 수 있게
 scoreInfo() 메서드를 선언해 주세요.
 메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
 
- 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
	 */
	
	private String name;
	private int korean;
	private int english;
	private int math;
	private int total;
	private double average;
	
	Score() {}
	
	

	public Score(String name, int korean, int english, int math) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.total = korean+english+math;
		this.average = total/3.0;	
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
	
	
	
	public void scoreCalc() {
		total = korean+english+math;
		average = total/3.0;	
	}
	
	public void scoreInfo() {
		System.out.printf("이름: %s   국어성적: %d   영어성적: %d   수학성적: %d   총점: %d   평균: %.2f\n"
				,name, korean, english, math, total, average );
	}
	
	

	
	
	
	
	
	
	
	
}
