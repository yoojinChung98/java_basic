package etc.api.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {
		
		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
        
        2. file폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
        
        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
        */
		
		Scanner sc = new Scanner(System.in);
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		System.out.println("파일명을 입력하세요: ");
		String name = sc.next();
		
		try {
			File file = new File("C:/MyWork/upload");
			if(!file.exists()) {
				file.mkdir();
			}
			
			oldFile = new FileInputStream("C:/MyWork/" + name + ".txt");
			newFile = new FileOutputStream("C:/MyWork/upload/" + name + ".txt");
			
			int result;
			byte[] arr = new byte[50];
			
			while((result = oldFile.read(arr)) != -1) {
				newFile.write(arr,0,result);
			}
			
	
		} catch (FileNotFoundException e) { //File의 경로가 실존하지 않으면 발생하는 예외?
			System.out.println("파일이나 경로를 찾을 수 없습니다.");
		} catch (IOException e) { //과정 중에 예외?
			System.out.println("파일 처리 중에 문제가 발생했습니다.");
		} finally {
			try {
				oldFile.close();
				newFile.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	
		
		/* 일단 나는 문제를 이해를 못했어^^
		Scanner sc = new Scanner(System.in);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File file = null;
		
		System.out.print("파일의 이름> ");
		String fName = sc.next();
		try {
			// file폴더와 파일 생성
			file = new File("C:/MyWork/file");
			if(file.exists()) {
				file.mkdir();
				System.out.println("file 폴더가 생성되었습니다.");
			}
			fos = new FileOutputStream("C:/MyWork/file/" + fName + ".txt");
			
			file = new File("C:/MyWork/file/" + fName + ".txt");
			if(!file.exists()) {
				fis = new FileInputStream("C:/MyWork/file/" + fName + ".txt");
				new File("C:/MyWork/upload").mkdir();
				fos = new FileOutputStream("C:/MyWork/upload/" + fName + ".txt");
			} else {
				System.out.println("파일명이 없습니다.");
			}
			
			
		} catch (Exception e) {
			System.out.println("파일 처리 중 예외 발생!");
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		sc.close();
		*/
		
		
		
		
		
	}

}
