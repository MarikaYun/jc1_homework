package homework4.task33;

public abstract class AGD {
    private String name;
    private int amper;


    public AGD(String name, int amper) {
        this.name = name;
        this.amper = amper;
    }

    public String getName() {
        return name;
    }

    public int getAmper() {
        return amper;
    }

    public int power(int amper) {
        return amper * 220;
    }

    public abstract void printInfo();

}
