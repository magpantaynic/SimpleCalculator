/*
    Create another class called App that presents a simple console calculator UI to the user. This second class should handle all user input and console output and must use the first class to perform all of the math operations.
The UI should give the user a choice of operations. One of the choices should be to exit the program.
After the user selects an operation, the UI should ask the user for two operands and then display the result of the calculation.
The UI should then display the menu of choices again.
When the user chooses to exit the program, the UI should print a thank you message.


*/

import java.util.Scanner;

public class App {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);


        do
        {
            
            System.out.println("Enter your first number: ");
            // = scan.nextDouble(); //<-- using nextDouble because user is gonna be entering numbers
            System.out.println("Enter your second number: ");
            // = scan.nextDouble();

            // Print an error message or throw an exception if a user enters a value that
            // is not a number. But only show an error message, do not let the program
            // quit. Let the program ask for a number again

        } while();

        // Determine if the user wants to calculate another pair of numbers
        System.out.println();





        // If the user wants to leave, they should type in exit
        
    }
}
