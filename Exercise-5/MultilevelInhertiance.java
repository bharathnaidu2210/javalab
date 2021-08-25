//19B91A12D4
//P.BHARATH IT-C
//Write java program to perform mutli level inheritance
import java.util.Scanner;

class Country{
    String countryName;
}
class State extends Country{
String stateName;
}
class District extends State{
 String districtName;
 int pincode;
}
class Location extends District{
 String location;   
}
class Address extends Location{
 String doorNo;
 String streetName;
 public void enterTheAddress(){
     Scanner input=new Scanner(System.in);
     System.out.print("Enter the Country :");
     countryName=input.nextLine();
     System.out.print("Enter the State   :");
     stateName=input.nextLine();
     System.out.print("Enter the District :");  
     districtName=input.nextLine();
     System.out.print("Enter the pincode  :");
     pincode=input.nextInt();
     System.out.print("Enter the city/village:");
     location=input.next();
     System.out.print("Enter the street name:");
     streetName=input.next();
     System.out.print("Ente the Door No:");
     doorNo=input.next();
    input.close();}
    public void printTheAddress(){
        System.out.println("D/no:"+doorNo);
        System.out.println("Street:"+streetName);
        System.out.println("City/village:"+location);
        System.out.println("District:"+districtName);
        System.out.println("pincode-"+districtName);
        System.out.println("State:"+stateName); 
        System.out.println("Country:"+countryName);}
}
public  class MultilevelInhertiance {
    public static void main(String[] args) {
        Address address=new Address();
        address.enterTheAddress();
        address.printTheAddress();
    }
    
}