package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		
		/*
	    1. 파일을 읽어들이는 데 사용하는 클래스는 FileInputStream 입니다.
	    2. 생성자의 매개값으로 읽어들일 파일의 전체 경로를 적습니다.
	    3. InputStream 객체는 생성자에 throws가 있기 때문에
	     예외처리를 진행하셔야 합니다.
		*/
			
		FileInputStream fis = null; //나중에 finally에서 close하기 위해 변수선언만 해둠
			
		try {
			fis = new FileInputStream("C:/MyWork/test.txt");
			
			/*
			while(true) {
				int data = fis.read(); // 1바이트 단위로 데이터를 읽어들임. (즉, 지금은 1바이트만 읽어온것! 다 읽어오려고 while 돌림)
				System.out.print((char)data); //숫자형을 문자형으로 변환 출력. //그냥 int로 출력하면 256나오더라
				if(data == -1) break; //read() 메서드는 더 이상 읽을 데이터가 없을 때 -1 반환.
				// 한글은 한글자당 2바이트라서 깨지는 것! 그래서! 문자를 받아올 땐 문자입력기반 reader를 쓰는 것!
			}
			*/
			
			byte[] arr = new byte[100];
			int result = fis.read(arr); // 배열에 지정한 크기만큼을 단위로 나눠읽음 즉, 100바이트 단위로 나눠서 읽겠음. 100바이트로 뭉텅 잘라서 읽고, 그담 100바이트 뭉텅 읽고 담고, 요런 느낌인 것 같은데
			System.out.println(Arrays.toString(arr)); //[72, 101, 108, 108, 111, 33, 32... 각 아스키코드 H e l l ...
			System.out.println(result); // 읽어들인 데이터의 길이: 33
			
			int i = 0;
			while(arr[i] != 0) { //바이트배열의 기본값 = 0. 즉 문자값이 있으면 돌고 없으면(비게되면) 멈춰라!
				System.out.print((char)arr[i]);
				i++;
			}

			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//시스템 자원 반납.
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
}
