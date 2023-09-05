package etc.exception.custom;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Assistance {

	int asTime;
	int ghTime;
	
	public Assistance () {}
	
	@SuppressWarnings("static-access")
	public Assistance (int at, int ht) {
		super();
		asTime= at;
		ghTime= ht;
	}

	
	public void calcTime(int at, int ht) throws CusException {
		if(at > ht) throw new CusException("입실과 퇴실 시간이 반대로 입력되었습니다.");
		asTime= at;
		ghTime= ht;
		System.out.println("공부시간: "+(ht-at));
	}
	
	
	
}
