package Day4.Pocket;

public class Main {
    public static void main(String[] args) {

        Pocket pocket=new Pocket(5000);

        System.out.println(pocket.getMoney());
        pocket.setMoney(60000000);
        System.out.println(pocket.getMoney());


    }
}
