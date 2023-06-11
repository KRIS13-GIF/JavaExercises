package Day5.Interface;

public class Rectangle implements Shape, Edges{

    private double width;
    private double length;
    private int edges;

    public Rectangle(double width, double length, int edges) {
        this.width = width;
        this.length = length;
        this.edges = edges;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+ length);
    }

    @Override
    public void say() {
        System.out.println("This is a geometric body");
    }

    @Override
    public int noEdges() {
        return edges;
    }
}
