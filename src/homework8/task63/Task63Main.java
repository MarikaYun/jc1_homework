package homework8.task63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Task63Main {
    /* Создайте класс Person с полями name, surname, age. Сгенерируйте группу из 100 человек в возрасте от 15 до 30.
     * Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку stream вызовов, которая:
     * выбирает объекты, возраст которых меньше 21;
     * распечатывает их на экран;
     * сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
     * берет 4 первых объекта;
     * формирует коллекцию из фамилий объектов;
     * агрегирует все в коллекцию.*/

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            persons.add(new Person());
        }
        //System.out.println(persons); //for check
        persons.stream()
                .filter(s -> s.getAge() < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getSurname))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());

    }
}
