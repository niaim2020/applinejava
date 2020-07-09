package calculator;

import java.util.Scanner;

public class Operations {
    static Scanner scanner = new Scanner(System.in);

    public float addition(float firstNum, float secondNum) {
        return firstNum + secondNum;
    }

    public float subtraction(float firstNum, float secondNum) {
        return firstNum - secondNum;
    }

    public float division(float firstNum, float secondNum) {
        return firstNum / secondNum;
    }

    public float multiplication(float firstNum, float secondNum) {
        return firstNum * secondNum;
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
