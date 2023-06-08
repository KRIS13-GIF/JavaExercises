package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        {

            int [] myArray={1, 7, 3, 10, 9};
            for (int i=0; i<myArray.length; i++){
                if (myArray[i]==10){
                    System.out.println(i);
                }
            }
        }
    }
}
