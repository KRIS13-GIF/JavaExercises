package Day7.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input=sc.nextLine();

        List<String>words=new ArrayList<>();
        words.add("kris");
        words.add("kris");
        words.add("kris");
        words.add("hello");
        words.add("erald");
        words.add("team");

      words.stream().filter(w->w.equals(input)).count();
        System.out.println(words.stream().filter(w->w.equals(input)).count());

    }
}
