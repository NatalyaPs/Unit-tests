package Calculator;
// package Calculator;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if(purchaseAmount <= 0 ) {
            throw new ArithmeticException("Сумма покупки не может быть отрицательным числом или быть равной 0");
        }
        if(discountAmount < 0 ) {
            throw new ArithmeticException("Скидка не может быть отрицательным числом");
        }
        if(discountAmount > 100) {
            throw new ArithmeticException("Скидка не может быть больше 100%");
        }

        double sizeAmount = purchaseAmount / 100 * discountAmount; // сумма скидки
        double amountWithDiscount = purchaseAmount - sizeAmount;  // сумма покупки со скидкой
        return amountWithDiscount; // Метод должен возвращать сумму покупки со скидкой
    }

    public static void main(String[] args) {
        System.out.println(calculatingDiscount(100, 10));
    }
}
