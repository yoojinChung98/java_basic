package etc.lambda;

@FunctionalInterface // 약간의 상징성인것! 다른 곳에서 람다로 사용하겠다는 뜻! = 추상메서드 더 추가하지 마셈 이라는 의미
public interface GenericFunction<X, Y> {

    // X에서 Y를 추출
    Y apply(X x);


}
