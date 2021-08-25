import java.text.NumberFormat;
import java.util.Scanner;

class BudgetCars{
    double carspeed;
    String carComapany;
    String modelName;
    double mileage;
    double price;
    public void getCarDetails(){
      String result=NumberFormat.getCurrencyInstance().format(price);
      System.out.println("Car company:"+carComapany);
      System.out.println("Model      :"+modelName);
      System.out.println("high speed :"+carspeed+"km/h");
      System.out.println("mileage    :"+mileage+"km/l");
      System.out.println("price($)   :"+result);
    }
    public void putCarDetails(){
        carspeed=165;
        carComapany="Maruti Suzuki";
        modelName="swift dizer";
        mileage=23.20;
        price=29_990;
  }
  
}
class LuxaryCars extends BudgetCars{
  @Override
  public void putCarDetails(){
       carspeed=250;
       carComapany="Rolls Royce";
       modelName="Ghost";
       mileage=6.5;
       price=311_900;
        }
  
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        BudgetCars swift=new BudgetCars();
        LuxaryCars rollsRoyce =new LuxaryCars();
        byte choice;
       do{
        System.out.println("****menu****");
        System.out.println("1.Budget Cars");
        System.out.println("2.Luxary Cars");
        System.out.println("3.Exit");
        System.out.print("Entert the choice:");
        choice=input.nextByte();
           switch(choice){
            case 1:  swift.putCarDetails();
                     swift.getCarDetails();
                     break;
            case 2:  rollsRoyce.putCarDetails();
                     rollsRoyce.getCarDetails();
                     break;
            case 3:  System.out.println("Exit!");break;
            default:System.out.println("please choose from 1-3 options");
        }}while(choice!=3);
        }
}
