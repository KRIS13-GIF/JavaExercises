package Day6.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int sum=0;
        List<Integer> list = new ArrayList<>();

        while (count<5){
            int nr=sc.nextInt();
            list.add(nr);
            sum+=count;
            count++;

        }
        double avg=sum/5;
        System.out.println(avg);

    }
}
