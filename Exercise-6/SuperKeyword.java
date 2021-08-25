class Student{  
String id;  
String name;  
Student(String id,String name){  
this.id=id;  
this.name=name;  
}  
}  
class Details extends Student{  
double fee;  
Details(String id,String name,double fee){  
super(id,name);
this.fee=fee;  
}  
void display(){System.out.println(id+" "+name+" "+fee);}  
}  
public class SuperKeyword{  
public static void main(String[] args){  
Details obj=new Details("19b91a12d4","bharath",95000);  
obj.display();  
}}  