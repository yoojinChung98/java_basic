package oop.encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
//		my.year = 1992; (x)
		my.setYear(1992);
		my.setMonth(99);
		my.setDay(13);
		
		my.birthInfo();
		
		
	}

}