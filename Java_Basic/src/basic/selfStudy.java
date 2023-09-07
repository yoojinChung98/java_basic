package basic;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class selfStudy {

	
    public static void main(String[] args) {
		
    	FileWriter fw = null;

		try {
			fw = new FileWriter("C:/User/yooji/Desktop/test1.txt");

			// \r: 캐리지 리턴 -> 커서를 맨 앞으로 땡기는 동작.
            // \n: 줄 개행(줄바꿈)
            // 상황과 환경에 따라서 줄 개행 시 커서를 맨 앞으로 안땡겨주는 경우가 있습니다.
			String str = "첫번째 문장입나더,"; //\r: 캐리지리턴. 커서를 맨 앞으로 땡기고 줄개행

			fw.write(str);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    	
//    	FileWriter fw = null;
//
//    	try{
//    			
//    			fw = new FileWriter("C:/User/yooji/Desktop/test1.txt");
//
//    			String str = "첫번째 문장입니다.";
//    			
//    			fw.write(str);
//
//    	} catch (Exception e) { // 예외처리부분 대충 썼으니 자세히는 상단의 FileOutputStream 참조
//    			e.printStackTrace();
//    	} finally {
//    			try {
//					fw.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//    	}
//    	System.out.println("프로그램이 정상 종료");
	}
}	

