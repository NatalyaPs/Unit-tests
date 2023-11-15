 package test;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.Calculator;


public class CalculatorTest {

    public static void main(String[] args) {
        
        // из лекции 1: Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);  // "утверждаю, то 2 + 6 равняется 8" - читается так
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
        // assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(20);  // Exception in thread "main" java.lang.AssertionError: expected: 20 but was: 2  at main.CalculatorTest.main(CalculatorTest.java:50)



        @Test
        void evalutesExpression() {
            Calculator calculator = new Calculator();
            assertThat(calculator.calculation(2, 6, '+')).isEqualTo(8);
        }
    }
}

