package homework8;

import java.util.stream.IntStream;

public class Task62 {
    /* Напишите программу, которая для всех четных значений длиной от 1 до 20 дюймов:
     * печатает на экран значения в дюймах;
     * переводит значения в сантиметры;
     * печатает на экран сумму в сантиментах.
     */
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 20)
                .filter(s -> s % 2 == 0)
                .peek(System.out::println)
                .mapToDouble(s -> s * 2.54)
                .sum()
        );
    }
}
