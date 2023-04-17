package homework3;

import java.util.Scanner;

public class Task29 {
    //вывести на экран текст, состоящий из последних букв исходного текста
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder newWord = new StringBuilder();
        if (s != null) {
            String[] words = s.split("\\p{Punct}* +");
            for (String word : words) {
                newWord.append(word.charAt(word.length() - 1));
            }
        }
        System.out.println(newWord);
    }
}
