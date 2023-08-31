package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior("전사1");
		Warrior w2 = new Warrior("전사2");
		Mage m1 = new Mage("마법사1");
		Mage m2 = new Mage("마법사2");
		Hunter h1 = new Hunter("사냥꾼1");
		Hunter h2 = new Hunter("사냥꾼2");
		
		/*
        1. Mage는 blizzard라는 광역 기술(메서드)을 가지고 있습니다.
        
        2. Mage 클래스에 blizzard라는 메서드를 완성하세요.
        
        3. 메서드 호출부에 들어갈 매개값으로 알맞은 매개변수를 선언하세요.
         광역 마법이기 때문에 타겟이 여러 명이어야 합니다.
         그런데 매개변수는 하나입니다.
         ex) m1.blizzard(???); (배열 쓰라는 소리에요.)
         
        4. blizzard라는 기술을 시전하는 캐릭터의 이름을 적절한 키워드를
         사용하여 출력해 보세요.
         
        5. 피해량(데미지)은 10 ~ 15사이의 난수를 발생시켜서
         타겟들에게 각각 적용해 주세요.
         
        6. 기본 객체의 hp는 50입니다. hp에서 피해량을 뺀 남은 체력을
         출력해 주세요.
         
         - 그리고 마나도 줄어야겠지!
        */
		
		//player 타입의 배열로 각 캐릭터를 받아올 것!
		//player 타입 안에는 m2... 각 직업객체의 주소값이 들어올 것.
		
		// 값을 넣으면 배열로 만들어주는 메서드를 하나 만들까?  ㄴㄴ
		// 값을 여러개를 받겠다 = 배열로 받겠다!
		
		
		
		
		m1.blizzard(w1, w2, m2, h1, h2);  // 나는 가변인수로 받았음.
		
//		Player[] targets = {w1, w2, m2, h1, h2};	
//		m1.blizzard(targets);
		// 영구적으로 형변환이 되는건 아니다~ Player로 형변환이 필요해서 변환한동안만 변환되어있는거다!
		
		w1.attack(m1);
		m1.attack(w1);
		
		
		
	}

}
