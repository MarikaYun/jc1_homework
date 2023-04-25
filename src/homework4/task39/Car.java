package homework4.task39;

public class Car extends Vehicle {

    protected Car(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
