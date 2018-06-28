package Task;

public class Circle extends Figure {
    public int radius;

    public Circle() {

    }
    public Circle(int r) {
        this.radius = r;
    }

    public void findSquare() {
        this.square = 3.14 * this.radius * this.radius;
    }
}
