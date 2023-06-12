package Day6.Set;

import java.util.*;

public class sets {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("white");
        System.out.println(colors);
        colors.remove("yellow"); // removing a color
        System.out.println(colors); // show set after removing

        // Here I have created an array list and used the addAll method
        List<String>colorsList=new ArrayList<>();
        colorsList.addAll(colors);
        System.out.println(colorsList);

        // using sorting default method
        Collections.sort(colorsList);
        System.out.println(colorsList);
    }
}
