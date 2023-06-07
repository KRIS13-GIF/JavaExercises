package Day2;


import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        reverseString(input);







    }

    public static void reverseString(String input){
        StringBuilder builder=new StringBuilder();
        builder.append(input);
        builder.reverse();
        System.out.println(builder);
    }
}


