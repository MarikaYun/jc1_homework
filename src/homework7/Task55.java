package homework7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;

public class Task55 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new ThreadAcc().start();
        }
    }

    public static class ThreadAcc extends Thread {

        public void run() {
            Random random = new Random();
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100_000);
            }
            //System.out.println(Arrays.toString(array));
            try {
                Path file = Files.createFile(Path.of("c:\\test\\task55_" + Thread.currentThread().getName() + ".txt"));
                Files.write(file, Arrays.toString(array).getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
