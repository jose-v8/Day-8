import java.util.Scanner;

public class ArithmethicExceptionExample {
    Scanner inp=new Scanner(System.in);
    static void arithmethicex()
    {
        try
        {
            System.out.println("Trying to perform the program 1/0 ");
            int ans=1/0;
        }
        catch (Exception e)
        {
            System.out.print(e.getMessage());
            System.out.println("\tThis specific operation should not be performed");
        }
        finally {
            System.out.println("\nThe program is finished executing .......");
        }
    }
}
