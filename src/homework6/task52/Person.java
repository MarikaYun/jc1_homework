package homework6.task52;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

public class Person implements Serializable {
    int age;
    String name, surname;
    private final String[] names = {"Tom", "Bob", "Pol", "Mike", "John", "Bill", "Mary", "Eva", "Suzi", "Ann"};
    private final String[] surnames = {"Willson", "Jason", "Smith", "Gates", "McCloud", "Johnson", "O'Sallivan",
            "Murphy", "Nadal", "Federer"};

    public Person() {
        Random random = new Random();
        name = String.valueOf(names[random.nextInt(names.length)]);
        surname = String.valueOf(surnames[random.nextInt(surnames.length)]);
        age = (int) (Math.random() * 60 + 10);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person {" + name + " " + surname + " - " + age + "years }\n";
    }
}
