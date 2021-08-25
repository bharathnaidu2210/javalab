//19B91A12D4
//P.BHARATH IT-C
//Write java program to perform single level inheritance
import java.util.*;
class Departments{
  int noOfFaculty;
  String blockName;
  int noOfStudents;
  String hodName;
}
class IT extends Departments{
    public void enterDetails() {
        Scanner input=new Scanner(System.in);
        System.out.println("*****Enter IT branch details****");
        System.out.print("Enter the HOD name:");
        hodName=input.nextLine(); 
        System.out.print("Enter the Block name:");
        blockName=input.nextLine();   
        System.out.print("Enter the No of faculty:");
        noOfFaculty=input.nextInt(); 
        System.out.print("Enter the No of Sudents:");
        noOfStudents=input.nextInt();  
        input.close();   
    }
    public void printTheDetials(){
        System.out.println("***IT department Details****");
        System.out.println("HOD Name:"+hodName);
        System.out.println("Block Name:"+blockName);
        System.out.println("No of Faculty:"+noOfFaculty);
        System.out.println("No of Students:"+noOfStudents);
    }
    
}
public class SingleInheritance{
    public static void main(String[] args)
    {
        IT object=new IT();
        object.enterDetails();
        object.printTheDetials();
    }

}