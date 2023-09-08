package etc.api.io.buffered;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import etc.api.io.folder.CreateFolder;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
        1. LocalDate클래스를 이용해서 MyWork폴더 내에 하위 경로로
         오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
               각 문장은 줄 개행을 포함합니다.
        4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
        */
		
		LocalDate nw = LocalDate.now();
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyyMMdd");
		String folderName = nw.format(fm);
		
		File folder = new File("C:/MyWork/"+folderName+"file"); 
		
		if(!folder.exists()) folder.mkdir();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명을 입력하세요. > ");
		String fileName = sc.next();
		sc.nextLine();
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:/MyWork/"+folderName+"file/"+fileName+".txt");
			StringBuilder strB = new StringBuilder();
			
			while(true) {				
				System.out.println("파일에 삽입할 내용을 입력하세요");
				System.out.println("삽입 중단을 원하신다면 '그만'을 입력해주세요.");
				String s = sc.nextLine();
				if(! s.equals("그만")) {
					strB.append(s);
				} else break;
			}//while end
			
			fw.write(strB.toString());	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				System.out.println("파일에 내용 삽입을 중단합니다.");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		System.out.println("********* 파일 내부 출력을 시작합니다.");
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:/MyWork/"+folderName+"file/"+fileName+".txt");
			
			while(true) {
				char[] arr = new char[150];
				int result = fr.read(arr);
				
				if(result==-1) break;
				System.out.print(arr);					
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		sc.close();
		
	}

}
