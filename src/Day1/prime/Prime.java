package Day1.prime;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nr=sc.nextInt();

        if (nr>1) {

            boolean response = isPrime(nr);

            System.out.println(check(response));
        }
        else {
            System.out.println("Interrupting");
        }


    }


    static boolean isPrime(int n)
    {
        for (int i=2; i < n; i++)
            if (n%i == 0)
                return false;
        return true;
    }

    static String check(boolean res){
        if(res){
            String response="This is prime";
            return response;
        }
        else{

            String response2="This is not prime";
            return response2;
        }

    }
}
