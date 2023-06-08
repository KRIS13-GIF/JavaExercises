package Day4.GroceryShop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Product product[]=new Product[5];
        Product cart[]=new Product[5];

        product[0]=new Product("Meat", 500);
        product[1]=new Product("Cheese", 300);
        product[2]=new Product("Milk", 100);
        product[3]=new Product("Water", 50);
        product[4]=new Product("Biscuits", 40);
        int count = 0;// this one is for the elements in the list
        int total = 0 ;
        while (count<5) {
            System.out.println("Do you want to buy something: ");
            String name = sc.nextLine();

            for (Product p : product) {
                if (p.getName().equals(name)) {
                    total+=p.getPrice();
                    cart[count] = new Product(p.getName(), p.getPrice());
                    count++;
            }
        }

    }
        System.out.println(total + " is the total");

        for (Product c: cart){
            System.out.println(c.getName()+" : "+ c.getPrice() );
        }



    }
}
