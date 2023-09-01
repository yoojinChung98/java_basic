package oop.final_.constant;

public class Earth {

	/*
    # 상수 (constant)
    
    - 상수는 고정된 불변의 값입니다. 따라서 어디에서 접근을 하더라도
     같은 값이 나와야 하며, 값의 변경 또한 불가능해야 합니다.
     
    - 따라서 자바에서는 상수를 선언할 때 static, final을 동시에 사용합니다.
    */
	
	
	static final double RADIUS = 6400; // 상수는 대문자로 작성하는 것이 관례
	
	static final double SURFACE_AREA;
	// static -> 객체 생성 없이 사용할 수 있는 변수이므로 생성자로 초기화 하는 방법은 불가능
	// 상수는 모두 대문자로 적히므로 단어 사이에는 _를 사용함! (이외의 상황에서 사용은 지양)
	static {
		SURFACE_AREA = RADIUS * RADIUS * Math.PI * 4;
	}
	
	
}
