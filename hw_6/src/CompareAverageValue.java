import java.util.List;

public class CompareAverageValue {

    public static String compareAverageLists (List<Double> list1, List<Double> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    private static double calculateAverage(List<Double> list) {
        if (list.isEmpty()) {
            throw new RuntimeException("Список пустой");
        }

        double sum = 0;
        for (double num : list) {
            sum += num;
        }
        return sum / list.size();
    }
}