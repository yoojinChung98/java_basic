package etc.exception.custom;

public class MainClass {

	public static void main(String[] args) {

//		LoginUser user = new LoginUser("abc1234", "aaa1111!");
//		
//		
//		String result;
//		try {
//			result = user.loginValidate("abc1234", "aaa1111");
//		} catch (LoginValidateException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		
		Assistance yoojin = new Assistance();
		
		try {
			yoojin.calcTime(15, 9);
		} catch (CusException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
		
		
	}

}
