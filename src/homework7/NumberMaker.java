package homework7;

import java.util.*;
import java.util.concurrent.*;

public class NumberMaker implements Callable {//Task 60
/* Создать задачу callable, которая генерирует коллекцию из 10 рандомных целых чисел - засыпает на
 1-10 секунд, результат выполнения - сумму этих чисел в виде строки. Запустить 10 задач параллельно
  в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняется
 */
    @Override
    public String call() throws Exception {
        List<Integer> numList = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            numList.add((int) (Math.random() * 10000000));
        }
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        Thread.sleep(1000);
        return "" + sum + " - " + Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<String>> futures = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Callable<String> numMaker = new NumberMaker();
            Future<String> future = pool.submit(numMaker);
            futures.add(future);
            //System.out.println(future.get());
        }
        List<String> sums = new ArrayList<>();
        for (Future<String> s : futures) {
            sums.add(s.get());

        }
        System.out.println(sums);
        pool.shutdown();
    }

}
