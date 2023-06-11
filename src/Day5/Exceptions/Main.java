package Day5.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("Enter the nr: ");
            double number=sc.nextDouble();

            if (number>10){
                throw new NoGreater10("Custom Excpetion");
            }
            else {
                System.out.println(number);
            }

        }
        catch(NoGreater10 err){

            System.out.println(err.getMessage());

        }
        catch (InputMismatchException err){
            System.out.println("Thats not a value");
        }
        finally {
            sc.close();
            System.out.println("Scanner closed");
        }
    }


}
