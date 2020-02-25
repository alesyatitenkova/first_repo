package Examples;

import java.util.Scanner;

public class Main5 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число "+number);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте ");
        }
    }
}
