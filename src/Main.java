import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);

        System.out.println("Select the program to execute");
        System.out.println("1). try-and-catch block to handle the potential ArithmeticException that occurs when the input is zero.");
        System.out.println("2). multiple catch blocks to handle ArithmeticException (if the second number is zero) and InputMismatchException ");
        System.out.println("3). InvalidAgeException if the age is less than 18.");

        System.out.println("0). Terminate the program ");


        System.out.print("chose the program you want to execute :");
        int choice =inp.nextInt();
        System.out.println("\n\n");

        switch (choice)
        {
            case 1->{ArithmethicExceptionExample.arithmethicex();}
            case 2->{MultipleCatchBlocks.multiple(inp);}
            case 3->{CustomCheckedException.invalidAgeException(inp);}
            case 4->{CustomUncheckedException.customUncheckedExceptionEx(inp);}
            case 0->{return;}
        }


    }
}
