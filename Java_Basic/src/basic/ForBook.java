package basic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ForBook {
	public static void main(String[] arg) {
		
		// Math 연습
		double num = 3.141592423943;
		
		//올림
		System.out.println(Math.ceil(num));
		//4.0
		
		//내림
		System.out.println(Math.floor(num));
		//3.0
		
		//반올림 : 3.1416
		System.out.println(Math.round(num*10000)*0.0001);
		
		//제곱 2^6 = 64
		System.out.println(Math.pow(2, 6));
		
		//최대값 37, 9
		System.out.println(Math.max(37, 9));
		//37
		
		//최소값
		System.out.println(Math.max(37, 9));
		
		//절대값
		System.out.println(Math.abs(-37.8));
		//37.8
		
		//원주율
		System.out.println(Math.PI);
		
		System.out.println("========================================");
		
		//StringBuilder 연습
		
		//StringBuilder 준비
		StringBuilder sb = new StringBuilder("Good");
		System.out.println(sb);
		
		//문자열을 맨 끝에 추가하는 메서드
		sb.append(" morning");
		System.out.println(sb);
		
		// 문자열을 특정 인데긋에 삽입하는 메서드
		sb.insert(12, "!");
		System.out.println(sb);
		
		// 특정 인덱스 범위의 문자열을 교체하는 메서드\
		sb.replace(5, 12, "night");
		System.out.println(sb);
		
		// 문자열 내의 특정 단어를 삭제하는 메서드
		sb.delete(0,5);
		System.out.println(sb);
		//문자열 내의 특정 문자를 교체하는 메서드
		sb.setCharAt(0, 'N');
		System.out.println(sb);
		// 문자열을 역순으로 배치하는 메서드
		sb.reverse();
		System.out.println(sb);
		
		// 문자열 내의 특정 문자/문자열의 idx위치를 구하는 메서드
		System.out.println(sb.indexOf("gi"));
		
		System.out.println("===============================================");
		//정답은 api util date
		
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