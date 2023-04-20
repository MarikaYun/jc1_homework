package homework4.task33;


public class Mixer extends SpeedDependedAGD implements PlugInable {

    public Mixer(String name, int amper, int numOfSpeeds) {
        super(name, amper, numOfSpeeds);

    }

    @Override
    public void plugIn() {
        System.out.println(this + " включен в розетку");
    }

    @Override
    public void printInfo() {

        System.out.println("Миксер \"" + getName() + "\", мощность: " + power(getAmper()) +
                " Ватт, количество скоростей: " + getNumOfSpeeds());
    }

    @Override
    public String toString() {
        return getName();
    }
}
