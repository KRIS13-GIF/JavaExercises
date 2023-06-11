package Day5.ex2;

public class Cat extends Animal {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void yieldVoice(){
        System.out.println("mjau mjau");
    }
}
