package seminars.third.coverage;

public class SomeService {

    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(int i) {

//        return null; // вместо этого напишите свою реализацию
        if(i%15==0){
            return "FizzBuzz";
        }
        if(i%5==0){
            return "Buzz";
        }
        if(i%3==0){
            return "Fizz";
        }
        return ""+i;
    }

    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива
     */
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 && nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }


    /**
     * 3.3. Метод подсчета скидки - улучшаем код из дз
     * решение в CalculatorTest
     */
    //  СМ. ПРОМЕЖУТОЧНУЮ ЗАДАЧУ ПО УЛУЧШЕНИЮ ТЕСТА ИЗ ПРЕДЫДУЩЕЙ ДЗ в файле CalculatorTest
    // =============================================================

    public double calculatingDiscount( double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double discountedAmount = 0; // Сумма со скидкой (первоначальная сумма - скидка%)
        if (purchaseAmount >= 0) {
            if (discountAmount >= 0 && discountAmount <= 100) {
                discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else {
                throw new ArithmeticException( "Скидка должна быть в диапазоне от 0 до 100%");
            }
        } else {
            // Сумма покупки не может быть отрицательной
            throw new ArithmeticException( "Сумма покупки не может быть отрицательной");
        }
        return discountedAmount; // Метод должен возвращать сумму покупки со скидкой
    }


    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */
    public int luckySum(int a, int b, int c) {
        if (a == 13) return b+c;
        if (b == 13) return a+c;
        if (c == 13) return a+b;
        return a + b + c;
    }

    /**
     * 3.5. Примените подход TDD для создания нового класса MoodAnalyser,
     * который оценивает настроение, выраженное во фразах
     *
     * ПИШЕМ В ПАПКЕ tdd метод и тест в tdd
     */



    // дз 3.1
    //Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным
    //или нечетным. (код приложен в презентации)
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    // дз 3.2
    //Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число
    // в интервал (25;100). (код приложен в презентации)
    public boolean numberInInterval(int n) {
        if ( n >= 25 && n <= 100) {
            return true;
        }
        return false;
    }


}