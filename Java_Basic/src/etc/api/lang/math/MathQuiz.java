package etc.api.lang.math;

public class MathQuiz {
	
	public static int page(int num) throws Exception {
		if(num<=0) throw new Exception();
		return num/10 +1; // 아무리생각해도 +1이 더 효율 좋은 것 같아ㅎㅎ
		//return (int) Math.ceil(num / 10.0);
	}
	

	public static void main(String[] args) {

		/*
        1 ~ 10이 전달되면 1이 반환되고,
        11 ~ 20이 전달되면 2가 반환되고,
        21 ~ 30이 전달되면 3이 반환되고.......
        이러한 로직을 수행하는 static 메서드 page를 선언해 보세요.
        나중에 게시판 로직 (1~10 게시글은 1페이지...)에 사용하는 개졈
        */
		
	try {		
		System.out.println(page(7));	
	} catch (Exception e){
		System.out.println("양수를 입력해야합니다~");
	}
		
		
		
	}

}
