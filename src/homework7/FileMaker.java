package homework7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.concurrent.*;

public class FileMaker implements Callable {//  Task59
/* Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками - засыпает
    произвольно на 1-3 секунды, результат выполнения  - коллекция имен файлов. Запустить 10 задач
    параллельно в пуле из 3 потоков. вывести ход программы на экран с указанием имени потока*/
    @Override
    public List<String> call() throws Exception {
        List<String> fileList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            fileList.add("c:\\test\\" + Thread.currentThread().getName() + "f_" + i + ".txt");

            try(OutputStream outputStream = new FileOutputStream(fileList.get(i));
                BufferedOutputStream buf = new BufferedOutputStream(outputStream)){
                buf.write(("Hello from number_" + i).getBytes());
                buf.flush();
            }
        }
        Thread.sleep(1750);
        return fileList;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<List<String>>> futures = new HashSet<>();
        for (int i = 0; i < 10; i++) {
           Callable<List<String>> fileMaker = new FileMaker();
           Future<List<String>> future = pool.submit(fileMaker);
           futures.add(future);
        }
        List<String> result = new ArrayList<>();
        for(Future<List<String>> f: futures) {
            result.addAll(f.get());
        }
        System.out.println(result);
        pool.shutdown();
    }
}
