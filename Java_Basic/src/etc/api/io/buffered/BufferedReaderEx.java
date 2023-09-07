package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderEx {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:/MyWork/hello.txt");
			br = new BufferedReader(fr);
			
			//BufferedReader에는 readLine() 메서드가 있고
            //한 줄을 통째로 읽어서 String으로 리턴합니다.
            //더 이상 읽어들일 데이터가 없다면 null을 리턴.
//			System.out.println((char)br.read()); //br.read() = 50504 ....번째 글자? 아마도 유니코드 문자가 온것
//			System.out.println(br.readLine()); // 한 줄씩 읽어서 String 타입으로 반환
//			System.out.println(br.readLine()); // 
//			System.out.println(br.readLine()); // 해당 파일은 2줄밖에 없으므로 마지막엔 null이 반환됨.(없다고)
			
			String str;
			while((str=br.readLine()) != null) {
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
