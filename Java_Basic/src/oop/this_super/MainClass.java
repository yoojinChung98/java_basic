package oop.this_super;

public class MainClass {

	public static void main(String[] args) {

		Player p1 = new Player();
		p1.name = "플레이어1";
		p1.characterInfo();
		System.out.println("p1의 주소값: "+ p1);
		System.out.println("-------------------------------------");
		
		Player p2 = new Player("플레이어2");
		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();
		
		System.out.println("-------------------------------------");
		Player p3 = new Player("플레이어3", 200);
		p3.characterInfo();
		
		System.out.println("-------------------------------------");
//		p3.attack(p3);
		p3.attack(p2);
		p2.attack(p1);
		p1.attack(p3);
		
		System.out.println("-------------------------------------");
		
		Warrior w1 = new Warrior("전사짱장맨");
		w1.characterInfo();
		//Warrior와 Player가 같이 생성됨
		
	}

}
