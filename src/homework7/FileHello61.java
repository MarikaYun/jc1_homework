package homework7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalTime;
import java.util.concurrent.*;


public class FileHello61 implements Callable<Path> {//task61

    @Override
    public Path call() throws Exception {
        Path path = Path.of("c:\\test\\test_21.txt");
        synchronized (this) {
            String info = "Hello World " + LocalTime.now() + " " + Thread.currentThread().getName() + "\n" ;
            Files.write(path, info.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }
        return path;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        Callable<Path> callable = new FileHello61();
        for (int i = 0; i < 10; i++) {
            Future<Path> future = pool.submit(callable);
            System.out.println(future.get());
        }
        pool.shutdown();
    }
}

