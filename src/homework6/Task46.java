package homework6;

import java.io.IOException;
import java.util.Random;

public class Task46 {
    public static void main(String[] args) {
        try {
            System.out.println(randomDevide(100));
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");;
        }

    }

    public static int randomDevide(int x) throws ArithmeticException {
       Random random = new Random();
       int number = random.nextInt(5);
        return x / number;
    }
}
