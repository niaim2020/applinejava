package calculator;

import java.util.Scanner;

public class UserChoice {
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

    public static char getOperation() {
        char operation;
        System.out.print("Введите операцию на выбор +, -, /, * ");
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Операция введена неправильно. Повторите попытку.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
}
