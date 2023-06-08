package Day4.PersonalTrainer;

public class Trainee {
    private String name;
    private double stamina;
    private double strength;

    public Trainee(String name, double stamina, double strength) {
        this.name = name;
        this.stamina = stamina;
        this.strength = strength;
    }

    public Trainee(){}

    public double addStamina(double stam){
        return this.stamina+stam;
    }

    public double reduceStamina(double stam) {
        if (this.stamina > 0) {
            return this.stamina - stam;
        }
        else {
            return this.stamina-0;
        }
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
