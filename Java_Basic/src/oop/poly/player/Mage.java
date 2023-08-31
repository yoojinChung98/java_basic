package oop.poly.player;

public class Mage extends Player{
	
	int mana;
	
	Mage() {}
	
	Mage(String name){
		super(name);
		this.mana = 100;
	}
	
	public void blizzard(Player... victims) {
		//player 타입으로 각 캐릭터를 받아올 것(배열로 감싸져서 들어올거야)! 이 배열 변수 이름은 victims! 
		//player 타입 안에는 m2... 각 직업객체의 주소값이 들어올 것.
		System.out.printf("%s님이 눈보라 시전!!\n",this.name);
		//마나깎기
		this.mana -= 10;
		System.out.printf("%s님의 정신력이 10 소모되었습니다. (남은 정신력: %d)\n"
				,this.name, this.mana);
		System.out.println("-----------------------------");
		
		
		for(int i=0; i<victims.length; i++) {
			//난수생성
			int d = (int)(Math.random()*6+10);
			//피깎기
			victims[i].hp -= d;
			//출력
			System.out.printf("%s님이  %d의 피해를 입었습니다. (남은 체력: %d)\n"
					,victims[i].name, d, victims[i].hp);
		}
//		for(Player p : victims) {
//		int damage = (int)(Math.random()*6+10);
//		p.hp -= damage;
//		System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n"
//				, p.name, damage, p.hp);
//	}
	} // blizzard 메서드 종료
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정신력: " + mana);
	}

}
