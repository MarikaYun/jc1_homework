package homework5;

import java.util.ArrayList;

import java.util.List;

public class Task40 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            marks.add(i, (int) (Math.random() * 10 + 1));

        }System.out.println(marks + " - полный список оценок");
        List<Integer> copyMarks = new ArrayList<>(marks);
        for (Integer mark : copyMarks) {
            if (mark < 5) {
                marks.remove(mark);
            }
        }
        System.out.println(marks + " - список без плохих оценок");
    }
}
