package figures;

import main.Figure;

public class Triangle implements Figure {

    private final double a;
    private final double b;
    private final double base;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getBase() {
        return this.base;
    }

    public Triangle(double a, double b, double podstawa) {
        this.a = a;
        this.b = b;
        this.base = podstawa;
    }

    public boolean triangleExists() {    // Metoda sprawdzająca warunek istnienia trójkąta
        boolean exists = false;
        double max;
        double rest;

        if (getA() > getB() && getA() > getBase()) {
            max = getA();
        } else if (getB() > getA() && getB() > getBase()) {
            max = getB();
        } else {
            max = getBase();
        }
        System.out.println(max);
        rest = (getA() + getB() + getBase()) - max;
        System.out.println(rest);

        if (max < rest) {
            exists = true;
        }

        return exists;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        double pole = Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getBase()));
        pole = pole * 100;
        pole = Math.round(pole);
        pole = pole / 100;
        return pole;
    }

    @Override
    public double diagonal() {
        double h = (area() * 2) / getBase();
        h = h * 100;
        h = Math.round(h);
        h = h / 100;
        return h;
    }

    @Override
    public double perimeter() {
        return getA() + getB() + base;
    }

}
