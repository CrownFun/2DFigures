//
package figures;

import main.Figure;

public class Rectangle implements Figure{

    private double a;
    private double b;

    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
        
    }
            

    public Rectangle(double a, double b) {
       this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        double result = getA() * getB();
        return result;

    }

    @Override
    public double perimeter() {
        double result = 2 * getA() + 2 * getB();
        return result;
    }

    @Override
    public double diagonal() {
        double diagonal = Math.sqrt(getA() * getA() + getB() * getB());
        diagonal = diagonal * 100;
        diagonal = Math.round(diagonal);
        diagonal = diagonal / 100;
        return diagonal;
    }


}
