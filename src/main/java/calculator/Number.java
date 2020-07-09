package calculator;

import java.util.Scanner;

public class Number {
    static Scanner scanner = new Scanner(System.in);

    public static float getFloat() {
        float num;
        System.out.print("Введите число: ");
        if (scanner.hasNextFloat()) {
            num = scanner.nextFloat();
        } else {
            System.out.println("Число введено неправильно. Повторите попытку.");
            scanner.next();
            num = getFloat();
        }
        return num;
    }
}
