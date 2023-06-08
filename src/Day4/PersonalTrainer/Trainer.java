package Day4.PersonalTrainer;

public class Trainer {

    String name;
    double stamina;
    double strength;



    public Trainer(String name, double stamina, double strength) {
       this.name=name;
       this.stamina=stamina;
       this.strength=strength;
    }
    public double addStamina(double stamina){
       return this.stamina+stamina;
    }
    public double reduceStamina(double stamina){
        return this.stamina-stamina;
    }
    public double addStrength(double strength){
        return this.strength+strength;
    }
    public double reduceStrength(double strength){
        return this.strength-strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
}
