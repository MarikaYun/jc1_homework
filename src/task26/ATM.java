package task26;

import java.util.Scanner;

public class ATM {

    private static int hundredBanknot;
    private static int fiftyBanknot;
    private static int twentyBanknot;
    public static final int[] banknot = new int[]{20, 50, 100};


    public ATM(int twe, int fif, int hun) {
        hundredBanknot = hun;
        fiftyBanknot = fif;
        twentyBanknot = twe;
    }

    public int getHundredBanknot() {
        return hundredBanknot;
    }

    public int getFiftyBanknot() {
        return fiftyBanknot;
    }

    public int getTwentyBanknot() {
        return twentyBanknot;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие : 1 - заправить терминал, 2 - снять деньги, 3 - выход");

            int code = Integer.parseInt(scanner.nextLine());
            if (code == 1) {
                setMoney();

                atmCheck();
            } else if (code == 2) {
                getMoney();
                atmCheck();
            } else if (code == 3) {
                break;
            } else
                System.out.println("Неизвестная операция. Выберите другую команду.");
        }
        scanner.close();
    }

    public static void setMoney() {
        System.out.println("Идёт заправка банкомата");
        Scanner sca = new Scanner(System.in);
        System.out.println("Введите количество купюр номиналом $20");
        int t = Integer.parseInt(sca.nextLine());
        twentyBanknot += t;
        System.out.println("Введите количество купюр номиналом $50");
        int f = Integer.parseInt(sca.nextLine());
        fiftyBanknot += f;
        System.out.println("Введите количество купюр номиналом $100");
        int l = Integer.parseInt(sca.nextLine());
        hundredBanknot += l;

    }

    public static void getMoney() {
        System.out.print("В банкомате имеются купюры номиналом $ ");
        printBanknot();
        System.out.println("\nВведите сумму");
        Scanner scan = new Scanner(System.in);
        int sum = Integer.parseInt(scan.nextLine());
        // scan.close();
        System.out.println(colc(sum) ? "" : "Операция невозможна");
    }

    private static void printBanknot() {
        for (int i = 0; i < banknot.length; i++) {
            System.out.print(banknot[i] + ", ");
        }
    }

    private static boolean colc(int suma) {
        if (suma % 10 != 0 || suma < 20 || suma == 30) {
            return false;
        } else {//выдаем деньги
            System.out.println("Вы получили купюры:");
            int xTwe;
            int xFyf = 1;
            int xHun;
            if (suma % 20 == 0 && suma < 100) {
                xTwe = suma / 20;
                if (twentyBanknot< xTwe) {
                    System.out.println("Операция невозможна. Обратитесь к администратору");
                } else {
                    twentyBanknot -= xTwe;
                    System.out.print(xTwe + " по $" + banknot[0]);
                }
            } else if (suma == 50) {
                if (fiftyBanknot < xFyf) {
                    System.out.println("Операция невозможна. Обратитесь к администратору");
                } else {
                    fiftyBanknot -= 1;
                    System.out.print(xFyf + " по $" + banknot[1]);
                }
            } else if (suma == 70 || suma == 90 || suma == 110 || suma == 130) {
                xTwe = (suma - 50) / 20;
                if (twentyBanknot < xTwe || fiftyBanknot < xFyf) {
                    System.out.println("Операция невозможна. Обратитесь к администратору");
                } else {
                    fiftyBanknot -= 1;
                    twentyBanknot -= xTwe;
                    System.out.print(xFyf + " по $" + banknot[1] + "\n" + xTwe + " по $" + banknot[0]);
                }
            } else if (suma % 100 == 0) {
                xHun = suma / 100;
                if (hundredBanknot < xHun) {
                    System.out.println("Операция невозможна. Обратитесь к администратору");
                } else {
                    hundredBanknot -= xHun;
                    System.out.print(xHun + " по $" + banknot[2]);
                }
            } else if (suma > 100 && suma % 100 % 20 == 0) {
                xHun = suma / 100;
                xTwe = suma % 100 / 20;
                if (twentyBanknot < xTwe || hundredBanknot < xHun) {
                    System.out.println("Операция невозможна. Обратитесь к администратору");
                } else {
                    hundredBanknot -= xHun;
                    twentyBanknot -= xTwe;
                    System.out.print(xHun + " по $" + banknot[2] + "\n" + xTwe + " по $" + banknot[0]);
                }
            } else if (suma > 100 && suma % 100 % 50 == 0) {
                xHun = suma / 100;
                if (hundredBanknot < xHun) {
                    System.out.println("Операция невозможна. Обратитесь к администратору");
                } else {
                    hundredBanknot -= xHun;
                    fiftyBanknot -= 1;
                    System.out.print(xHun + " по $" + banknot[2] + "\n" + xFyf + " по $" + banknot[1]);
                }
            } else if (suma > 200 && suma % 100 == 10 || suma % 100 == 30) {
                xHun = (suma - 100) / 100;
                xTwe = (suma - xHun * 100 - 50) / 20;
                if (twentyBanknot < xTwe || fiftyBanknot < xFyf || hundredBanknot < xHun) {
                    System.out.println("Операция невозможна. Обратитесь к администратору");
                } else {
                    hundredBanknot -= xHun;
                    fiftyBanknot -= 1;
                    twentyBanknot -= xTwe;
                    System.out.print(xHun + " по $" + banknot[2] + "\n" + xFyf + " по $" +
                            banknot[1] + "\n" + xTwe + " по $" + banknot[0]);
                }
            } else if (suma > 100 && suma % 100 == 70 || suma % 100 == 90) {
                xHun = suma / 100;
                xTwe = (suma % 100 - 50) / 20;

                if (twentyBanknot < xTwe || fiftyBanknot < xFyf || hundredBanknot < xHun) {
                    System.out.println("Операция невозможна. Обратитесь к администратору");
                } else {
                    hundredBanknot -= xHun;
                    fiftyBanknot -= 1;
                    twentyBanknot -= xTwe;
                    System.out.print(xHun + " по $" + banknot[2] + "\n" + xFyf + " по $" +
                            banknot[1] + "\n" + xTwe + " по $" + banknot[0]);
                }
            }

            return true;
        }
    }

    public static void atmCheck() {
        System.out.println("ATM (" + twentyBanknot + ", " + fiftyBanknot + ", " + hundredBanknot + ")");
    }

}
