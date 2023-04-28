package homework4.ttask39;

public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
