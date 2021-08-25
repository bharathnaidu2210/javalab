import java.lang.*;
// ArthimeticException
class ArithmeticExceptionDemo
{
public void aeMethod()
{
 try
{
int a = 10, b = 0; int c = a/b;
System.out.println (c);
}
catch(ArithmeticException e)
{
System.out.println (e);
}}}
// NullPointerException
class NullPointerExceptionDemo
{
public void npeMethod()
{
 try
{
String a = null; 
System.out.println(a.charAt(0));
}
catch(NullPointerException e)
{
System.out.println(e);
}}}

// StringIndexOutOfBoundsException
class StringIndexOutOfBoundsExceptionDemo
{
public  void sioobeMethod()
{
try
{
 
String a = "This is like chipping "; char c = a.charAt(24); System.out.println(c);
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println(e);
}}}

// FileNotFoundException
class FileNotFoundExceptionDemo
{
public  void fnfeMethod()
{
 try
{
File file = new File(".vscode/javalabExercise-9/JavaBuiltInExceptionss.java"); FileReader fr = new FileReader(file);
}
 catch (FileNotFoundException e)
{
System.out.println(e);
}}}

// NumberFormatException
class NumberFormatExceptionDemo{
    public  void nfeMethod()
{
 try
{

int num = Integer.parseInt ("akki") ; System.out.println(num);
}
 
catch(NumberFormatException e)
{
System.out.println(e);
}}}


// ArrayIndexOutOfBoundsException
 class ArrayIndexOutOfBoundsExceptionDemo{
     public void aioobeMethod(){
           try
{
int a[] = new int[5]; a[6] = 9;
}
 catch(ArrayIndexOutOfBoundsException e)
{
System.out.println (e);
}}}




public class JavaBuiltInExceptions {
    public static void main(String[] args) {
        ArithmeticExceptionDemo aed = new ArithmeticExceptionDemo();
        NullPointerExceptionDemo ned = new NullPointerException();
        StringIndexOutOfBoundsExceptionDemo sioobed = new StringIndexOutOfBoundsExceptionDemo();
        ArrayIndexOutOfBoundsExceptionDemo aioobed = new ArrayIndexOutOfBoundsExceptionDemo();
        NumberFormatExceptionDemo nfed = new NumberFormatExceptionDemo();
        FileNotFoundExceptionDemo fned = new FileNotFoundExceptionDemo();
        aed.aeMethod();
        ned.npeMethod();
        sioobed.sioobeMethod();
        aioobed.aioobeMethod();
        nfed.nfeMethod();
        fned.fnfeMethod();
    }
    
}
