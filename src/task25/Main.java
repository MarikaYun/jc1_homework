package task25;

public class Main {
    public static void main(String[] args) {

        Time time = new Time(456);
        Time time1 = new Time(525);
        Time time2 = new Time(5, 23, 45);
        Time time3 = new Time(1, 2, 45);
        System.out.println(time2.allSeconds());
        System.out.println(time3.allSeconds());
        System.out.println(time.compare(time1, time));
        Time.printInfo(time2);
        Time.printInfo(time1);


    }
}
