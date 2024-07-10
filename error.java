import java.util.Scanner;

public class error {
    Scanner r=new Scanner(System.in);
    float c;
    public error()
    {
        System.out.println("Enter two numbers\n");
        float num1=r.nextFloat();
        float num2=r.nextFloat();

        try
        {
            c=num1/num2;
            System.out.println("Division Result="+c);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Division not possible exception is occured");
        }
        finally
        {
            System.out.println("Any number is divided by zero the exception will be occured");
        }
    }

}
