import java.util.Scanner;

class uncheckedNegativeNumberException extends RuntimeException{
    uncheckedNegativeNumberException(String message)
    {
        super(message);
    }
}

public class CustomUncheckedException {
    static void customUncheckedExceptionEx(Scanner inp)
    {
        System.out.print("Enter the number :");
        int input=inp.nextInt();

        try {
            if (input<0)
            {
                throw new uncheckedNegativeNumberException("Enter the number greater than 0");
            }
        } catch (uncheckedNegativeNumberException e) {

            System.out.println(e.getMessage());
        }




    }
}
