package Day2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = convertMakarena(input);
        System.out.println(result);
    }

    public static String convertMakarena(String input) {
        String result = input.replaceAll(",", "-MAKARENA");
        return result;
    }

}


