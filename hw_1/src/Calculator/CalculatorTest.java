package Calculator;

import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {
        public static void main(String[] args) {
                // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-100, 10)).isInstanceOf(ArithmeticException.class).hasMessage("Сумма покупки не может быть отрицательным числом или быть равной 0");

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100, -10)).isInstanceOf(ArithmeticException.class).hasMessage("Скидка не может быть отрицательным числом");      
                
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100, 110)).isInstanceOf(ArithmeticException.class).hasMessage(("Скидка не может быть больше 100%"));
        }


        // не пойму, как можно прописать введение не числовых значений, ведь сам метод не принимает ничего, кроме чисел
        // assertThatThrownBy(() -> Calculator.calculatingDiscount(a, b)).isInstanceOf(IllegalStateException.class);
}