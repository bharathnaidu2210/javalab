interface Readable{
    void read();
}
interface Writeable{
    void write();
}
class Files implements Readable,Writeable{
    public void  read(){
        System.out.println("this file is readable");
    }
    public void write(){
        System.out.println("this file is writable");
    }

}
public class InterfaceMultipleInheritance {
    public static void main(String[] args) {
        Files obj=new Files();
        obj.read();
        obj.write();
    }
    
}
