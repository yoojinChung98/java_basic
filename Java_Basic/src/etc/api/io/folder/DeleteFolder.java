package etc.api.io.folder;

import java.io.File;
import java.util.Arrays;

public class DeleteFolder {

	public static void main(String[] args) {

		File file = new File("C:/MyWork/forlder_test/test");
		
		/*
		// 폴더 하나 지우기
		if(file.exists()) {
			file.delete(); // 삭제기능, 삭제 완료시 true; 실패시 false; 삭제 완료를 확인하고 싶다면 boolean타입으로 확인해보면 됨.
			System.out.println("삭제완료!");
		} else {
			System.out.println("삭제 실패 or 경로가 존재하지 않음!");
		}
		*/
		
		
		/*
		 - 폴더를 삭제할 때, 해당 폴더에 내부 경로가 더 존재하거나, 파일이 있는 경우에는 폴더를 삭제할 수 없음.
		 - listFiles()를 통해 파일 내부 경로 또는 파일 명을 얻어와서 파일부터 삭제한 후에 폴더를 삭제할 수 있음.
		 - 지우고자 하는 경로가 여러개라면 위의 행동을 반복(중첩중첩)
		 */
		if(file.exists()) {
			if(file.isDirectory()) { // 파일이 디렉토리(폴더)인지 확인
				File[] files = file.listFiles();
//				System.out.println(Arrays.toString(files));
				for(int i=0; i<files.length; i++) {
					if(files[i].delete()) {
						System.out.println(files[i].getName() + "삭제 성공!");
					} else {
						System.out.println(files[i].getName() + "삭제 실패!");
					}
				}
			}
			if(file.delete()) {
				System.out.println("삭제 성공!");
			}else {
				System.out.println("삭제 실패!");
			}
			
		}
		
		
	}

}
