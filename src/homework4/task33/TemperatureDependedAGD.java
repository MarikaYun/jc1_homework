package homework4.task33;

import java.util.Scanner;

public class TemperatureDependedAGD extends AGD {
    private int minTemperature;
    private int maxTemperature;

    public TemperatureDependedAGD(String name, int amper, int minTemperature, int maxTemperature) {
        super(name, amper);
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void temperatureWork(int minTemperature, int maxTemperature) {
        boolean isTemperatureCorrect;
        System.out.println("Выберите температуру от " + minTemperature + " до " + maxTemperature + ":");
        System.out.println("Для выключения нажмите 0");
        Scanner scanner = new Scanner(System.in);
        int temperature;
        do {
            temperature = scanner.nextInt();
            isTemperatureCorrect = temperature >= minTemperature && temperature <= maxTemperature;
            if (isTemperatureCorrect && temperature != 0) {
                System.out.println("Задана температура " + temperature + " градусов");
            }
            if (temperature == 0) {
                System.out.println("Выключение");
            }
            if (!isTemperatureCorrect && temperature != 0) {
                System.out.println("Данный температурный режим не может быть выбран");
            }
        } while (temperature != 0);
    }


    @Override
    public void printInfo() {

    }
}
