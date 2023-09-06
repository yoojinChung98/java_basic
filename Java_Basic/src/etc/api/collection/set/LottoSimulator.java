package etc.api.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

static Random r = new Random();
    
    static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
    static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
    static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
    static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
    static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
    static int failCnt = 0; // 당첨 횟수를 세 줄 변수
    
    
    public static Set<Integer> createLotto() {
        /*
         - 1~45 범위의 난수 6개를 생성하셔서
          컬렉션 자료형에 모아서 리턴해 주세요.
          무엇을 쓰든 상관하지 않겠습니다.
          중복이 발생하면 안됩니다.
         */    
    	Set<Integer> lotNum = new HashSet<>();
    	
    	while(lotNum.size()<6) {
    		lotNum.add(r.nextInt(45)+1);
    	}
    	return lotNum;
    }
    
    
    //보너스 번호를 생성하는 메서드
    public static int createBonusNum(Set lotNum) {
        
        /*
         - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
          당첨번호들을 피해서 보너스번호 하나만 뽑아 주세요.
          범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
         */
	
    	while(true) {
    		int bonusNum =(r.nextInt(45)+1);
    		if(lotNum.contains(bonusNum)) continue;
    		return bonusNum;
    	}
    }
    
    //당첨 등수를 알려주는 메서드
    public static void checkLottoNumber(Set lotNum, Set myNum, int bonusNum) {
        /*
         매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
         내 로또 번호와 당첨번호를 비교하여
         일치하는 횟수를 세 주신 후 등수를 판단하세요.
         판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
         6개 일치 -> 1등
         5개 일치 + 보너스번호 일치 -> 2등
         5개 일치 -> 3등
         4개 일치 -> 4등
         3개 일치 -> 5등
         나머지 -> 꽝
         */
    	//for문 돌려서 cnt++ 로 개수 체크하면 될듯
    	
    	//번호 하나마다 for문 돌리기엔 너무 시간이 아까운데...
    	//contains으로 쓸 수 있나?
    	Iterator<Integer> iter = lotNum.iterator(); 
    	
    	int n = 6;
    	if( ! myNum.contains(iter.next())) n--;
    	if( ! myNum.contains(iter.next())) n--;
    	if( ! myNum.contains(iter.next())) n--;
    	if( ! myNum.contains(iter.next())) n--;
    	if(n<3) { failCnt++; return; }
    			else if( ! myNum.contains(iter.next())) n--;
    	if(n<3) { failCnt++; return; }
    			else if( ! myNum.contains(iter.next())) n--;
	
    	
    	if(n==6) { prize1++; return; }
    	if(n==5) {if(myNum.contains(bonusNum)) { prize2++; return; }  prize3++; return;}
    	if(n==4) { prize4++; return; }
    	if(n==3) { prize5++; return; }
    }
    
	
	public static void main(String[] args) {

//		long a = System.currentTimeMillis();
	
		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 "고정"시키세요.
		Set<Integer> lotNum = createLotto();
        System.out.println(lotNum);
		
        //보너스번호도 하나 "고정"시키세요.
		int bonusNum = createBonusNum(lotNum);
		System.out.println(bonusNum);
        
		System.out.println("*** 무지성 로또 구매를 시작합니다 ***");
        while(true) { 
        	
        	Set<Integer> myNum = createLotto();
        	checkLottoNumber(lotNum, myNum, bonusNum);
        	
        	if(prize1==1) {
        		long total = prize1+prize2+prize3+prize4+prize5+failCnt;
        		System.out.println("-----------만세! 드디어 1등에 당첨되었습니다!");
        		System.out.printf("1등 당첨횟수: %d회\n",prize1);
        		System.out.printf("2등 당첨횟수: %d회\n",prize2);
        		System.out.printf("3등 당첨횟수: %d회\n",prize3);
        		System.out.printf("4등 당첨횟수: %d회\n",prize4);
        		System.out.printf("5등 당첨횟수: %d회\n",prize5);
        		System.out.printf("총 구매횟수: %d회\n", total);
        		System.out.printf("총 로또 구매 비용: %d원\n",total*1000);
        		break;
        	}
        	
            /*
             - 1등이 당첨 될 때까지 반복문을 돌립니다.
             - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
              반복문을 종료합니다.
             - 로또를 구매하기 위한 금액도 출력하세요. (long)
             */
        }
//        long b = System.currentTimeMillis();
//        System.out.println((b-a)*0.001);
		
		
	}

}
