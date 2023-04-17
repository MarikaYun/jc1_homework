package homework3;

public class Task32 {
    public static void main(String[] args) {

        if (timeStringConcat("aaabbbccc") > timeStringBuilderAppend("aaabbbccc")) {
            System.out.println("Метод timeStringConcat работает медленнее, чем метод timeStringBuilderAppend");
        } else if (timeStringConcat("aaabbbccc") < timeStringBuilderAppend("aaabbbccc")) {
            System.out.println("Метод timeStringConcat работает быстрее, чем метод timeStringBuilderAppend");
        } else
            System.out.println("Методы работают с одинаковой скоростью");
    }

    public static long timeStringConcat(String str) {
        long time = System.currentTimeMillis();
        String str1 = "aaabbbccc";
        for (int i = 0; i < 1_000_000; i++) {
            str1 += str;
        }
        System.out.println("Скорость работы метода timeStringConcat составляет: " + (System.currentTimeMillis() - time) + " миллисекунд");

        return (System.currentTimeMillis() - time);
    }

    public static long timeStringBuilderAppend(String str) {
        long time = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("aaabbbccc");
        for (int i = 0; i < 1_000_000; i++) {
            stringBuilder.append(str);
        }
        System.out.println("Скорость работы метода timeStringBuilderAppend составляет: " + (System.currentTimeMillis() - time) + " миллисекунд");

        return (System.currentTimeMillis() - time);
    }
}
