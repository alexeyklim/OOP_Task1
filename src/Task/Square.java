package Task;

public class Square extends Figure {
    // TODO: DK: поля класса обычно не делают public. Их обычно объявляют private, а доступ организовывают через геттеры и сеттеры.
    public int side;

    // TODO: DK: Конструктор по умолчанию не обязательно должен присутствовать в классе. В данном случае он не имеет практического смысла.
    // TODO: DK: Его например можно было бы использовать если бы ты создавал квадрат со случайным значением стороны.

    public Square() {

    }
    public Square(int s) {
        this.side = s;
    }

    public void findSquare() {
        // TODO: DK: для возведения в степень можно использовать Math.pow(side, 2)
        this.square = this.side * this.side;
    }
}
