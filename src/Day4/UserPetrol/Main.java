package Day4.UserPetrol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Petrol userPetrol=new Petrol(55, 68);
        boolean flag=true;
        while (flag){
            System.out.println("Enter continue or break the loop: ");
            String input=sc.nextLine();
            if (input.equals("continue")){
                userPetrol.addMoney();
                userPetrol.addPetrol();
            }
            else{
                flag=false;
                System.out.println("Pay the amount: "+ userPetrol.getMoney()+" : ");
                System.out.println("Petrol: "+ userPetrol.getPetrol());
                double money=sc.nextDouble();
                if (money> userPetrol.getMoney()){
                    double moneyBack= money- userPetrol.getMoney();
                    System.out.println("You take back: "+ moneyBack);
                } else if (money== userPetrol.getMoney()) {
                    System.out.println("You have paid it completely");
                }
                else {
                    double moreMoney= userPetrol.money-money;
                    System.out.println("You have to pay other "+ moreMoney+ "$");
                }
            }

        }
    }
}
