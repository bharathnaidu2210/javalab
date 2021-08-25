package Area; 
interface AreaofTriangle{
     public void triangleArea(double h,double b);
         }
public class AreaOfShapes implements AreaofTriangle{
    
    public void reactangelArea(double x,double y) {
        System.out.println("Area of reactangle:"+x*y);
        }
    public void circleArea(double x) {
        System.out.println("Area of circle:"+3.14*x*x);
    }
    public void squareArea(double x) {
        System.out.println("Area of Square:"+x*x);
    }
    public void triangleArea(double h ,double b){
        System.out.println("Area of triangle:"+0.5*b*h);
    }
}

