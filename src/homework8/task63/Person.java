package homework8.task63;

public class Person {
    private String name, surname;
    private int age;

    public Person() {
        this.name = Name.getRandomName().getName();
        this.surname = Surname.getRandomSurname().getSurname();
        this.age = (int) (Math.random() * 16 + 15);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
