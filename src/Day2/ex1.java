package Day2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        appearsJava(input);
        startsWithJava(input);
        endsWithJava(input);
        equalsJava(input);
        findJavaPosition(input);
    }

    public static void appearsJava(String input) {

        if (input.contains("Java")) {
            System.out.println("Found Java");
        }
    }

    public static void startsWithJava(String input) {
        if (input.startsWith("Java")) {
            System.out.println("Starts with Java");
        }
    }

    public static void endsWithJava(String input) {
        if (input.endsWith("Java")) {
            System.out.println("Ends with Java");
        }
    }

    public static void equalsJava(String input) {
        if (input.equals("Java")) {
            System.out.println("The string equals Java");
        }
    }

    public static void findJavaPosition(String input) {
        if (input.contains("Java")) {
            System.out.println(input.indexOf("Java"));
        }
    }


}

