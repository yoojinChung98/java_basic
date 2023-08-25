package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names  = new String[100];
		int[] ages = new int[100];
		String[] departments  = new String[100];
		
		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;
		
		mainProgram: while(true) {
			
			System.out.println("\n========== 사원 관리 프로그램 ==========");
            System.out.println("# 1. 사원 정보 신규 등록");
            System.out.println("# 2. 모든 사원 정보 보기");
            System.out.println("# 3. 사원 정보 검색");
            System.out.println("# 4. 사원 정보 수정");
            System.out.println("# 5. 사원 정보 삭제");
            System.out.println("# 6. 프로그램 종료");            
            System.out.println("====================================");
        
            System.out.print("> ");
            int menu = sc.nextInt();
            
//-----------------------1. 사원 정보 신규 등록-----------------------------
            
            if(menu == 1) {
                //사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
                //사번은 중복되면 안됩니다. (이름,나이,부서는 ㄱㅊ)
                //(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
            	
            	System.out.printf("사원의 이름을 입력해주세요.\n> ");
            	
            	int eNum = (int)(Math.random()*99+1); //사번을 잠시 담을 변수
            	
            	numCheck: while(true) {
            		if(count == 0) {// 최초 등록이라면 사번체크 할 필요 없으므로 나오기.
            		System.out.println("최초등록입니다.");
            		break numCheck; 
            		}
            		
            		int tNum = (int)(Math.random()*99+1);//임시 사번 변수에 난수대입(1~100)
            		for(int i=0; i<count; i++) { // 사번 나열을 위한 i반복
            			if(i != count-1) { //마지막 순서 사번인지 체크
            				if(tNum != Integer.parseInt(userNums[i])) {
            					System.out.println(tNum+"은 사용이 가능합니다.");
            					continue; //i번째 사번과 값이 일치하지 않으면 다음번 사번으로 변경
            				}else { 
            					System.out.println(tNum+"은 사용이 불가능합니다.");
            					break; //i번째 사번과 값이 일치한다면 for문 빠져나가 난수부터 다시 받기
            				}
            			} else { //마지막 사번이라면
//            				System.out.println(tNum);
            				eNum = tNum;
            				System.out.println("마지막사번 검증이 끝났습니다.");
            				break numCheck;
            			}
            		}// for 문 끝
            	}// while문 끝
            	System.out.println(eNum);
            	System.out.println("while문 종료");
            	
            	userNums[count] = ""+(eNum);
            	names[count] = sc.next();
            	System.out.printf("사원의 나이를 입력해주세요.\n>");
            	ages[count] = sc.nextInt();
            	System.out.printf("사원의 부서명을 입력해주세요.\n>");
            	departments[count] = sc.next();
            	System.out.println("사원 등록이 완료되었습니다.");
            	count++;
            	
//            	System.out.println(Arrays.toString(userNums));
//            	System.out.println(Arrays.toString(names));
//            	System.out.println(Arrays.toString(ages));
//            	System.out.println(Arrays.toString(departments));
            	System.out.println("메인화면으로 돌아갑니다.");
            	continue mainProgram; //입력이 끝나면 메인화면으로 돌아가기

//-----------------------2. 모든 사원 정보 보기-----------------------------            	
            	
            }else if(menu == 2) {
            	//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
                //만약 사용자가 사원 등록을 한 명도 하지 않았다면
                //"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
            	
            	if(count == 0) System.out.println("등록된 사원 정보가 없습니다.");
            	else {
            		//데이터 출력하기
            		for(int i=0; i<count; i++) {            			
            			System.out.printf("사번: %s  이름: %s  나이: %d  부서명: %s\n"
            					, userNums[i], names[i], ages[i], departments[i]);
            		}
            		System.out.println("모든 사원의 정보 출력이 끝났습니다.");
            	}
            	System.out.println("메인화면으로 돌아갑니다.");
            	continue mainProgram; //입력이 끝나면 메인화면으로 돌아가기
            	
            	
//-----------------------3. 사원 정보 검색-----------------------------  
            	
            }else if(menu == 3) {
                //입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.(인덱스탐색)
                //입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
            	
            	//1. 사번체크 먼저!
            	// 여기서 숫자받기
            	System.out.printf("검색할 사원의 사번을 입력하세요.\n> ");
            	int tNumS = sc.nextInt();
            	boolean flagS = false;
            	for(int i=0; i<count; i++) { // 사번 나열을 위한 i반복
            		if(tNumS != Integer.parseInt(userNums[i])) {//i번째 사번과 값이 일치하지 않으면 
    					continue; // 다음번 사번으로 변경
    				}else { //i번째 사번과 값이 일치하면
    					flagS = true;
    					//i번째 사원정보 전부 출력
    					System.out.println("사번: "+userNums[i]);
    					System.out.println("이름: "+names[i]);
    					System.out.println("나이: "+ages[i]);
    					System.out.println("부서명: "+departments[i]);
    					break; // 출력 후 for문 종료.
    				} 
            	}// for문 끝
            	if(!flagS) System.out.println("조회하신 사원의 정보가 없습니다."); //사원정보를 찾지 못해서 flag 가 여전히 false라면 정보x
            		
            		
            		
            	
            	
            	
            	
            	
            	
            }else if(menu == 4) {
            	//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록(사번 이름은 고정)
                //프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
                //사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
                //사번이 존재하지 않는다면 없다고 얘기해 주세요.
            	
            }else if(menu == 5) {
            	//사번을 입력받아서 
                //해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
                //삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
                //y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
                //배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
                //앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
            	
            }else if(menu == 6) {
            	System.out.println("프로그램을 종료합니다.");
            	sc.close();
            	break; //while true break
            	
            }else {
            	System.out.println("메뉴를 잘못 입력하셨습니다.");
            }
		}// end while true
		
		
	}// end main

}
