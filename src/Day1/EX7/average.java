package Day1.EX7;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Enter the " + i + " number:  ");
            int nr = sc.nextInt();
            sum += nr;
        }
        int avg = sum / 3;
        System.out.println(avg);

    }


}
