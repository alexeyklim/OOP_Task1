package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //Create a list of Figures
        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(createFigure("Circle"));
        figures.add(createFigure("Square"));
        figures.add(createFigure("Rectangle"));

        //Find square for every Figure in list
        for(int i = 0; i < figures.size(); i++) {
            figures.get(i).findSquare();
            System.out.println(figures.get(i).square);

        }

        //Sort list of Figures by square
        Collections.sort(figures, new Comparator<Figure>() {

            public int compare(Figure a, Figure b) {
                return a.square > b.square ? 1 : (a.square < b.square) ? -1 : 0;
            }
        });

        //Compare Figures square with number
        compageFiguresWithNumber(figures, 75.14);

        for(int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i).square);

        }

    }
    //Create Figure
    public static Figure createFigure(String str) {
        if (str.toLowerCase().equals("circle")) {
            return new Circle(2);
        } else if (str.toLowerCase().equals("square")) {
            return new Square(4);
        } else if (str.toLowerCase().equals("rectangle")){
            return new Rectangle(2,4);
        } else {
            return null;
        }
    }

    //Compare Figures square with value
    public static void compageFiguresWithNumber(ArrayList<Figure> array, double sq) {
        double squareSum = 0;
        for(int i = 0; i < array.size(); i++) {
            squareSum += array.get(i).square;
        }
        if (squareSum > sq) {
            System.out.println("Square of all figures is GREATER than a given number!");
        } else if (squareSum < sq) {
            System.out.println("Square of all figures is LESS than a given number!");
        } else {
            System.out.println("Square of all figures EQUALS to a given number!");
        }
    }

}
