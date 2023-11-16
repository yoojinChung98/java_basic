package etc.lambda;

@FunctionalInterface
public interface GenericPredicate<T> {

    boolean test(T t); // 제너릭을 이용하여 모든 값을 유연하게 받아보겠음.
}
