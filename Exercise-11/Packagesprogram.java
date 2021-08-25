import Area.*;
import java.util.Scanner;
class Packagesprogram{
public static void main(String[] args) {
    AreaOfShapes obj= new  AreaOfShapes();
    Scanner input=new Scanner(System.in);
    byte choice;
        do{System.out.println("****Menu****");
            System.out.println("1.Rectangle");
            System.out.println("2.Circle");
            System.out.println("3.Square");
            System.out.println("4.Triangel");
            System.out.println("5.Exit");
            System.out.print("Enter the choice:");
            choice=input.nextByte();
            switch (choice){
                case 1:
                    System.out.print("Enter the length of rectangle:");
                    double length=input.nextDouble();
                    System.out.print("Enter the breadth of rectangle:");
                    double breadth=input.nextDouble();
                    obj.reactangelArea(length,breadth);
                    break;
                case 2:
                    System.out.print("Enter the radius of circle:");
                    double radius=input.nextDouble();
                    obj.circleArea(radius);
                    break;
                case 3:
                    System.out.print("Enter the side of square:");
                    double side =input.nextDouble();
                    obj.squareArea(side);
                    break;
                case 4:
                    System.out.print("Enter the base of triangle:");
                    double base=input.nextDouble();
                    System.out.print("Enter the height of triangle:");
                    double height=input.nextDouble();
                    obj.triangleArea(height,base);
                default:
                    break;
            }
        }while(choice<5);
        System.out.println("EXIT!");
        input.close();

}}

