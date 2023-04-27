package homework4.task35;

public class Cleaner extends Employee {
    private double perHourPayment;

    public Cleaner(String position, String name, int rateHours, int realWorkingHours, double perHourPayment) {
        super(position, name, rateHours, realWorkingHours);
        this.perHourPayment = perHourPayment;
    }

    public void getSalary() {
        double salary = perHourPayment * getRealWorkingHours();
        System.out.printf("Зарплата: %.2f%n", salary);
    }

    @Override
    void doWork() {
        System.out.println("Работаю сколько хочу");
    }
}
