
package figures;

import main.Figure;


public class Square implements Figure {

   private final double a;
   
   public double getA(){
       return a;
   }
    
  public Square (double a){
      this.a = a;
  }  

    @Override
    public double area() {
        return getA()*getA();
    }

    @Override
    public double perimeter() {
        return 2*getA()+2*getA();
    }

    @Override
    public double diagonal() {
        double result = Math.sqrt(getA()*getA()+getA()*getA());
        result = result*100;
        result = Math.round(result);
        result = result/100;
        return result;
    }


    
}
