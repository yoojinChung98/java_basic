package etc.stream.quiz;

import etc.stream.Dish;

import java.nio.file.DirectoryStream;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
    public static List<Transaction> tradesOfYear(List<Transaction> transactions, int year) {
        // 집중해
        return transactions.stream()
                .filter(t -> t.getYear()==2021)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }


    // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
    // distint()
    public static List<String> cityOfTraders(List<Transaction> transactions) {
        return transactions.stream()
                .map(trs -> trs.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }


    // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
    public static List<Trader> traderNamesByCity(List<Transaction> transactions, String cityName) {
//        return transactions.stream() // 거래목록을 stream화함.
//                .filter(t -> t.getTrader().getCity().equals(cityName)) // 거래목록에서 trader의 도시이름이 cityName과 동일한 요소만 거름
//                .sorted(Comparator.comparing(t -> t.getTrader().getName())) // 거래목록에서 trader의 이름 순으로 오름차 정렬
//                .distinct()
//                .map(Transaction::getTrader)
//                .collect(Collectors.toList());

        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(td -> td.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
    }

    // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환
    public static List<String> sortedTradersNames(List<Transaction> transactions) {
//                return transactions.stream()
////                .map(t -> t.getTrader().getName()) // 모든 거래자의 이름을 리스트에 모았음
//                .sorted(Comparator.comparing(t -> t.getTrader().getName())) // 그걸 알파벳 순으로 정렬
//                .distinct()
//                .map(t -> t.getTrader().getName()) // 모든 거래자의 이름을 리스트에 모음
//                .collect(Collectors.toList());

                return transactions.stream()
                        .map(trs -> trs.getTrader().getName())
                        .distinct()
                        .sorted() // 문자나 숫자는 Comparator 를 사용하지 않아도 됨!
                        .collect(Collectors.toList());
    }


    // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
    public static boolean isThereLive(List<Transaction> transactions, String cityName) {
        return transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equalsIgnoreCase(cityName));
        // equalsIgnoreCase() -> 대소문자 구분하지 않는 equals
    }


    // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
    public static int allValueOfCity(List<Transaction> transactions, String cityName) {
        return transactions.stream()
                .filter(t -> t.getTrader().getCity().equalsIgnoreCase(cityName))
                .mapToInt(Transaction::getValue) // 새롭게 map에서 추출되는 값이 int 타입으로 들어감.
                .sum(); // sum()은 Stream<Integer> 는 사용할 수 없고 IntStream 만 사용할 수 있음. IntStream은 mapToInt()로 생성 가능.
    }

    // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?

    // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        System.out.println("transactions of 2021 = "
                + tradesOfYear(transactions, 2021)
        );

        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        System.out.println("Evey city of traders = "
                + cityOfTraders(transactions)
        );


        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
        System.out.println("Every traders of Cambridge ="
                + traderNamesByCity(transactions,"Cambridge")
                );

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환
        System.out.println("Every traders sorted by alphabet = "
                + sortedTradersNames(transactions)
                );

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        System.out.println("Milan 에 거주하는 사람이 한명이라도 있는가? :"
                + isThereLive(transactions, "Milan")
                );

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.


        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?
//        Transaction maxValue = transactions.stream()
//                .max(Comparator.comparing(Transaction::getValue))
//                .get();
//
//        System.out.println(maxValue.getValue());

        // 객체가 아닌 int 값만 받기!
        int maxValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .getAsInt();

        System.out.println("maxValue = " + maxValue);


        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .ifPresent(System.out::println);

    }

}
