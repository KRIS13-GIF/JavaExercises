package Day5.ex2;

public class Animal {

    String name;
    int age;
    String color;


    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void yieldVoice(){
        System.out.println("This is the voice of an animal");
    }
    public void animal(){
        System.out.println("I am an animal");
    }

}
