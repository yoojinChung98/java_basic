package oop.poly.player;

public class Warrior extends Player {
	
	int rage;
	Warrior() {}
	
	//JVM이 생성해주는 가장 기본적인 생성자 (부모 클래스가 있네~)
	Warrior(String name) {
		super(name);
		this.rage = 60;
	}
	
	public void rush(Player target) {
		/*
        - 전사의 고유 기능인 rush 메서드를 작성합니다.
        
        - rush의 대상은 모든 직업들 입니다.(타겟이 한명)
        
        - 만약 rush의 대상이 전사라면 10의 피해를 받고,
         마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
         
        - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
        
        - 남은 체력도 출력해 주세요.
        
        - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
        */
		
		System.out.printf("%s님이 %s님에게 돌진!! \n", this.name, target.name);
//		선생님이 써주신 코드가 훨씬 깔끔하다!
//		if(target instanceof Warrior) {
//			target.hp -= 10;
//			System.out.printf("%s님이  10의 피해를 입었습니다. (남은 체력: %d)\n\n",
//					target.name, target.hp);
//		} else if (target instanceof Mage) {
//			target.hp -= 20;
//			System.out.printf("%s님이  20의 피해를 입었습니다. (남은 체력: %d)\n\n",
//					target.name, target.hp);
//		} else if (target instanceof Hunter) {
//			target.hp -= 15;
//			System.out.printf("%s님이  15의 피해를 입었습니다. (남은 체력: %d)\n\n",
//					target.name, target.hp);
//		}
		
		int damage; String job;
		if(target instanceof Warrior) {
			damage = 10; job = "전사";
		} else if (target instanceof Mage) {
			damage = 20; job = "마법사";
		} else {
			damage = 15; job = "사냥꾼";
		}
		
		target.hp -= damage;
		System.out.printf("%s님(%s)이 %d의 피해를 입었습니다. (남은 체력: %d)\n",
				target.name, job, damage, target.hp);
		System.out.println("--------------------------------");
		
		
		
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: "+rage);
	}

}
