package com.epam.task01;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(int s1, int s2) {
        this.side1 = s1;
        this.side2 = s2;
    }

    public double findSquare() {
        return this.side1 * this.side2;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }
}
