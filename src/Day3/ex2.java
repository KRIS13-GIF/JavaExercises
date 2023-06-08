package Day3;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Which element do you want to delete: ");

        int[] array = new int[15];
        int myArray[] = new int[15];

        for (int i = 0,  k=0; i < 15; i++) {
            myArray[i] = rand.nextInt(10);
            if (myArray[i] != 7) {
                array[k] = myArray[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(array));
    }
}