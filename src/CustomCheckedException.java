import java.util.Scanner;

class  InvalidAgeException extends Exception{
    InvalidAgeException(String message)
    {
        super(message);
    }
}

public class CustomCheckedException {
    static void invalidAgeException(Scanner inp)
    {
        System.out.println("Enter your age");
        int age=inp.nextInt();

        try
        {
            if (age < 18) {
                throw new InvalidAgeException("You should be atleast 18 years old");

            }
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
