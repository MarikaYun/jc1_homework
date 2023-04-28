package homework4.ttask39;

public class Motorcycle extends Vehicle {

    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
