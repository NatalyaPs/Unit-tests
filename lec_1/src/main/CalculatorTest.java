package main;

// import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {

    public static void main(String[] args) {
        // // Проверка базового функционала с целыми числами:
        // if (8 != Calculator.calculation(2, 6, '+')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        // if (0 != Calculator.calculation(2, 2, '-')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        // if (14 != Calculator.calculation(2, 7, '*')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        // if (2 != Calculator.calculation(100, 50, '/')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        // // Теперь добавим в CalculatorTest проверку, в этом случае есть некоторая особенность: основные тесты, которые нужно писать, это тесты на успешные  сценарии работы (позитивные сценарии). Но в ситуации с делением на ноль мы проверяем, как поведёт себя в негативном сценарии. Код должен выбрасывать определённое исключение, мы можем проверить тип ошибки и сообщение, выбрасываемое программой. => добавляем try catch. 
        // // Случаи с неправильными аргументами
        // // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
        // try {
        //     Calculator.calculation(8, 4, '_');
        // } catch (IllegalStateException e) {
        //     if (!e.getMessage().equals("Unexpected value operator: _")) {
        //         throw new AssertionError("Ошибка в методе");
        //     }
        // }



        // // Проверка базового функционала с целыми числами, с использованием утверждений:
        // assert 8 == Calculator.calculation(2, 6, '+');
        // assert 0 == Calculator.calculation(2, 2, '-');
        // assert 14 == Calculator.calculation(2, 7, '*');
        // assert 2 == Calculator.calculation(100, 50, '/');
        // // assert 20 == Calculator.calculation(100, 50, '/'); // Exception in thread "main" java.lang.AssertionError         at main.CalculatorTest.main(CalculatorTest.java:37)



        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);  // "утверждаю, то 2 + 6 равняется 8" - читается так
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
        // assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(20);  // Exception in thread "main" java.lang.AssertionError: expected: 20 but was: 2  at main.CalculatorTest.main(CalculatorTest.java:50)



        // новый код с использованием AssertJ вместо примера выше с try - catch:
        // лямбда выражения ()->   или анонимные функции, т.е. сп-б вызова функции без объявления - сразу описывается и используется
        assertThatThrownBy( () -> Calculator.calculation(8, 4, '_'))
                .isInstanceOf(IllegalStateException.class);
                // выполнение пр-мы в случае успешной проверки (т.е.будет выброшено исключение) не прерывается 
    }
}

