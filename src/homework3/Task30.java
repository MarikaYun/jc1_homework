package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    //написать метод выполняющий поиск в строке шестнадцатеричных чисел, записанных
    // по правилам Java с помощью регулярных выражений
    public static void main(String[] args) {

        searchHex();

    }

    public static void searchHex() {
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Pattern p = Pattern.compile("(0x[a-fA-F0-9]{1,4})");
        Matcher m = p.matcher(s);
        System.out.println("Шестнадцатеричные числа, найденные в строке:");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
