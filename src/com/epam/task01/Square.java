package com.epam.task01;

public class Square extends Figure {
    private int side;

    public Square(int s) {
        this.side = s;
    }

    public double findSquare() {
        return Math.pow(side, 2);

    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
