package homework5;

import java.util.*;

public class Task42 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            marks.add(i, random.nextInt(10));
        }
        System.out.println(marks + " - список всех оценок");

        Iterator<Integer> integerIterator = marks.iterator();
        int max = integerIterator.next();
        while (integerIterator.hasNext()) {
            int currentMark = integerIterator.next();
            if (currentMark > max) {
                max = currentMark;
            }
        }
        System.out.println(max + " - максимальная оценка");
    }
}
