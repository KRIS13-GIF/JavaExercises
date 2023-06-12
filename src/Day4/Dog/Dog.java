package Day4.Dog;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Dog(String name, int age, String gender, String race, double weight) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Dog(String gender, String race) {
        // call the main constructor
        this("Default", 7, gender, race, 25);
        this.gender = gender;
        this.race = race;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age>0 && age<100) {
            this.age = age;
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>0 && weight<100) {
            this.weight = weight;
        }
    }


//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                ", race='" + race + '\'' +
//                ", weight=" + weight +
//                '}';
//    }
}
