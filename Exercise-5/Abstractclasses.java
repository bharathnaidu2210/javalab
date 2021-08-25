import java.util.Scanner;

abstract class Area{
    double area;
    double length;
    double width;
    double height;
    double base;
    double side;
    double radius;
    abstract void area();
    Scanner input=new Scanner(System.in);
}
class Reactangle extends Area{
    public void area(){
        
        System.out.print("Enter length of reactangle:");
        length=input.nextDouble();
        System.out.print("Enter breadth of reactangle:");
        width=input.nextDouble();
        area=length*width;
        System.out.println("Area of reactangle:"+area);
        
    }
}
class Square extends Area{
    public void area(){
        System.out.print("Enter the side of square:");
        side=input.nextDouble();
        area=Math.pow(side, 2);
        System.out.println("Area of Square:"+area);
        
    } 
}
class Triangle extends Area{
     public void area(){
         
         System.out.print("Enter the height of tirangle:");
         height=input.nextDouble();
         System.out.print("Enter the length of base:");
         base=input.nextDouble();
         area=height*base*0.5;
         System.out.println("Area of the Triangle:"+area);
         
        }
}
class Circle extends Area{
    public void area(){
        
        System.out.print("Enter the radius of circle:");
        radius=input.nextDouble();
        area=Math.PI*Math.pow(radius, 2);
        System.out.println("Area of the Circle:"+area);
    
    }

}
public class Abstractclasses {
    public static void  main(String[] args) {
        byte choice;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("****Menu****");
            System.out.println("1.Rectangle");
            System.out.println("2.Circle");
            System.out.println("3.Square");
            System.out.println("4.Triangle");
            System.out.println("5.Exit");
            System.out.print("Enter the choice:");
            choice=input.nextByte();
            switch (choice) {
                case 1:
                    Reactangle obj1=new Reactangle();
                    obj1.area();
                    break;
                case 2:
                    Circle obj2=new Circle();
                    obj2.area();
                    break;
                case 3:
                    Square obj3=new Square();
                    obj3.area();
                    break;
                case 4:
                    Triangle obj4=new Triangle();
                    obj4.area();
                default:
                    break;
            }
        }while(choice<5);
        System.out.println("EXIT!");
         input.close();
    }
    
}
