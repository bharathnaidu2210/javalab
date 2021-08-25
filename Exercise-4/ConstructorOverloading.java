//package javalab;

import java.util.Scanner;

public class ConstructorOverloading {
    public static void main(String args[])
    { Scanner input=new Scanner(System.in);
        byte choice;
        do{
            System.out.println("****Menu****");
            System.out.println("1.Rectangle");
            System.out.println("2.Circle");
            System.out.println("3.Square");
            System.out.println("4.Exit");
            System.out.print("Enter the choice:");
            choice=input.nextByte();
            switch (choice) {
                case 1:
                    System.out.print("Enter the length of rectangle:");
                    int length=input.nextInt();
                    System.out.print("Enter the breadth of rectangle:");
                    int breadth=input.nextInt();
                    Area object_rectangel=new Area(length,breadth);
                    break;
                case 2:
                    System.out.print("Enter the radius of circle:");
                    float radius=input.nextFloat();
                    Area object_circle=new Area(radius);
                    break;
                case 3:
                    System.out.print("Enter the side of square:");
                    int side =input.nextInt();
                    Area object_square=new Area(side);
                    break;
                default:
                    break;
            }
        }while(choice<=4);
        System.out.println("EXIT!");
        input.close();
        
    }
    
}
class Area{
      Area(int a,int b) {
        System.out.println("Area of rectangle:"+a*b);
        }
    Area(float r) { 
        System.out.println("Area of circle:"+Math.round(Math.PI*Math.pow(r,2)));
    }
    Area(int a){
        System.out.println("Area of square:"+Math.pow(a,2));
}}
