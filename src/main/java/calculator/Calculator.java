package calculator;

public class Calculator {
    public static void main(String[] args) {
        Operations operation = new Operations();

        float firstNum = UserChoice.getFloat();
        float secondNum = UserChoice.getFloat();
        char operationSymbol = UserChoice.getOperation();

        try {
            float result;
            switch (operationSymbol) {
                case '+':
                    System.out.println(String.valueOf(operation.addition(firstNum, secondNum)));
                    result = operation.addition(firstNum, secondNum);
                    break;
                case '-':
                    System.out.println(String.valueOf(operation.subtraction(firstNum, secondNum)));
                    result = operation.subtraction(firstNum, secondNum);
                    break;
                case '/':
                    System.out.println(String.valueOf(operation.division(firstNum, secondNum)));
                    result = operation.division(firstNum, secondNum);
                    break;
                case '*':
                    System.out.println(String.valueOf(operation.multiplication(firstNum, secondNum)));
                    result = operation.multiplication(firstNum, secondNum);
                    break;
                default:
                    System.out.println("Неизвестная операция. Повторите попытку.");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 невозможно " + e);
        }

    }
}
