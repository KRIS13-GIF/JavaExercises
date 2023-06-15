package Day7.Ex1;

public class Ex1{
    public static void main(String[] args) {

            Operation addition = (a, b) -> a + b;
            int result = addition.perform(5, 3);
            System.out.println(result);

            Operation subtraction = (a, b) -> a - b;
            result = subtraction.perform(8, 2);
            System.out.println( result);


            Operation multiplication = (a, b) -> a * b;
            result = multiplication.perform(4, 6);
            System.out.println( + result);

            Operation division = (a, b) -> a / b;
            result = division.perform(10, 2);
            System.out.println(result);
        }
    interface Operation {
            int perform(int a, int b);
        }
    }