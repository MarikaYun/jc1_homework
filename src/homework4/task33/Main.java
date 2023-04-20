package homework4.task33;

public class Main {
    public static void main(String[] args) {
        Mixer mixer = new Mixer("Zigmund & Shtain", 6, 5);
        mixer.printInfo();
        mixer.plugIn();
        mixer.speedWork(mixer.getNumOfSpeeds());

        System.out.println("--------------------------------------");

        Conditioner conditioner = new Conditioner("Bosch", 11, 15, 40);
        conditioner.printInfo();
        conditioner.plugIn();
        conditioner.temperatureWork(conditioner.getMinTemperature(), conditioner.getMaxTemperature());
    }
}
