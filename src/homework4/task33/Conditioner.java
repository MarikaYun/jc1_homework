package homework4.task33;

public class Conditioner extends TemperatureDependedAGD implements PlugInable {


    public Conditioner(String name, int amper, int minTemperature, int maxTemperature) {
        super(name, amper, minTemperature, maxTemperature);

    }

    @Override
    public void plugIn() {
        System.out.println(this + " включен в розетку");
    }

    @Override
    public void printInfo() {
        System.out.println("Кондиционер \"" + getName() + "\", мощность: " + power(getAmper()) + " Ватт, работает в диапазоне от " +
                getMinTemperature() + " до " + getMaxTemperature() + " градусов");

    }

    @Override
    public String toString() {
        return getName();
    }
}
