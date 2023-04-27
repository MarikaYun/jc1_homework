package homework4.task35;

public class Worker extends Employee {
    private int expierence;

    public Worker(String position, String name, int rateHours, int realWorkingHours, int expierence) {
        super(position, name, rateHours, realWorkingHours);
        this.expierence = expierence;
    }

    @Override
    public void getSalary() {
        super.setBonus(550);
        super.setCoef(1.5);
        super.getSalary();
    }

    @Override
    void doWork() {
        System.out.println("Эх, скорей бы аванс дали");
    }
}
