package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ForBook {
	public static void main(String[] arg) {
		//파일 경로와 내용물 설정 바꾸고 질문하기
		//test.txt 파일에 This is the first part of the text file.만 입력하고 실행하면(길이가 40이더라)
		//This is the first part of the text file.text file.text file.text file.text..... 이렇게 나오는데
		//왜 끝부분이 반복되어서 나오는거지? 
		//내 생각엔, 더이상 읽을 데이터가 없어서 마지막 arr은 [0,0,...,0]이 되므로 for문에서 break;되어야 하는데
		//현실은 read()가 데이터를 읽어오지 못해서 마지막 arr을 초기화 하기도 전에 ( 엥 이제 읽을거 없어!하면서 -1반환하고 arr은 건들지도 못하는건가?)
		//그래서 arr은 꽉차있는 그대로 계속 while문을 돌고 있는건가? 
		// 아닌것 같은데... 배열을 9로 놔둬도 계속 끝내용이 반복되는데....?
		
		//배열을 9로 놓고 if(fis.read(arr)== -1) break; 걸어 놓으니
		// This is the first part of the text file.ext f이렇게 뜬다...
		
		// read의 메커니즘을 모르겠음. 왜 마지막 arr을 어거지로 꽉 채워놓는거지?
		// 어거지로 꽉 채워놓는게 아니라... arr이 이미 차있고, read()내가 읽은거 하나씩 채우다가 어? 이제읽을거 없네? 하고 멈추는건데...
		// 그럼 뒤에 남아있던건 그대로 냅두고.... 나머지 4개 읽었으니 4반환하고(if(res == -1) break;) 여기서 안걸림...
		// 그리고 포문 돌리러갔는데, 뒤에 남아있는거 그대로 뒀으니까 당연히 꽉차있고(ile.ext f이렇게 출력됨). while 다시 돌리는데
		// 이번엔 처음부터 읽을 게 없으니까 -1반환. (if(res == -1) break;) 여기서 걸림. while문 탈출. 끝. 
		
		
		FileInputStream fis = null;  //생성자,반납에 throw있어서 외부에서 선언과 초기화.
		
		try{
				fis = new FileInputStream("C:\\Users\\ict\\Desktop\\test.txt");
				//존재하지 않는 파일을 읽으면 당연히 터지겠지?
				
				byte[] arr = new byte[9];
				while(true) {
					int res = fis.read(arr);
					
					if(res == -1) break;
					for(byte b :arr) {
						if(b==0) break;
						System.out.print((char)b);
					}
					
				}

				
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
