import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {



    static void multiple(Scanner inp )
    {
        try
        {
            System.out.println("Program to find the value after the division :");
            System.out.print("Enter the first integer : ");
            int n1=inp.nextInt();
            System.out.print("\nEnter the second integer : ");
            int n2=inp.nextInt();
            System.out.println("\nThe output is "+n1/n2);
        }
        catch (ArithmeticException e )
        {
            System.out.println("Do not divide the number with 0 ");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Enter the appropriate integer values only");
        }
        finally {
            System.out.println("\nProgram is finished its execution");
        }


    }
}
