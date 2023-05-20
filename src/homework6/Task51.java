package homework6;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;
import java.util.Random;


public class Task51 {
    public static void main(String[] args) throws IOException {

        Path directory = Files.createDirectories(Path.of("C:\\test\\folder1\\folder2\\folder3"));

        for (int i = 0; i < 5; i++) {
            Path file = Files.createFile(Path.of("C:\\test\\folder1\\folder2\\folder3\\file_" + i + ".txt"));
            Random random = new Random();
            try (FileWriter writer = new FileWriter(file.toFile())) {
                for (int j = 0; j < 10; j++) {
                    writer.write(" " + random.nextInt(10_000));
                }
            }
        }
        System.out.println("Files created and filled");

        Path newFile = Files.createFile(Path.of("C:\\test\\folder1\\folder2\\folder3\\newFile.txt"));
        Charset charset = StandardCharsets.UTF_8;
        try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)) {
            for (Path file : files) {
                List<String> lines = Files.readAllLines(file, charset);
                Files.write(newFile, lines, charset, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
            System.out.println("Files moved");
        }

        Path listFile = Files.createFile(Path.of("C:\\test\\folder1\\folder2\\folder3\\list.txt"));
        try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)) {
            for (Path file : files) {
                Files.write(listFile, file.getFileName().toString().getBytes(), StandardOpenOption.APPEND);
                //не придумала как добавить пробелы
            }
            System.out.println("Files written");
        }
    }
}


