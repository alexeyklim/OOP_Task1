package Task;

public class Rectangle extends Figure {
    public int side1;
    public int side2;

    public Rectangle() {

    }
    public Rectangle(int s1, int s2) {
        this.side1 = s1;
        this.side2 = s2;
    }

    public void findSquare() {
        this.square = this.side1 * this.side2;
    }
}
