import java.util.Arrays;

/**
 * Created by appline on 28.06.20.
 * @author niaim
 * Это мой класс Change, в котором я пишу свой код
 */

public class Change {
    public static void main(String[] args) {
        getArraySwitch(getRandomArray(20,10));
    }

    /**
     * В методе getRandomArray мы получаем случайный массив чисел от -10 до 10 размерностью 20
     * @param amount количество чисел в массиве
     * @param difference разница для уменьшения диапазона
     * @return array возвращает случайный массив чисел от -10 до 10 размерностью 20
     */

    public static int[] getRandomArray(int amount, int difference) {
        int[] array = new int[amount];
        for (int i = 0; i < amount; i++) {
            array[i] = (int) Math.round((Math.random() * amount) - difference);
        }
        return array;
    }

    /**
     * В методе getArraySwitch мы получаем новый массив со сменой мест у найденых чисел
     * @param arrayRandom массив чисел в котором производится поиск чисел
     * @return arraySwitch возвращает массив со сменой мест у найденых чисел
     */

    public static int[] getArraySwitch(int[] arrayRandom) {
        int maxNegativeIndex = 0;
        int minPositiveIndex = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] < 0) {
                if (arrayRandom[i] > arrayRandom[maxNegativeIndex])
                    maxNegativeIndex = i;
                if (arrayRandom[maxNegativeIndex] >= 0)
                    maxNegativeIndex = i;
            } else if (arrayRandom[i] > 0) {
                if (arrayRandom[i] < arrayRandom[minPositiveIndex])
                    minPositiveIndex = i;
                if (arrayRandom[minPositiveIndex] <= 0)
                    minPositiveIndex = i;
            }

        }
        System.out.println("Массив случайных чисел: " + Arrays.toString(arrayRandom));
        int temp = arrayRandom[maxNegativeIndex];
        arrayRandom[maxNegativeIndex] = arrayRandom[minPositiveIndex];
        arrayRandom[minPositiveIndex] = temp;

        System.out.println("Минимальное положительное число: " + arrayRandom[maxNegativeIndex]);
        System.out.println("Максимальное отрицательное число: " + arrayRandom[minPositiveIndex]);
        System.out.println("Массив случайных чисел: " + Arrays.toString(arrayRandom) + " после смены мест");
        return arrayRandom;
    }
}
