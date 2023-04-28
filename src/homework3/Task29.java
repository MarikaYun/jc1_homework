package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    //вывести на экран текст, состоящий из последних букв исходного текста
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder newWord = new StringBuilder();
        if (s != null) {
//            String[] words = s.split("\\p{Punct}* +");
//            for (String word : words) {
//                newWord.append(word.charAt(word.length() - 1));
//            }
//        }
//        System.out.println(newWord);
            Pattern pattern = Pattern.compile("([a-zA-z]\\b)");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                System.out.print(matcher.group());
            }
        }
    }
}
