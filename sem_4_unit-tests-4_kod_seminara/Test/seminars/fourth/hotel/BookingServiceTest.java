//Вам необходимо написать тест с использованием моков для сервиса бронирования отелей.
//        Условие: У вас есть класс HotelService с методом public boolean isRoomAvailable(int roomId),
//        который обычно проверяет, доступен ли номер в отеле.
//        Вам необходимо проверить правильность работы класса BookingService, который
//        использует HotelService для бронирования номера, если он доступен.

package seminars.fourth.hotel;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {
    private BookingService bookingService;
    private HotelService hotelService;


    @BeforeEach // исполняемый код перед вызовом тестов ниже
    void setUp(){
        hotelService = mock(HotelService.class);
        bookingService= new BookingService(hotelService);
    }

    @Test
    void checkNumberTrue() {
        when(hotelService.isRoomAvailable(24)).thenReturn(true); // без этого работать не будет, а будут поставляться дефолтные значени для булевых - это фолс. Нужно прописывать значения для мока

        boolean result = bookingService.bookRoom(24);

        assertTrue(result);
    }

    @Test
    void checkNumberFalse() {
        when(hotelService.isRoomAvailable(23)).thenReturn(false);

        boolean result = bookingService.bookRoom(23);

        assertFalse(result);
    }
}