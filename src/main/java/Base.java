import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by appline on 28.06.20.
 * @author niaim
 * Это мой класс Base, в котором я пишу свой код
 */

public class Base {
    static Scanner scanner = new Scanner(System.in);

    /**
     * В методе main мы даём пользователю выбрать задание: калькулятор или длина слова
     */

    public static void main(String[] args) {
        System.out.println("Выберите номер задания: 1 - калькулятор, 2 - длина слова");
        int task = scanner.nextInt();

        if (task == 1) {
            float firstNum = getFloat();
            float secondNum = getFloat();
            char operation = getOperation();
            float result = calculator(firstNum, secondNum, operation);
            System.out.printf("Результат: %.4f%n", result);
        } else if (task == 2) {
            String[] array = getArray();
            getLongestString(array);
        } else {
            System.out.println("Задание не выбрано.");
        }
    }

    /**
     * В методе getFloat мы возвращаем дробное число вводимое с консоли
     * @return num возвращает дробное число вводимое с консоли
     */

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

    /**
     * В методе getOperation мы возвращаем операцию вводимую с консоли
     * @return operation возвращает операцию вводимую с консоли
     */

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

    /**
     * В методе calculator мы возвращаем результат операции
     * @param firstNum первое число вводимое с консоли
     * @param secondNum второе число вводимое с консоли
     * @param operation операция вводимая с консоли
     * @return result возвращает результат полученный в результате выполнения операции
     */

    public static float calculator(float firstNum, float secondNum, char operation) {
        float result;
        switch (operation) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            default:
                System.out.println("Неизвестная операция. Повторите попытку.");
                result = calculator(firstNum, secondNum, getOperation());
        }
        return result;
    }

    /**
     * В методе getArray мы получаем массив слов введенных с консоли
     * @return возвращает массив слов введенный с консоли
     */

    public static String[] getArray() {
        System.out.print("Введите количество элементов массива: ");
        int amount = scanner.nextInt();
        String[] array = new String[amount];

        for (int i = 0; i < amount; i++) {
            System.out.print("Введите слово с клавиатуры в " + i + " элемент массива: ");
            array[i] = scanner.next();
        }

        System.out.println("Введенный массив: " + Arrays.toString(array));
        return array;
    }

    /**
     * В методе getLongestString мы получаем самое длинное слово в массиве
     * @param array массив в котором надо найти самое длинное слово
     * @return longestString возвращает самое длинное слово в массиве
     */

    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        System.out.println("Самое длинное слово в массиве: " + longestString);
        return longestString;
    }
}
