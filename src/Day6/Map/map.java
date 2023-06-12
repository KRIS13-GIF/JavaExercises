package Day6.Map;

import java.util.*;

public class map {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Map<Integer,Person> map=new HashMap<Integer,Person>();

        int count=0;
        while (count<2){
            System.out.println("Enter the name: ");
            String name=scanner.next();
            System.out.println("Enter the surname: ");
            String surname=scanner.next();
            System.out.println("Enter the age: ");
            int age=scanner.nextInt();
            List<String>friends=new ArrayList<>();

            for (int i=0; i<3; i++){
                System.out.println("Enter name for friends: ");
               String fname=scanner.next();
                friends.add(fname);
            }
            map.put(count, new Person(name, surname, age, friends));
            count++;
        }

        for (int i=0; i<map.size(); i++){
            System.out.println(map.get(i));
        }









    }
}
