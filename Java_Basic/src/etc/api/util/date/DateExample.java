package etc.api.util.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		
		System.out.println("==============================================");
		
		// 현재 날짜 정보 얻기 (연, 월, 일)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		// 현재 시간 정보 얻기 (시, 분, 초)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		// 현재 날짜와 시간 정보 얻기 (연, 월, 일, 시, 분, 초)
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		// 특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0); //2022년 7월 1일 오전9시 0분 0초
		System.out.println(beginDate);
		
		//연, 월, 일 따로 추출
		int year = localDateTime.getYear(); //참조변수로 찍은거임
		System.out.println("year: "+year);
		
		//정수 형태의 월 추출
		int monthValue = localDateTime.getMonthValue();		
		System.out.println("monthValue: "+monthValue);
		
		//문자 형태의 월 추출 (Month 라는 열거형 타입 중 하나)
		Month month = localDateTime.getMonth();
		System.out.println("month: "+month);
		
		int dayValue = localDateTime.getDayOfMonth();
		System.out.println("dayValue: "+dayValue);
		
		DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
		System.out.println("dayValue: "+dayOfWeek);
		
		System.out.println("====================================================");
		
		//지금으로부터 3일 뒤의 날짜
		LocalDateTime returnDate = localDateTime.plusDays(3);
		System.out.println(returnDate);
		
		// 메서드 체인링 (메서드를 체인처럼 연결해서 호출하는 것!)
		//지금으로부터 1년 2개월 7일 뒤의 날짜 / 이전은 minus
		LocalDateTime d1 = localDateTime
										.plusYears(1)
										.plusMonths(2)
										.plusDays(7);
		System.out.println(d1);
		
		// 지금으로부터 9개월 23일 전의 날짜
		LocalDateTime d2 = localDateTime.minusMonths(9).minusDays(23);
		System.out.println(d2);
		
		// 사이 날짜 연산 (주, 날 등등 고를 수 있음)
		LocalDate b = LocalDate.of(2020, 12, 30);
		LocalDate f = LocalDate.of(2022, 9, 14);
		
		long between = ChronoUnit.WEEKS.between(b, f);
		System.out.println("between: "+between);
		
		System.out.println("=======================================================");
		
		//날짜 포맷 변경하기
		System.out.println(localDateTime);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		//서식 문자는 자바 홈페이지가면 볼 수 있다고 함...
		System.out.println(localDateTime.format(dtf));
		
	}

}
