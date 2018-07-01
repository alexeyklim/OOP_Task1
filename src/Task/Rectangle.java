package Task;

public class Rectangle extends Figure {
    // TODO: DK: поля класса обычно не делают public. Их обычно объявляют private, а доступ организовывают через геттеры и сеттеры.
    public int side1;
    public int side2;

    // TODO: DK: Конструктор по умолчанию не обязательно должен присутствовать в классе. В данном случае он не имеет практического смысла. Тем более он нигде не используется.
    // TODO: DK: Его например можно было бы использовать если бы ты создавал прямоугольник со случайным значением длины и ширины.

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
