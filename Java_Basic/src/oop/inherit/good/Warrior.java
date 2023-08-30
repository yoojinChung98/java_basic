package oop.inherit.good;

public class Warrior extends Player {

	int rage;
	
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: "+rage);
	}
	
}
