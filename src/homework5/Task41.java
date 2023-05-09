package homework5;

import java.util.*;
;

public class Task41 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            numbers.add(i, random.nextInt(20));
        }
        System.out.println(numbers + " - случайная коллекция");

       // Set<Integer> set = new TreeSet<>(numbers); - mozhno i tak
        Set<Integer> set = new HashSet<>(numbers);
        System.out.println(set + " - коллекция без повторяющихся значений");
    }
}
