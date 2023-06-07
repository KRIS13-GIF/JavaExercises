package Day1.Ex5;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nr: ");
        int nr=sc.nextInt();
        if (nr>0){
            for (int i=0; Math.pow(2,i)<nr; i++){
                System.out.print(Math.pow(2,i)+" ");
            }

        }
    }
}
