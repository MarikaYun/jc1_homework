package homework3;

import java.util.Scanner;

public class Task28 {
    //подсчитать количество слов в тексте, с четом того, что в начале и в конце могут быть пробелы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str != null) {
            String str1 = str.trim();
            String[] words = str1.split(" +");
            System.out.println("Количество слов в тексте: " + words.length);
        }
    }
}
