package seminars.five.number;

import java.util.List;

public class MaxNumberModule {

    public int maxNumberInList (List<Integer> list) {
        int max = 0;
        for (Integer elem : list) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

}
