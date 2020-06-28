import java.util.Scanner;

/**
 * Created by appline on 28.06.20.
 * @author niaim
 * Это мой класс Base, в котором я пишу свой код
 */

public class Base {
    /**
     *В этом методе я ищу сумму двух дробных чисел с округлением до 4 знаков после запятой
     * @param args здесь передаются значения
     * firstNum - первое число которое пользователь вводит в консоль
     * secondNum - второе число которое пользователь вводит в консоль
     * Result - результат сложения чисел
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float firstNum, secondNum, result;
        System.out.print("Введите первое число: ");
        firstNum = num.nextFloat();
        System.out.print("Введите второе число: ");
        secondNum = num.nextFloat();
        result = firstNum + secondNum;
        System.out.printf("Результат: %.4f", result);
    }
}
