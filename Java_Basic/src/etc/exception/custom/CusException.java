package etc.exception.custom;

public class CusException extends Exception{
	
	//기본 생성자
	public CusException () {
		
	}
	
	//오류메세지를 띄울 생성자
	public CusException (String message) {
		super(message);
	}
	
	

}
