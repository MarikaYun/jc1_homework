package homework4.task35;

public class Ingeneer extends Employee {
    private String education;
    private int expierence;
    private int category;

    public Ingeneer(String position, String name, int rateHours, int realWorkingHours, String education,
                    int expierence, int category) {
        super(position, name, rateHours, realWorkingHours);
        this.education = education;
        this.expierence = expierence;
        this.category = category;

    }


    @Override
    public void doWork() {
        System.out.print("Я работаю инженером. ");
    }
}
