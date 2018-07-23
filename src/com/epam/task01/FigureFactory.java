package com.epam.task01;

import java.util.Random;

public class FigureFactory {

    public static Figure createFigure(FigureType type) {
        switch (type) {
            case Circle:
                return new Circle(new Random().nextInt(10) + 1);

            case Square:
                return new Square(new Random().nextInt(10) + 1);

            case Rectangle:
                return new Rectangle(new Random().nextInt(10) + 1, new Random().nextInt(10) + 1);

            default:
                System.out.println("No such figure type!");
                return null;
        }
    }
}
