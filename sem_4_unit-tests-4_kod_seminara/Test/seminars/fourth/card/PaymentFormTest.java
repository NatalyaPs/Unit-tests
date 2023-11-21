package seminars.fourth.card;

import org.junit.jupiter.api.Test;
import org.mockito.verification.VerificationMode;

import static org.mockito.Mockito.*;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */

    // класс кредитКард ни с чем не связан => мы можем его проверить обычным юнитом. Здесь мок не нужен
    // а пэйментФорм - основной класс, к-й мы хотим протестировать и у него есть связь с кредитной картой
    // мы заментим кредитКарт на мок.кредитКарт, т.е. мы возвращаем моковый объект кредитной карты - это первое

    @Test
    void paymentTestPay() {
        CreditCard creditCard = mock(CreditCard.class);
        PaymentForm paymentForm = new PaymentForm(creditCard);

        paymentForm.pay(1000.0);  // передаем метод pay

        verify(creditCard, times(1)).charge(1000.0); // проверка вместо ассерта. Часто пишется еще атрибут times, для проверки, что метод вызвался 1 раз
    }


}