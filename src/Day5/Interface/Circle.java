package Day5.Interface;

public class Circle implements Shape {

    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return 3.14*rad*rad;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*rad;
    }

    @Override
    public void say() {
        System.out.println("This is circle");
    }
}
