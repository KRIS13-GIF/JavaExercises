package Day6.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {


        List<String>list=fillArray();
        //System.out.println(deleteElement(list));
        System.out.println(purchaseElements(list));
        showM(list);
        System.out.println(nextElementM(list));



    }


    public static Scanner input(){
        Scanner sc=new Scanner(System.in);
        return sc;
    }

    public static List<String> fillArray(){
        Scanner sc=input();
        List<String>list=new ArrayList<>();
        int count=1;
        while (count<6){
            System.out.println("Enter the name for product: "+ count+" ");
            String name=sc.nextLine();
            if (!(list.contains(name))) {
                list.add(name);
                count++;
            }
            else{
                System.out.println("You can not add this element. It already exists");
            }
        }
        return list;
    }

    public static List <String>purchaseElements(List list){
        System.out.println(list);
        System.out.println("How many elements you need to purchase: ");
        Scanner sc=input();
        int count=0;
        int amount= sc.nextInt();
        while( count<amount ){
            System.out.println("Purchase Element:  ");
            String name = sc.next();
            if (!(list.contains(name))) {
                list.add(name);
                count++;
            } else {
                System.out.println("You can not add this element. It already exists");
            }
        }
        return list;
    }

    public  static List<String>deleteElement(List list){
        Scanner sc=input();
        System.out.println("Enter the element you want to delete: ");
        String name=sc.nextLine();
        if (list.contains(name)){
            list.remove(name);
        }
        else{
            System.out.println("This element does not exist");
        }
        return list;
    }

    public static void showM(List list){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).toString().startsWith("m")){
                System.out.println(list.get(i));
            }
        }
    }

    public  static List<String>nextElementM(List list){
        List<String>nextElementMArray=new ArrayList<>();
        for (int i=0; i<list.size()-1; i++){
            if (list.get(i+1).toString().startsWith("m")){
                nextElementMArray.add((String) list.get(i));
            }
        }
        return nextElementMArray;
    }

}
