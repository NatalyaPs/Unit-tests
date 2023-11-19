package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService someService;

    // ч.б. SomeService всегда был новый в каждом тесте
    @BeforeEach
    void setUp() { someService = new SomeService(); }


  // 3.1.
  //  void multipleThreeNotFiveReturnsFizz(int n) {
        // assertEquals...
  //  }

    @Test
    void testReturnFizz() {
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    void testReturnBuzz() {
        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    void testReturnFizzBuzz() {
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void testReturnValue() {
        assertThat(someService.fizzBuzz(11)).isEqualTo("11");
    }

    // 3,2

    @Test
    void firstLast6 () {
        assertThat(someService.firstLast6(new int[]{6, 5, 4, 6})).isTrue();
    }

    //  3,3  -> СМ. ПРОМЕЖУТОЧНУЮ ЗАДАЧУ ПО УЛУЧШЕНИЮ ТЕСТА ИЗ ПРЕДЫДУЩЕЙ ДЗ в файле CalculatorTest и SomeService
    // =============================================================


    // 3.4
    @Test
    void sumCorrect() {
        assertThat(someService.luckySum(1, 2, 3)).isEqualTo(6);
    }
    @Test
    void sumCorrectA() {
        assertThat(someService.luckySum(13, 2, 3)).isEqualTo(5);
    }
    @Test
    void sumCorrectB() {
        assertThat(someService.luckySum(1, 13, 3)).isEqualTo(4);
    }
    @Test
    void sumCorrectC() {
        assertThat(someService.luckySum(1, 2, 13)).isEqualTo(3);
    }

    /**
     * 3.5. Примените подход TDD для создания нового класса MoodAnalyser,
     * который оценивает настроение, выраженное во фразах
     *
     * ПИШЕМ В ПАПКЕ tdd метод и тест в tdd
     */


    // дз 3.1
    @Test
    void testEvenOddNumberPositive () {
        assertThat(someService.evenOddNumber(4)).isTrue();
    }

    @Test
    void testEvenOddNumberNegative () {
        assertThat(someService.evenOddNumber(5)).isFalse();
    }

    // 3.2 лучше сделать параметризованным - неск.значений внутри и неск.знач.за интревалом - так же 2 параметризованных теста
    // дз 3.2
    @ParameterizedTest
    @CsvSource({ "25", "100" })
    void testNumberInIntervalPositive (int n) {
        assertThat(someService.numberInInterval(n)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({ "24", "101" })
    void testNumberInIntervalNegative (int n) {
        assertThat(someService.numberInInterval(n)).isFalse();
    }

    //    @Test
//    void testNumberInInterval () {
//        assertThat(someService.numberInInterval(55)).isTrue();
//    }

    //    @Test
//    void testNumberNotInInterval () {
//        assertThat(someService.numberInInterval(5)).isFalse();
//    }

}