package etc.stream;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Sorting {

    public static void main(String[] args) {

        // 음식 목록 중에서  칼로리가 낮은 순으로 정렬
        menuList.stream()
                // Comparator 클래스의 comparing 메서드에 해당하는 값들만 넘겨주면 알아서 비교해줌!
//                .sorted(Comparator.comparing(Dish::getCalories)) // 칼로리 오름차순 정렬
                .sorted(Comparator.comparing(Dish::getName)) // A-z 오름차순 정렬
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("======================================================");

        // 칼로리로 내림차 정렬 (높은 것부터 출력)
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getCalories).reversed()) // reversed() 뒤집어!
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=======================================================");
        // 500 칼로리보다 작은 요리 중에 top3 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500) // 칼로리가 500 미만인 애들 걸러
                .sorted(Comparator.comparing(Dish::getCalories).reversed()) // 걸른 애들 정렬 (높은 순)
                .limit(3) // 정렬된 애들 중 상위 3개만 잘라
                .collect(Collectors.toList())// 리스트로 받아
                .forEach(System.out::println); // 반복해서 출력해.


    }

}
