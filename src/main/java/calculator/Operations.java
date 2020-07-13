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
        if (secondNum == 0) {
            throw new ArithmeticException("Деление на 0 невозможно");
        }
        return firstNum / secondNum;
    }

    public float multiplication(float firstNum, float secondNum) {
        return firstNum * secondNum;
    }
}
