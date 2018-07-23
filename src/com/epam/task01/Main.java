package com.epam.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Create a list of Figures
        List<Figure> figures = new ArrayList<Figure>();

        figures.add(FigureFactory.createFigure(FigureType.Circle));
        figures.add(FigureFactory.createFigure(FigureType.Square));
        figures.add(FigureFactory.createFigure(FigureType.Rectangle));

        //Find square for every Figure in list
        for (Figure figure: figures) {
            figure.findSquare();
        }
        FigureUtils.printFiguresSquares(figures);

        //Sort list of Figures by square
        Collections.sort(figures, new Comparator<Figure>() {

            public int compare(Figure a, Figure b) {
                try {
                    return Double.compare(a.findSquare(), b.findSquare());
                } catch(NullPointerException e){
                    System.out.println("NullPointerException caught!");
                }
                return 0;
            }
        });

        //Compare Figures square with number
        FigureUtils.compageFiguresWithNumber(figures, 75.14);

        //Print squares of Figures list
        FigureUtils.printFiguresSquares(figures);
    }
}
