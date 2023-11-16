package etc.stream;

import org.w3c.dom.NameList;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

    // stream의 map: 컬렉션(리스트, 셋, 맵 ...)에서 원하는 정보만 추출하여 새로운 컬렉션으로 반환해 줌.(일괄처리)
public class Mapping {

    // 이름과 타입만 가진 클래스를 설계
    private static class DishNameType{
        private String name;
        private Dish.Type type;

        public DishNameType(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }
        @Override
        public String toString() {
            return "DishNameType{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }


    // 이름과 칼로리만 가진 클래스를 설계
    private static class SimpleDish {
        private String name;
        private int calories;

        public SimpleDish(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public SimpleDish(Dish dish) {
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }

        @Override
        public String toString() {
            return "SimpleDish{" +
                    "name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';
        }
    }


    public static void main(String[] args) {
         List<Integer> NameList = menuList.stream()
            .map(dish ->dish.getCalories())
            .collect(Collectors.toList());

        System.out.println("NameList = " + NameList);

        /*
            요리 목록에서 메뉴 이름과 칼로리를 추출하고 싶다.
         */
        menuList.stream()
//                .map(dish -> new SimpleDish(dish.getName(), dish.getCalories()) ) // 이 부분을 더 짧게!
                .map(dish -> new SimpleDish(dish)) // 걍 dish 객체를 받는 생성자를 하나 더 만드셈;;
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));


        /*
            메뉴 목록에서 칼로리가 500 칼로리보다 큰 음식들을 필터링한 다음에 음식의 이름과 타입만 추출해서
            출력해주세요
         */
        System.out.println("=========================================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(DishNameType::new)
                .collect(Collectors.toList())
                .forEach(ds -> System.out.println("ds = " + ds));


    }





}

