import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

 class CompairAverageValueTest {
    private CompareAverageValue compareAverageValue;

    @BeforeEach
    void setUp () {
        compareAverageValue = new CompareAverageValue();
    }

    // сравнение заполненных списков, где среднее значение второго списка больше
    @Test
    void testAverageGreaterSecondList () {
        List<Double> list1 = new ArrayList<>();
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);

        List<Double> list2 = new ArrayList<>();
        list2.add(4.0);
        list2.add(5.0);

        String result = CompareAverageValue.compareAverageLists(list1, list2);

        assertThat(result).isEqualTo("Второй список имеет большее среднее значение");
    }

    // сравнение заполненных списков, где среднее значение первого списка больше
    @Test
    void testAverageGreaterFirstList () {
        List<Double> list1 = new ArrayList<>();
        list1.add(6.0);
        list1.add(7.0);
        list1.add(8.0);

        List<Double> list2 = new ArrayList<>();
        list2.add(4.0);
        list2.add(5.0);
        list2.add(-3.0);

        String result = CompareAverageValue.compareAverageLists(list1, list2);

        assertThat(result).isEqualTo("Первый список имеет большее среднее значение");
    }

    // средние значения равны
     @Test
     void testAverageValuesAreEqual () {
         List<Double> list1 = new ArrayList<>();
         list1.add(6.0);
         list1.add(7.0);
         list1.add(8.0);

         List<Double> list2 = new ArrayList<>();
         list2.add(5.0);
         list2.add(7.0);
         list2.add(9.0);

         String result = CompareAverageValue.compareAverageLists(list1, list2);

         assertThat(result).isEqualTo("Средние значения равны");
     }

    // сравнение пустого и заполненного списков
    @Test
    void testEmptyEndFilledLists () {
        List<Double> list1 = new ArrayList<>();

        List<Double> list2 = new ArrayList<>();
        list2.add(4.0);
        list2.add(5.0);

        assertThatThrownBy(() -> CompareAverageValue.compareAverageLists(list1, list2))
                .isInstanceOf(RuntimeException.class).hasMessage("Список пустой");
    }

    // сравнение двух пустых списков
    @Test
    void testCompareTwoEmptyLists () {
        List<Double> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();

        assertThatThrownBy(() -> CompareAverageValue.compareAverageLists(list1, list2))
                .isInstanceOf(RuntimeException.class).hasMessage("Список пустой");
    }


}