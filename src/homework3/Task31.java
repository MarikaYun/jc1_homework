package homework3;

import java.util.Scanner;


public class Task31 {
    //написать код, выполняющий поиск в строке всех тегов абзацев, в том числе тех, у которых есть параметры
    public static void main(String[] args) {
        String pattern = "<p[^<>]+>";
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.replaceAll(pattern, "<p>"));
    }
}
