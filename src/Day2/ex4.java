package Day2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String input2= sc.nextLine();

        boolean res=checkContain(input1, input2);
        System.out.println(res);
    }

    public static boolean checkContain(String input1, String input2){
        if (input1.contains(input2)) {
            return true;
        }
        else {
            return false;
        }

    }
}
