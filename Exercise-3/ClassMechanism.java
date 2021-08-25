
class ClassMechanism {
     public static void main(String[] args) {
        inside(); 
        Outside obj=new Outside();
        obj.outside();
     }
public static void inside() {
    System.out.println("inside function");
    
        }}
    
         class Outside{
        void outside() {
        System.out.println("outside fuction");
        
    }
            
        }
    
