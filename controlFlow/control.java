package controlFlow;

// to use scanner obeject
import java.util.Scanner;

// class name must be the same as the file name
public class control {

    public static void main(String[] args) {

        // create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a number");

        // save the value of the user
        int valueOne = input.nextInt();

        // get a second value from the user and save it to a variable
        System.out.println("Choose another number");
        int valueTwo = input.nextInt();

        // close the scanner object
        input.close();

        // if the two values difference is less than 200 end the program.
        if (valueOne - valueTwo < 200) {
            System.out.println("Sorry, try inputing  values greater than 200 for your first number");

            // return stamenets keeps the programm from executing the rest of the code . 
            return;

        }

        // variables for sum values
        int numbersDivisiblebyFour = 0;
        int numbersDivisiblebyEight = 0;
        int numbersNotDividibleByFive = 0;

        // for loop to add values to the variables above
        // Math.min gets the lowest input value
        // Math.max gets highest input value
        for (int x = Math.min(valueOne, valueTwo); x <= Math.max(valueOne, valueTwo); x++) {

            // switch stament to check if even or odd number
            switch (x % 2) {
                case 0:
                    // Even number divisible by 4
                    if (x % 4 == 0) {
                        numbersDivisiblebyFour += x;
                    }
                    // even number divisible by 8
                    if (x % 8 == 0) {
                        numbersDivisiblebyEight += x;
                    }
                    break;
                case 1: // Odd number
                    // odd number NOT divisible by 5
                    if (x % 5 != 0) {
                        numbersNotDividibleByFive += x;
                    }
                    break;
            }

        } // end of for loop

        // Initialize variable for while loop
        int printTime = 0;

        // while TRUE print the stametns inside.
        while (printTime < 3) {
            // prints this statement since printTime is originally 0
            if (printTime == 0) {
                System.out.println("Sum of even numbers divisible by 4: " + numbersDivisiblebyFour);

            }
            // PrintTime is now has a value of 1
            else if (printTime == 1) {
                System.out.println("Sum of even numbers divisible by 8: " + numbersDivisiblebyEight);

            }
            // PrintTime has a value of two still holding TRUE in the while loop so it
            // prints the message below
            else {
                System.out.println("Sum of odd numbers not divisible by 5: " + numbersNotDividibleByFive);
            }
            // increment printTime by 1
            printTime++;
        }

        // while loop does not run again because printTIme value is now 3 holding FALSE
        // in the while loop.

    }

}