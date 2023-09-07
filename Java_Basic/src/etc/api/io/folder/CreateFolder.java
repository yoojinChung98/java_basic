package etc.api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		/*
		 - 자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용합니다.
		 - 생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정합니다.
		 */
		
		File file = new File("C:/MyWork/forlder_test/test/mytest/apple");
		
		if(!file.exists()) { //해당 파일 및 폴더가 존재하면 true, 존재하지 않다면 false
			file.mkdir(); // mkdir()메서드는 만들고자 하는 경로의 상위 디렉토리가 존재하지 않는다면 동작x. 새로운 폴더를 하나밖에 못만듬! 경로를 만들어라!
			file.mkdirs(); // 여러개는 s. 설정한 경로에 필요한 새폴더 모두 생성.
			System.out.println("폴더 생성 완료!");
		}else {
			System.out.println("해당 폴더가 존재합니다.");
		}
		
		
	}
	
}
