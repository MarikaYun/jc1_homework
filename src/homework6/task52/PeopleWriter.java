package homework6.task52;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PeopleWriter {
    public boolean writeToFile(Person person, String fileName) {
        boolean result;
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(person);
            result = true;

        } catch (IOException e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
}
