package basic.array;

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
            	
        		System.out.printf("사번을 입력해주세요.\n> ");
        		String tNum = sc.next().trim();//임시 사번 변수에 입력값 대입.

            	numCheck: while(true) { // 사번 중복체크 무한반복 while문
            		
            		if(count == 0) {// 최초 등록이라면 사번체크 할 필요 없으므로 나오기.
            		break numCheck; 
            		}
            		
            		// 여기서 마지막 사번인지는 체크하지 않아도 될 것 같아! 어차피 continue 때려도 얘는 범위를 넘어가면 for문이 끝나버리니까.
            		for(int i=0; i<count; i++) { // 사번 나열을 위한 i반복
            			if(i != count-1) { //마지막 순서 사번인지 체크(계속 다음 사번과 비교해야 하니까)
            				if(!tNum.equals(userNums[i])) {
            					continue; //i번째 사번과 값이 일치하지 않으면 다음번 사번으로 변경
            				}else { 
            					System.out.printf("%s은(는) %s의 사번과 중복되므로 사용이 불가합니다.\n",tNum,names[i]);
            					break; //i번째 사번과 값이 일치한다면 for문 빠져나가 사번 다시 받기.
            				}
            			} else { //마지막 사번이라면 (
            				if(!tNum.equals(userNums[i])){
            				break numCheck;
            				}else { 
            					System.out.printf("%s은(는) %s(%s)의 사번과 중복되므로 사용이 불가합니다.\n"
            							,tNum,names[i],departments[i]);
            					break;
            				}
            			}
            		}// for 문 끝
            		System.out.print("새로운 사번을 입력해주세요: ");
            		tNum = sc.next();
            		
            	}// while문(numCheck) 끝
            	
            	userNums[count]=tNum;
            	tNum = null;

            	
            	System.out.print("사원의 이름을 입력해주세요: ");
            	names[count] = sc.next().trim();
            	
	            ageCheck: while(true) {//100세 이하로 나이값 체크
	            	System.out.print("사원의 나이를 입력해주세요: ");
	            	String tAges = sc.next().trim();
	            		if(Integer.parseInt(tAges)<100) {
	            			ages[count] = Integer.parseInt(tAges);
	            			break ageCheck; // 나이 저장 후 ageCheck 반복문 탈출
	            			} 
	            		else System.out.print("잘못된 값을 입력하였습니다. ");
	            }
            		
            	
            	System.out.printf("사원의 부서명을 입력해주세요: ");
            	departments[count] = sc.next().trim();
            	System.out.println("사원 등록이 완료되었습니다.");
            	count++;
            	
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
            	// 여기서 사번 받기
            	System.out.printf("검색할 사원의 사번을 입력하세요.\n> ");
            	String tNumS = sc.next().trim();
            	boolean flagS = false;
            	for(int i=0; i<count; i++) { // 사번 나열을 위한 i반복
            		if(! tNumS.equals(userNums[i])) {//i번째 사번과 값이 일치하지 않으면 
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
            	
            	
//-----------------------4. 사원 정보 수정-----------------------------  
            }else if(menu == 4) {
            	//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록(사번 이름은 고정)
                //프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
                //사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
                //사번이 존재하지 않는다면 없다고 얘기해 주세요.
            	
            	System.out.printf("수정할 사원의 사번을 입력하세요.\n> ");
            	String numM = sc.next().trim();
            	boolean flagM = false;
            	
            	emModify: while(true) {
	   
	            	for(int i=0; i<count; i++) { // 사번 나열을 위한 i반복
	            		if(numM.equals(userNums[i])) { //i번째 사번과 값이 일치하면 수정 후 while문을 빠져나오고 끝.
	            			flagM = true;
	    					System.out.printf("%s(%s)의 정보를 수정합니다.\n 어떤 정보를 수정하시겠습니까?\n"
	    							+ "1. 나이변경    2. 부서변경    3. 취소\n> ",names[i], departments[i]);
	    					String tNumM = sc.next().trim();
	    					
	    					switch(tNumM) { //입력 값에 따라 해당 값을 수정.
	    					
	    					case "1" : case "나이": case "나이수정": case "1.나이수정": case "1. 나이수정":
	    						//나이수정 로직
	    						System.out.printf("변경할 나이를 숫자로 입력해주세요.(예: 32)\n> ");
	    						ages[i] = sc.nextInt();
	    						break;
	    					
	    					case "2" : case "부서": case "부서변경": case "2.부서변경": case "2. 부서변경":
	    						//부서변경 로직
	    						System.out.printf("변경할 부서명을 입력해주세요.\n> ");
	    						departments[i] = sc.next().trim();
	    						break;
	    						
	    					case "3" : case "취소": case "3.취소": case "3. 취소":
	    						//취소 로직(메인화면으로 돌아가기)
	    						System.out.println("사원 정보 수정을 취소합니다.");
	    						System.out.print("메인 화면으로 돌아갑니다.\n\n");
	    						numM = null;
	    						continue mainProgram;
	    						
	    					default: // 잘못된 값을 입력했을 때,
	    						System.out.println("잘못된 값이 입력되었습니다. 원하시는 메뉴의 숫자만 입력해주세요");
	    						i--;
	    						continue; // i-1값을 가지고 for문으로 돌아감.
	    						
	    					}// switch문 끝
	    					System.out.printf("수정 완료: 사번: %s  이름: %s  나이: %d  부서명: %s\n"
	    							,userNums[i], names[i], ages[i], departments[i]);
	    					numM = null;
	    					break emModify; // 수정 후 emModify while문 종료.
	            				            			
	            		} else if (i!=count){ // i번째와 사번값이 불일치하며(디폴트) 마지막 사번은 아닌 경우 continue
	            			continue; // 다음 사번 반복을 위해 continue;
	            			
	            		} else break; // for문 그냥 나가기...
	            	}// for문 끝
	            	
            	if(!flagM) {
            		System.out.println("조회하신 사원의 정보가 없습니다."); //사원정보를 찾지 못해서 flag 가 여전히 false라면 정보x
            		System.out.println("검색할 사원의 사번을 입력하세요. ");
	            	System.out.printf("검색을 중단하고 메인화면으로 돌아가고 싶다면 '중단'을 입력하세요.\n> ");
	            	numM = sc.next();
	            	if (numM.equals("중단")) {
	            		System.out.printf("사원 정보 수정을 중단합니다.\n\n");
	            		numM = null;
	            		continue mainProgram; // 중단을 입력받은 경우에만 메인화면으로 돌아감. 이외의 값을 입력받으면 emModify의 처음으로 돌아감.
	            	}
            	}
            	
            	}// while문 끝
            	
            	
//-----------------------5. 사원 정보 삭제-----------------------------              	          	
            }else if(menu == 5) {
            	//사번을 입력받아서 
                //해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
                //삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
                //y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
                //배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
                //앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
            	
            	boolean flagD = false;
            	emDel: while(true) {
            		System.out.printf("정보를 삭제할 사원의 사번을 입력하세요.\n> ");
            		System.out.printf("삭제를 중단하고 메인화면으로 돌아가고 싶다면 '중단'을 입력하세요.\n> ");
            		String tNumD = sc.next();
            		if (tNumD.equals("중단")) {
            			System.out.printf("사원 정보 삭제를 중단합니다.\n\n");
            			tNumD = null;
            			continue mainProgram; // 중단을 입력받은 경우에만 메인화면으로 돌아감. 이외의 값을 입력받으면 emModify의 처음으로 돌아감.
            		}
            	
            	for(int i=0; i<count; i++) { // 사번 나열을 위한 i반복
            		
            		if(tNumD.equals(userNums[i])) {//i번째 사번과 값이 일치하면, 정말 삭제할건지 먼지 묻기
            			flagD= true;
            			System.out.printf("사번: %s  이름: %s  나이: %d  부서: %s\n해당 사원의 정보를 정말 삭제하시겠습니까? [Y/N]"
            					,userNums[i], names[i], ages[i], departments[i]);
            			String tempD = sc.next();
            			
	            		switch(tempD) {	// y 이면 삭제, 마지막칸 기본값으로 만들기, n이면 메인화면으로 돌아가기, 잘못입력받았다면 값 다시받기
	            		
	            		case "y": case "Y": case "ㅛ": case "yes": case "Yes": case "ㅛㄷㄴ": case "예": case "네":
	            			// 인덱스 값에 해당하는 데이터를 삭제하고 배열에 새로 배치하기.
	            			// for문을 새로 짜서 j이후의 값들을 앞으로 땡겨주기
	            			if(i != userNums.length-1) {
		            			for(int j=i; j<count; j++) {
		            				userNums[j] = userNums[j+1];
		            				names[j] = names[j+1];
		            				ages[j] = ages[j+1];
		            				departments[j] = departments[j+1];
		            			}// 앞으로 다 땡겨준 후, 마지막 값은 기본값으로 초기화하기(정보 조회시에 나오지 않도록 하기 위해.그냥 count--로 퉁침)
	            			}
	            			userNums[count] = null;
            				names[count] = null;
            				ages[count] = 0;
            				departments[count] = null;
	            		count--;
	            		System.out.println("입력하신 사원의 정보 삭제를 완료하였습니다.\n메인화면으로 돌아갑니다.\n\n");
	            		tNumD = null;
	            		continue mainProgram; // case 탈출
	            		
	            		case "n": case "N": case "ㅜ": case "no": case "No": case "ㅜㅐ": case "아니오": case "아니요":
	            			System.out.println("사원 정보 삭제를 중단합니다.");
	            			tNumD = null;
		            		continue mainProgram;
		            	
	            		default :
	            			System.out.println("잘못 입력하셨습니다.\n\n");
	            			i--;
	            			continue;
	            			}// switch문 종료
	            		
	            	}else if(i!=count) { //일치하지 않는데(디폴트) 마지막이 아닌 경우
	            		continue; // 다음번 사번으로 변경
	            		
	            	} else { //일치하지 않는데 (디폴트) 마지막인 경우
	            		break; // for문 나가서 뭐 다시받던지 그런 작업 해야할듯
	            	}
            	}// 사번나열 for문 종료

            	if(!flagD) System.out.println("입력한 사번과 일치하는 사원의 정보가 없습니다."); 
            	
            	} //emDel while(true)문 끝	
            	
	            		
//-----------------------6. 프로그램 종료-----------------------------          	           	
            	
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
