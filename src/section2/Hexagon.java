package section2;

public class Hexagon extends Shape {
    int side;

    public Hexagon(String shapeName, int side) {
        super(shapeName);
        this.side = side;

    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
