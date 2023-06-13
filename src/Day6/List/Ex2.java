package Day6.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int sum=0;
        List<Integer> list = new ArrayList<>();

        while (count<5){
            int nr=sc.nextInt();
            if(nr>=1 && nr<=6) {
                list.add(nr);
                sum += nr;
                count++;
            }

        }

        System.out.println(list);
        double avg=sum/5.0;
        System.out.println(avg);

    }
}
