package homework4.task35;

public class DesignIngeneer extends Ingeneer {

    public DesignIngeneer(String position, String name, int rateHours, int realWorkingHours, String education, int expierence, int category) {
        super(position, name, rateHours, realWorkingHours, education, expierence, category);
    }

    @Override
    public void getSalary() {
        super.setBonus(800);
        super.setCoef(2.3);
        super.getSalary();
    }

    @Override
    public void doWork() {
        super.doWork();
        System.out.println("Я занимаюсь проектированием.");
    }
}
