package Day5.ex2;

public class Dog extends Animal {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void yieldVoice(){
        System.out.println("hum hum");
    }
}
