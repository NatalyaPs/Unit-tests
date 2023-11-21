/*Задание 2. У вас есть класс BookService, который использует интерфейс BookRepository для получения
информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя
Mockito для создания мок-объекта BookRepository.*/

package seminars.fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;


class BookServiceTest {
    BookRepository bookRepository;
    BookService bookService;

    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void setUp () {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
        book1 = new Book("1", "Книга1", "Автор1");
        book2 = new Book("2", "Книга2", "Автор2");
        book3 = new Book("3", "Книга3", "Автор3");
    }

    @Test
    void bookFindByIdTest () {
        when(bookRepository.findById("1")).thenReturn(book1);

        Book result = bookService.findBookById("1");

        verify(bookRepository).findById("1");
        assertThat(result.getId()).isEqualTo("1");
    }

    @Test
    void findAllBooksTest () {
        when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2, book3));

        List<Book> result = bookService.findAllBooks();
        verify(bookRepository).findAll();
        assertThat(result).hasSize(3);
    }
}