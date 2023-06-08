package Day4.PersonalTrainer;

public class Suplement {
    double supplement;
    double stamina;

    public Suplement(double supplement,double stamina) {
        this.supplement = supplement;
    }
    public Suplement(){}

    public double getSupplement() {
        return supplement;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public void setSupplement(double supplement) {
        this.supplement = supplement;
    }


    public double addStamina(double stamina){
        return  stamina;
    }
}
