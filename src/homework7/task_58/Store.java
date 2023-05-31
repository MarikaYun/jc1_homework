package homework7.task_58;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Store {
    private BlockingQueue<Integer> item = new ArrayBlockingQueue<>(200);
    private volatile int globalProducerCounter;
    private volatile int globalConsumerCounter;

    public synchronized void put() {
        while (globalProducerCounter < 10000) {
            while (item.size() >= 100) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int x = (int) (Math.random() * 100) + 1;
            item.add(x);
            globalProducerCounter++;
            System.out.println(Thread.currentThread().getName() + " producer добавил товар: " + x +
                    ". На складе : " + item.size() + " item. globalCounter - " + globalProducerCounter);
            if (item.size() <= 80) {
                notifyAll();
            }
        }
    }



    public synchronized void get() {
        while (globalConsumerCounter < 10000) {
            while (item.size() < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int y = item.poll();
            globalConsumerCounter++;
            System.out.println(Thread.currentThread().getName() + " consumer забрал товар: " + y
                    + ". Hа складе осталось: " + item.size() + " item. globalCounter: " + globalConsumerCounter);
            notifyAll();
        }
    }
}
