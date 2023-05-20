package homework6;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task49 {
    public static void main(String[] args) throws IOException {
        String text = "С 20 по 27 мая 2023 года в Софии состоится 5 международный фестиваль." +
                " В мероприятии примут участие 27 представителей из 12 стран.";
        FileOutputStream fos = new FileOutputStream("C:\\test\\example49.txt");
        fos.write(text.getBytes());
        fos.flush();
        fos.close();

        try (FileReader fr = new FileReader("C:\\test\\example49.txt");
             BufferedReader bufReader = new BufferedReader(fr)) {
            while (bufReader.ready()) {
                String line = bufReader.readLine();
                int sum = 0;
                List<Integer> numbers = new ArrayList<>();
                Pattern pattern = Pattern.compile("[0-9]+");
                Matcher m = pattern.matcher(line);
                while (m.find()) {
                    numbers.add(Integer.parseInt(m.group()));
                }
                System.out.println(numbers + " - numbers from file");

                for (Integer number : numbers) {
                    sum += number;
                }
                System.out.println(sum + " - sum of all numbers");

                Set<Integer> setNumbers = new TreeSet<>(numbers);
                System.out.println(setNumbers + " - numbers witout repeat");
            }

        }
    }
}