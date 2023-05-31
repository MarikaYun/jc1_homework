package homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task53 {

    public static void main(String[] args) throws InterruptedException {
        List<MariaThread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new MariaThread("threadMaria_" + i));
        }
        for (MariaThread thread : threads) {
            thread.start();
        }
    }

    public static class MariaThread extends Thread {
        public MariaThread(String name) {
            super(name);
        }

        public void run() {
            List<Integer> list = new ArrayList<>(10);
            Random random = new Random();
            double result;
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                list.add(random.nextInt(500_000));
            }
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            result = (double) sum / list.size();
            System.out.println("Среднее арифметическое: " + result + " - " + Thread.currentThread().getName());

        }
    }
}