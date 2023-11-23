package seminars.five.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberModule {

    public List<Integer> generateListNumbers() {
        List<Integer> listNumber = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            listNumber.add(rnd.nextInt(101));
        }
        return listNumber;
    }
}
