package com.epam.task01;
import java.util.List;

public class FigureUtils {

    //Compare Figures square with value
    public static boolean compageFiguresWithNumber(List<Figure> array, double sq) {
        double squareSum = 0;
        for(int i = 0; i < array.size(); i++) {
            squareSum += array.get(i).findSquare();
        }
        if (squareSum > sq) {
            System.out.println("Square of all figures is GREATER than a given number!");
            return true;
        } else if (squareSum < sq) {
            System.out.println("Square of all figures is LESS than a given number!");
            return false;
        } else {
            System.out.println("Square of all figures EQUALS to a given number!");
            return false;
        }
    }
    public static void printFiguresSquares(List<Figure> figures) {
        for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i).findSquare());
        }
    }
}
