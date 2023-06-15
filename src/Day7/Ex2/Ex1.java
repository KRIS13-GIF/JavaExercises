package Day7.Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamon");
        List<Integer>numbers=Arrays.asList(1,4,2346,123,76,11,0,0,62,23,50);

        // Sorting the lists
      names.stream().sorted().forEach(System.out::println);
      numbers.stream().sorted().forEach(System.out::println);

      // filter the names that start with E
        List<String> startsE= names.stream().filter(n->n.startsWith("E")).collect(Collectors.toList());
        System.out.println(startsE);

        // values >30 and lower than 200
        List<Integer>valuesGr20Lower200=numbers.stream().filter(
                nr->nr>30 && nr<200
        ).collect(Collectors.toList());
        System.out.println(valuesGr20Lower200);

        // print names upperCase
      names.stream().forEach(n-> System.out.println(n.toUpperCase()));

      // remove first , last letter , sort , print names
        List<String>newList=names.stream().map(n->n.substring(1, n.length()-1)).sorted()
                .collect(Collectors.toList());
        System.out.println(newList);





    }
}
