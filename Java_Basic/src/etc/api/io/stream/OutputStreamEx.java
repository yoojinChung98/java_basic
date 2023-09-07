package etc.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {

		/*
        1. 파일을 쓸 때 (작성) 사용하는 클래스는 FileOutputStream 입니다.
        2. 생성자의 매개값으로 파일을 쓸 전체 경로를 지정합니다.
        3. io패키지의 모든 클래스들은 생성자에 throws 키워드가 있기 때문에
        try-catch 블록을 항상 작성해야 합니다.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명: ");
		String fileName = sc.next();
		
		FileOutputStream fos = null;
		//백슬래시가 하나만 적히면 탈출코드...\n 이거 기억나지? 백슬래시 표현을 위해선 \\두개를 그어야 하나가 표현돼!
		// 아니면 정방향 슬래시를 하나 써도 됨. C:\\MyWork    C:/MyWork
		try {
			fos = new FileOutputStream("C:/MyWork/" + fileName + ".txt");
			
			System.out.println("문장을 입력하세요: ");
			sc.nextLine(); // 파일명 작성 후 엔터 수거
			String str = sc.nextLine();
			
			byte[] arr = str.getBytes(); // 문자열 데이터르 바이트 데이터로 변환
			//OutPutStream은 바이트 기반 스트림! 이므로 인자를 바이트배열로 보내야해!
			fos.write(arr); //파일을 바이트 단위로 내려서 write. //그니까 FileOutputStream.write(바이트배열)
			System.out.println("파일이 정상적으로 저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
			//우리의 최종 경로이고, 파일이름과 파일타입..
			//만일 이 경로에 문제가 있다면 예외가 발생해서 throw될 거야!
		} finally {			
			try {
				//스트림을 더 이상 사용하지 않는 경우, 시스템자원을 반납하는 코드 반드시 작성!(메모리 누수 발생!)
				fos.close();
				//fos라는 객체가 아예 생성되지 않았을 수도 있잖아! 그러면 예외가 발생하자나! 그래서 얘도 throw가 된다!
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
