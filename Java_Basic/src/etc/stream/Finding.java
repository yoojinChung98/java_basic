package etc.stream;

import java.util.Comparator;

import static etc.stream.Menu.menuList;
import static java.util.Comparator.comparing;

public class Finding {

    public static void main(String[] args) {
        // 음식 메뉴 중에 채식주의자가 먹을 수 있는 음식이 있는가?
        // 어제의 filtering에서 하기도 했음! filtering -> 배열을 반환해줬지!
        // Menu.menuList 를 import static 했음
        boolean flag1 = menuList.stream()
                .anyMatch(dish -> dish.isVegitarian());
        // 하나라도 해당하는 것이 있는지 확인할 때 쓰는 것
        // anyMatch( 굳이 리스트까진 필요가 없고 true가 하나라도 있는지 확인만 하고 싶을 떄!)

        System.out.println("flag1 = " + flag1);
        // 반환값 true! => dish.isVegitarian 의 값이 true 인

        // 음식 메뉴 중에 칼로리가 50미만인 음식이 있는가?
        boolean flag2 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() < 50);

        System.out.println("flag2 = " + flag2);


        // 음식 메뉴 중에 모든 요리가 1000칼로리 미만입니까?
        boolean flag3 = menuList.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);

//        // 음식 메뉴 중에 모든 요리가 1000칼로리 미만이 아닙니까?
//        boolean flag3 = menuList.stream()
//                .noneMatch(dish -> dish.getCalories() < 1000);
//        System.out.println("flag3 = " + flag3);

        // 음식 중에 칼로리가 가장 낮은 음식을 조회해주세요 : min() / max() 도 동일하게 사용
//        Dish dish = menuList.stream()
//                .min(new Comparator<Dish>() {
//                    @Override
//                    public int compare(Dish o1, Dish o2) {
//                        return o1.getCalories() - o2.getCalories();
//                        // 리턴값의 양/음에 따라 기존/새로운 인자의 대소를 비교하여 더 작은 값을 선택함.
//                    }
//                }).get(); // get 에 노란줄이 생성되는 이유: 반환타입이 optional -> Null체크를 의무화함. 근데 그걸 안해서 노란줄 뜨는 것.


//        // 축약 없이 일반적인 작성
//        menuList.stream()
//                .min((o1, o2) -> o1.getCalories() - o2.getCalories().get());

        // Comparator 가 제공하는 메서드 comparing을 이용!
        // 우리가 직접 빼는 작업을 하지 않아도, 이 메서드에서 알아서 스스로 빼서 비교해줄 것임.
        // Comparator를 import static을 하고, 람다표현으로 해서 이렇게 짧게 축약할 수 잇음
        Dish dish = menuList.stream()
                .min(Comparator.comparing(Dish::getCalories))
                .get();
//                .min(Comparator.comparing(dish -> dish.getCalories())).get()
        System.out.println("dish = " + dish);

    }
}
