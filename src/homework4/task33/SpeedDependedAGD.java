package homework4.task33;

import java.util.Random;

public class SpeedDependedAGD extends AGD {
    private final int numOfSpeeds;


    public SpeedDependedAGD(String name, int amper, int numOfSpeeds) {
        super(name, amper);
        this.numOfSpeeds = numOfSpeeds;
    }

    public int getNumOfSpeeds() {
        return numOfSpeeds;
    }

    @Override
    public void printInfo() {

    }

    public void speedWork(int numOfSpeeds) {
        System.out.println("Выберите скорость от 1 до  " + numOfSpeeds);
        System.out.println("Для выключения выберите 0");
        Random random = new Random();
        int speed;
        do {
            speed = random.nextInt(6);

            switch (speed) {
                case 0:
                    System.out.println("Прибор выключен");
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: {
                    System.out.println("Прибор работает на " + speed + " скорости");
                }
            }
        } while (speed != 0);
    }
}
