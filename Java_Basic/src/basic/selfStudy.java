package basic;
import java.util.Arrays;
import java.util.Scanner;
public class selfStudy {

	/*
	 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
	 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
	 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	 */
    
	public String solution(String my_string, String overwrite_string, int s) {
        
		String answer = "";
    	
		String forward = my_string.substring(0,s);
		String backward = my_string.substring(s+overwrite_string.length());
		answer = forward + overwrite_string + backward;
      
        return answer;
    }
    public static void main(String[] args) {
		
    	selfStudy s = new selfStudy();
    	System.out.println(s.solution("Program29b8UYP","merS123",7));
    	
	}
}	

