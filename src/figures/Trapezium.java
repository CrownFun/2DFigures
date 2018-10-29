package figures;

import main.Figure;

public class Trapezium implements Figure {

    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double h;

    public double getA() {
        return this.c;
    }

    public double getB() {
        return this.c;
    }

    public double getC() {
        return this.c;
    }

    public double getD() {
        return this.d;
    }

    public double getH() {
        return this.h;
    }

    public Trapezium(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double area() {
        double pole = ((getA() + getB()) / 2) * getH();
        return pole;

    }

    @Override
    public double perimeter() {

        return getC() + getD() + getA() + getB();
    }

    @Override
    public double diagonal() {
        return h;
    }

}
