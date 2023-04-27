package homework4.task35;

public class ServisIngeneer extends Ingeneer {

    public ServisIngeneer(String position, String name, int rateHours, int realWorkingHours, String education,
                          int expierence, int category) {
        super(position, name, rateHours, realWorkingHours, education, expierence, category);
    }

    @Override
    public void getSalary() {
        super.setBonus(2500);
        super.setCoef(2.8);
        super.getSalary();
    }

    @Override

    public void doWork() {
        super.doWork();
        System.out.println("Я устаналиваю и обслуживаю оборудование на предприятии.");
    }
}
