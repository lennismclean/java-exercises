package com.amigoscode._1_beginners;

/**
 * Exercise: Loops
 *
 * Learn how to use for, while, and do-while loops to repeat code.
 * Loops are fundamental for iterating over data and performing repetitive tasks.
 */
public class _5_LoopExercises {

    public static void main(String[] args) {

        // TODO: 1 - Write a for loop to print numbers 1 to 10
        // Hint: for (int i = 1; i <= 10; i++) { ... }
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);

            }

        // TODO: 2 - Write a while loop to print numbers 10 down to 1 (countdown)
        // Hint: Declare a variable before the loop, use a condition, and decrement inside the loop.
            int i = 10;
            while (i >= 1) {
            System.out.println(i);;
            i--;

        }

        // TODO: 3 - Write a do-while loop that runs at least once
        // Print "This runs at least once!" inside the loop.
        // Use a condition that is false so the loop only runs once.
        // Hint: do { ... } while (condition);
            do {
                System.out.println("This runs at least once!");
            } while (false);


        // TODO: 4 - Write a for loop to print only even numbers from 1 to 20
        // Hint: Use an if statement with the modulus operator (%) inside the loop,
        //       or increment by 2 starting from 2.
            for (int number = 1; number <= 20; number++) {
                if (number % 2 == 0) {
                    System.out.println(number);

                }
        }

        // TODO: 5 - Write a for loop to calculate the factorial of 5 (5! = 120)
        // Declare a variable called factorial and initialize it to 1.
        // Multiply factorial by each number from 1 to 5.
        // Print the result.
            int number = 5;
            int factorial = 1;
            for (i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);



        // TODO: 6 - Use an enhanced for loop (for-each) to iterate over a String array
        // Declare a String array called fruits with at least 4 fruit names.
        // Use an enhanced for loop to print each fruit.
            String[] fruits = {"Apple", "Banana", "Strawberry", "Grape"};
            for (String fruit : fruits) {
                System.out.println(fruit);
            }


        // TODO: 7 - Write a nested for loop to print a 3x3 multiplication table
        // The output should look like:
        //   1  2  3
        //   2  4  6
        //   3  6  9
        // Hint: Use System.out.print() for values on the same row,
        //       and System.out.println() to move to the next row.
            for (int value = 1; value <= 3; value++) {
                for (int j = 1; j <= 3; j++) {
                    System.out.println(value * j + " ");
                }
                    System.out.println();

            }

        // TODO: 8 - Use break and continue in a loop
        // Write a for loop from 1 to 10:
        //   - Use 'continue' to skip the number 5 (do not print it)
        //   - Use 'break' to stop the loop when you reach 8
        // Print each number that is not skipped.
            for (int age = 1; age <= 10; age++) {
                if (age == 5) {
                    continue;
                }
              if (age == 8) {
                  break;

              }
                System.out.println(age);
            }
    }
}
