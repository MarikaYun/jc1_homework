package homework6.task52;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[10];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
        }
        System.out.println(Arrays.toString(people));

        try {
            Path personList = Files.createFile(Path.of("C:\\test\\people.dat"));
            String sourseFileName = personList.getFileName().toString();
            System.out.println(sourseFileName);
            for (int i = 0; i < people.length; i++) {
                boolean result = new PeopleWriter().writeToFile(people[i], "C:\\test\\people.dat");
                if (result) {
                    System.out.println("Person saved successfully");
                } else {
                    System.out.println("Saved person to file failure");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

