package homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task64 {
    /* Сгенерируйте лист коллекцию из н элементов от мин до мах. Определите, содержатся
     ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощью стрим */
    public static void main(String[] args) {
        int minValue = 15;
        int maxValue = 300;
        List<Integer> numbers = new ArrayList<>(IntStream.rangeClosed(minValue, maxValue)
                .peek(System.out::println)
                .boxed()
                .collect(Collectors.toList()));

        System.out.println("Числа из коллекции, которые делятся на 3 и на 5:");
        numbers.stream()
                .filter(s -> s % 3 == 0 && s % 5 == 0)
                .forEach(System.out::println);
    }
}

