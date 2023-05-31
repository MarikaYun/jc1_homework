package homework7;

import java.util.Arrays;
import java.util.Random;

public class Task54 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new MYThread().start();
        }

    }

    public static class MYThread extends Thread {
        public void run() {
            Random random = new Random();
            int[] myArray = new int[10];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = random.nextInt(10000);
            }
           //  System.out.println(Arrays.toString(myArray) + " " + Thread.currentThread().getName());  //для проверки

            int max = myArray[0];
            for (int i = 1; i < myArray.length; i++) {
                if (max < myArray[i]) {
                    max = myArray[i];
                }
            }
            System.out.println(Thread.currentThread().getName() + " Максимальный элемент массива - " + max);
        }
    }
}
