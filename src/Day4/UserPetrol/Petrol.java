package Day4.UserPetrol;

public class Petrol {

    double petrol;
    double money;

    public Petrol(double petrol, double money) {
        this.petrol = petrol;
        this.money = money;
    }

    public double getPetrol() {
        return petrol;
    }

    public void setPetrol(double petrol) {
        this.petrol = petrol;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void addPetrol(){
        this.petrol=petrol+10;
    }
    public void addMoney(){
        this.money=money+20;

    }
}
