package Day3;

import java.util.HashMap;

public class ex1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        /*
        numbers.put(0,0);
        numbers.put(1,0);
        numbers.put(2,0);
        numbers.put(3,0);
        numbers.put(4,0);
        numbers.put(5,0);
        numbers.put(6,0);
        numbers.put(7,0);
        numbers.put(8,0);
        numbers.put(9,0);
        numbers.put(10,0);
        */
        for (int i=1; i<11; i++){
            numbers.put(i, 0);
        }

        int [] myArray= {6,5 ,4 ,5 ,10 ,5 ,8 ,3 ,10, 6 ,6 ,6 ,4 ,3, 2, 8, 1, 3, 4, 7};

            for (int j: myArray){
                if (numbers.containsKey(j)) {
                    numbers.put(j,numbers.get(j)+1);
                }
            }

        System.out.println(numbers);

    }
}
