package etc.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Filtering {

    public static void main(String[] args) {

        // stream 의 filter
        // 필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환

        // 메뉴 중에 채식주의자가 먹을 수 있는 요리를 필터링
        menuList.stream()
                .filter(Dish::isVegitarian)
                .filter(dish -> dish.isVegitarian())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("============ 육류이면서 600칼로리 미만의 요리를 필터링");
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT && d.getCalories() < 600)
                .collect(Collectors.toList())
                .forEach(System.out::println);
                 // .forEach(dish -> System.out.println(dish)); // 람다의 메서드 축약 참조법.


        System.out.println("============ 요리 중에 요리 이름이 4글자인 요리만 필터링");
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("============ 요리중에 300칼로리보다 큰 요리만 필터링 / limit()");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3) // .limit() -> 상위 top3 추출 (아 참고로 정렬명령은 내리지 않았으니, 리스트에 들어가있는 그 순서중에서 상위 3개를 가져온 것!)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("====================== skip() ===============================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 맨 앞 2개 제외시킴
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("==== 메뉴 목록에서 처음 등장하는 2개의 생선요리 필터링 ====");
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));


        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 4, 6);

        // 짝수만 걸러내기 + 중복값 제거하기
        List<Integer> filteredNumber = numbers.stream()
                .filter(num -> num % 2 == 0)
                .distinct() // 중복 제거
                .collect(Collectors.toList());
        System.out.println("filteredNumber = " + filteredNumber);

        // 중복 제거
//        Set<Integer> distinctNumbers = new HashSet<>(filteredNumber);
//        System.out.println(distinctNumbers);





    }
}
