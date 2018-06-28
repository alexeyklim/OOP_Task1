package Task;

public class Square extends Figure {
    public int side;

    public Square() {

    }
    public Square(int s) {
        this.side = s;
    }

    public void findSquare() {
        this.square = this.side * this.side;
    }
}
