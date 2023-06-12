package Day4.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog("Male", "Pitbull");
        Dog dog1=new Dog("Mike", 7, "Male", "Pitbull", 58);
        System.out.println(toString(dog));
        System.out.println(dog1.toString());

        dog1.setAge(757);
        System.out.println(dog1.getAge());

        dog1.setWeight(500);
        System.out.println(dog1.getWeight());
    }
        public static String toString(Dog dog) {
        return "Dog{" +
                "name='" + dog.getName() + '\'' +
                ", age=" + dog.getAge() +
                ", gender='" + dog.getGender() + '\'' +
                ", race='" + dog.getRace() + '\'' +
                ", weight=" + dog.getWeight() +
                '}';
    }
}
