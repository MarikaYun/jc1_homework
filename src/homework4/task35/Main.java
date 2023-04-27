package homework4.task35;

public class Main {
    public static void main(String[] args) {
        ServisIngeneer servisIngeneer = new ServisIngeneer("Сервис-инженер", "Петров Эдуард",
                168, 150, "Кандидат наук", 8, 2);
        servisIngeneer.getInfo();
        servisIngeneer.getSalary();
        servisIngeneer.doWork();
        System.out.println("_______________________");

        DesignIngeneer designIngeneer = new DesignIngeneer("Инженер-крнструктор", "Ломоносов Михаил",
                168, 180, "Высшее", 3, 1);
        designIngeneer.getInfo();
        designIngeneer.getSalary();
        designIngeneer.doWork();
        System.out.println("_______________________");

        Worker worker = new Worker("Рабочий", "Сергеев Василий", 168,
                152, 20);
        worker.getInfo();
        worker.getSalary();
        worker.doWork();
        System.out.println("_______________________");

        Cleaner cleaner = new Cleaner("Уборщик", "Валерьянов Валерий", 0,
                40, 7);
        cleaner.getInfo();
        cleaner.getSalary();
        cleaner.doWork();
    }
}
