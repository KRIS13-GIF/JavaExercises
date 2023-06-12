package Day6.List;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {

        List<Integer>list1=new ArrayList<>();

        List<Integer>list2=new ArrayList<>();

        for (int i=1; i<11; i++){
            list1.add(i);
            list2.add(i);
        }

       for (int i=0; i<list1.size(); i++){
           for(int j=0; j<list2.size(); j++){
               System.out.print(list1.get(i)*list2.get(j)+ "\t");
           }
           System.out.println();
       }
    }
}
