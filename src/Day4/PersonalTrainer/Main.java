package Day4.PersonalTrainer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Suplement suplement=new Suplement();
       Trainee trainee=new Trainee("kris",100.0,50.0);// this is the trainee

        Trainer trainer[]=new Trainer[3];
        trainer[0]=new Trainer("jump", 50, 60);
        trainer[1]=new Trainer("run", 40, 70);
        trainer[2]=new Trainer("climb", 30, 50);
        boolean flag=true;

        while (trainee.getStamina()>=0){

            System.out.println("Select 1 for Trainer or 2 for Trainee or 3 to exit: ");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Which exercise do you want to do: ");
                    menu();
                    String input=sc.next();

                    for (Trainer t: trainer){
                        if (input.equals(t.getName())){
                            System.out.println("Your stamina is: "+ trainee.getStamina());
                            double new_stamina=trainee.reduceStamina(t.getStamina());
                            trainee.setStamina(new_stamina);
                            System.out.println("Now your stamina is: "+ trainee.getStamina());
                        }
                    }
                break;
                    case 2:
                    System.out.println("Do you want to add suplements: yes/no ");
                    String in=sc.next();
                    if (in.equals("yes")){
                        double res=suplement.addStamina(30)+trainee.getStamina();
                        trainee.setStamina(res);
                        System.out.println("You new stamina is: "+ trainee.getStamina());
                    }
                break;

                case 3:
                    System.exit(0);

                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("jump/run/climb");
    }


}
