package Day1.task2;

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter width: ");
        int width= sc.nextInt();

        System.out.print("Enter length: ");
        int length= sc.nextInt();

        int area=area(width, length);
        int perimeter=perimeter(width, length);

        prints(area, perimeter);


    }

    public static void prints(int area, int perimeter){
        System.out.println("The area is: "+ area);
        System.out.println("The perimeter is: "+ perimeter);

    }

    public static int area(int width, int length){

        return width*length;
    }

    public static int perimeter(int width, int length){
        return 2*(width+length);
    }
}
