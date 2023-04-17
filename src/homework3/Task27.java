package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    //введите с клавиатуры строку. Найти все знаки препинания. подсчитать количество
    public static void main(String[] args) {
        System.out.println("Первый вариант");
        char[] punkt = {'.', ',', ';', ':', '-', '!', '?', '/', '\\', '@', '#', '$', '%', '^', '&', '*', '"', '\'',
                '=', '+', '_', '<', '>', '`', '~', '(', ')'};
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int punktCount = 0;
        if (str != null) {
            char[] chars = str.toCharArray();
            for (char aChar : chars) {
                for (char c : punkt) {
                    if (aChar == c) {
                        punktCount++;
                    }
                }
            }
        }
        System.out.println("В строке содержится " + punktCount + " знаков препинания\n");


        System.out.println("Второй вариант");
        Pattern punct = Pattern.compile("\\p{Punct}");
        if (str != null) {
            Matcher m = punct.matcher(str);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (m.find()) {
                    count++;
                }
            }
            System.out.println("Количество знаков препинания: " + count);
        }
    }
}
