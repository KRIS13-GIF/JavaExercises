package Day7.Ex1;


import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        List<Integer>numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        int sum=numbers.stream().reduce(0, (sum1, nr)->sum1+nr);
        System.out.println(sum);
    }
}
