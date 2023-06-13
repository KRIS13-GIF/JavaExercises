package Day6.List;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            list1.add(i);
            list2.add(i);
        }

        for (Integer value : list1) {
            for (Integer integer : list2) {
                System.out.print(value * integer + "\t");
            }
            System.out.println();
        }
    }
}
