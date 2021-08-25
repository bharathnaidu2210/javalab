
class A extends Exception
{
A(String s1)
{
super(s1);
}
}
public class UserdefinedExecption {
    public static void main(String args[])
{
 
try
{
throw new A("demo");
}
 catch(Exception e)
{
System.out.println("Exception"+e);
}
}

}
