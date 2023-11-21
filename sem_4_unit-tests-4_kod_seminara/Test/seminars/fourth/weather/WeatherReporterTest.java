//Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
//обращающийся к внешнему API для получения информации о текущей температуре.
//Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
//Создайте мок-объект для WeatherService с использованием Mockito.

package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {

    @Test
    void weatherTest(){
        // блок подготовки
        WeatherService serviceMock = mock(WeatherService.class); // мокируем - отвязываем WeatherService, т.к.это внешнее и нам надо проверить полько WeatherReporter
        WeatherReporter weatherReporter = new WeatherReporter(serviceMock); // целевая система => создаем, а не импортируем, полноценный класс, к-й будем тестировать
        when(serviceMock.getCurrentTemperature()).thenReturn(25); // когда вызовем метод ... тогда вернуть темпер 25 - это предзаданное условие

        // блок выполнения
        String result = weatherReporter.generateReport(); // сохраняем результат в блок выполнения

        // блок проверки
        assertEquals("Текущая температура: " + 25 + " градусов.",result);
    }

}