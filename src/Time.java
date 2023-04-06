public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int second) {

        this.second = second;
    }

    public int allSeconds() {
        int hourToSecond = hour * 3600;
        int minuteToSecond = minute * 60;
        return hourToSecond + minuteToSecond + second;
    }

    public static int compare(Time time1, Time time2) {
        if (time1.allSeconds() > time2.allSeconds()) {
            return 1;
        } else if (time1 == time2) {
            return 0;
        } else return -1;
    }

    public static void printInfo(Time time) {
        System.out.println("V obekte polnoe kolichestvo sekund " + time.allSeconds());
    }


    public static void main(String[] args) {
        Time time = new Time(456);
        Time time1 = new Time(525);
        Time time2 = new Time(5, 23, 45);
        Time time3 = new Time(1, 2, 45);
        System.out.println(time2.allSeconds());
        System.out.println(time3.allSeconds());
        System.out.println(compare(time1, time));
        printInfo(time);
        printInfo(time1);
    }
}
