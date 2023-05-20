package homework6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task47 {
    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("C:\\IdeaP\\Hey\\src\\itAcademi");
        if (dir.isDirectory()) {
            System.out.println("Directories:");
            for (File f : dir.listFiles()) {
                if (f.isDirectory()) {
                    System.out.println(f.getName() + "\t- folder");
                }
            }
            System.out.println("Files:");
            for (File f : dir.listFiles()) {
                if (!f.isDirectory()) {
                    System.out.println(f.getName() + "\t- file");
                }
            }
        }
    }
}
