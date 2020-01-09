package section2;

public class Circle extends Shape {
    int radius;

    public double calculateArea() {
        return 3.1415 * (radius * radius);
    }

    public Circle(int radius, String shapeName) {
        super(shapeName);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
