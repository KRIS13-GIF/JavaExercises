package Day5.Abstract.shape;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public int getPerimeter() {
        return 2*3*radius;
    }

    @Override
    public int getArea() {
        return 3*radius*radius;
    }
}
