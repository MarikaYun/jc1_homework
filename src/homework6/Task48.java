package homework6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task48 {
    public static void main(String[] args) throws IOException {

        String text = "A swarm of bees injured at least two people in Encino, California, " +
                "a suburb of Los Angeles.";

        Path file = Files.createFile(Path.of("C:\\test\\super.txt"));
        Files.write(file, text.getBytes());

        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        wordsCount(line);
        punctuationCount(line);
        sc.close();

    }
    public static void wordsCount(String line){

        String[] words = line.split("\\p{Punct}* +");
        System.out.println(Arrays.toString(words));
        System.out.println("Number of words: " + words.length);
    }

    public static void punctuationCount(String line) {

        Pattern punct = Pattern.compile("\\p{Punct}");
        Matcher m = punct.matcher(line);
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (m.find()) {
                count++;
            }
        }
        System.out.println("Number of punctuation: " + count);
    }
}

