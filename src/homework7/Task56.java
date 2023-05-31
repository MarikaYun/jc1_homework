package homework7;

import java.util.ArrayList;
import java.util.List;

public class Task56 {
    static List<NewThread> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            list.add(new NewThread());
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).start();
            try {
                list.get(i).join();
            } catch (InterruptedException e) {

            }
        }

    }

    public static class NewThread extends Thread {

        public synchronized void run() {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
