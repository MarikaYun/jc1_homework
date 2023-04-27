package homework4.task35;

import java.math.BigDecimal;

public abstract class Employee implements Salary {
    private String position;
    private String name;
    public static final double BASIC_SALARY = 500;
    private int realWorkingHours;
    private int rateHours;
    private int bonus;
    private double coef;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public int getRealWorkingHours() {
        return realWorkingHours;
    }

    abstract void doWork();

    public Employee(String position, String name, int rateHours, int realWorkingHours) {
        this.position = position;
        this.name = name;
        this.rateHours = rateHours;
        this.realWorkingHours = realWorkingHours;
    }

    @Override
    public void getSalary() {
        double salary = (BASIC_SALARY * coef + bonus) * (realWorkingHours / (double) rateHours);
        System.out.printf("Зарплата: %.2f%n", salary);
    }


    public void getInfo() {
        System.out.println("Должность: " + position + ", имя: " + name);
    }

}
