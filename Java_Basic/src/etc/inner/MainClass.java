package etc.inner;

public class MainClass {

	// 내부 클래스(inner class) (=중첩클래스 라고도 함)
	// 해당 객체와 "밀접한 연관"이 있는 경우 해당 클래스 내에서 클래스를 선언.(해당 클래스 내에서만 사용)
	// 여기 같은 클래스 안에서만 사용할 수 있으므로 private으로 선언하는 것이 일반적.(원래 클래스에는 private 못붙이자나, 내부클래스는 private static으로 선언할 수 있대)
	// 객체의 무분별한 생성을 막고 내부에서 고정적으로 사용할 수 있도록 private static으로 선언
	//일반적인 class는 private으로 정의할 수 없음.
	//내부 class를 선언하는 경우 private 선언이 가능 (private 은 내부에서만 사용하기 위함)
	//static -> 메모리 효율을 높이기 위해 선언. (바깥쪽 클래스 호출 시마다 재생성 방지)
	 private static class SubCalculator implements Calculator {

		@Override
		public int operate(int n1, int n2) {
			return n1 - n2;
		}
		
	}
	
	public static void main(String[] args) {
		
		//덧셈 계산을 하는 계산기를 만들어 쓰고 싶다.
		Calculator addCal = new AddCalculator();
		System.out.println(addCal.operate(30, 50));
		
		//뺄셈 계산을 하는 계산기도 있으면 좋겠다.
		Calculator sub1 = new SubCalculator();
		Calculator sub2 = new SubCalculator();
		Calculator sub3 = new SubCalculator();
		System.out.println(sub1.operate(100, 40));
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
		//스태틱으로 선언이 되었음에도 불구하고 객체의 주소값이 static하지 않음.. 다 다름...왜?
		// 내부 클래스에서의 스태틱과 일반 static은 조금 다름...
		
		// 내부에서 static으로 선언한 클래스는 아래처럼 바로 부르지도 못하지?
//		System.out.println(SubCalculator); (X)
		
		//곱셈 계산을 하는 계산기가 필요. (익명 클래스)
		//말 그래도 이름이 없는 클래스를 즉석에서 선언.
		//선언한 클래스 내에서는 주소값을 통해 객체를 사용할 수 있지만 외부에서는 지목할 방법이 없기 때문에 객체 사용이 불가능.
//		Calculator multiCal = new Calculator(); //인터페이스는 생성 불가.
		Calculator multiCal = new Calculator() {
			@Override
			public int operate(int n1, int n2) {
				return n1 * n2;
			}
		}; 
		//이렇게 익명으로 선언하는 경우는 걍 한번만 일회용으로 쓰고 버릴 목적으로 쓰는 것.(하단의 pet 참조)
		// 두고두고 불러먹고 써먹고 다른데서 import할거면 걍 class를 만드셔야죵...
		
		
		
		System.out.println(multiCal.operate(5,7));
		
		// 나눗셈을 하는 계산기 (람다) -> 인터페이스의 추상메서드가 딱 1개일 경우에만 가능 (두개 이상이면 구분이 안가잖슴)
		//람다식 문법, 함수형 프로그램을 간단히 작성할 수 있도록 하는 식. 
		//
		// Calculator divCal = new Calculator() {
		// @override
		// 		public int operate(int n1, int n2) {
		// 			return n1/ n2;
		// 		}
		// }
		//를 ! 한줄로 표현한 것!
		// 어차피 메서드 하나밖에 없으니까! 매개값 받고 그거 이렇게 반환해!
		Calculator divCal = (n1, n2) -> n1 / n2; //즉, 애가 바로 operate() 메서드인 것. 내용이 한줄이면 걍 괄호생략도 가능.
		//어차피 인터페이스에 추상메서드가 1개이기 때문에 이름을 따로 명시하지 않음. 
		//메서드 내부 로직이 단 한줄이라면 괄호 생략 가능 -> return 값으로 취급.
//		Calculator divCal = (n1, n2) -> {
//			return n1 / n2; 
//		};  //이렇게도 표현 가능.
		System.out.println(divCal.operate(25, 5));
		
		System.out.println("----------------------------------------------------");
		
//		Pet dog = () -> //pet은 메서드가 두개라서 이렇게 선언 불가능.
		//즉, 메서드가 1개가 아니라면 람다식은 쓸 수 없음.
		Pet dog = new Pet() {

			@Override
			public void eat() {
				System.out.println("강아지는 마당에서 놀아요~");
			}

			@Override
			public void play() {
				System.out.println("강아지는 사료를 먹어요~");
			}
			
		}; //인터페이스 어떻게 생성해..?
		
		dog.play();
		dog.eat();
		
		//일회용의 극단적 예시 (변수로 담지조차 않았어...지목조차 못해...)
		new Pet() {
			@Override
			public void eat() {
				System.out.println("길냥이가 마당에서 놀아요~");
			}
			@Override
			public void play() {
				System.out.println("길냥이가 사료를 먹어요~");
			}
		}.play();
		
		
	}
	
}
