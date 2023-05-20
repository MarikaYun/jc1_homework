package homework6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task50 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        FileOutputStream fos = new FileOutputStream("C:\\test\\test50.bin");
        DataOutputStream dos = new DataOutputStream(fos);
        for (int i = 0; i < 20; i++) {
            dos.writeInt(random.nextInt());
        }
        dos.close();

        FileInputStream fis = new FileInputStream("C:\\test\\test50.bin");
        DataInputStream dis = new DataInputStream(fis);
        List<Integer> binaryNums = new ArrayList<>();
        while (dis.available() > 0) {
            int x = dis.readInt();
            binaryNums.add(x);
        }
        System.out.println(binaryNums + " - числа из двоичного файла");


        if (binaryNums.size() != 0) {
            Integer listSum = 0;
            for (Integer number : binaryNums) {
                listSum += number;
            }
            Double middle = (double)listSum/ binaryNums.size();
            System.out.println(middle + " - среднее арифметическое");
        }

    }
}
