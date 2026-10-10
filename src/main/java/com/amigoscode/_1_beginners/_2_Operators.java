package com.amigoscode._1_beginners;

/**
 * Exercise: Operators
 *
 * Learn how to use arithmetic, comparison, logical, and other operators in Java.
 * Operators allow you to perform operations on variables and values.
 */
public class _2_Operators {

    public static void main(String[] args) {

        // TODO: 1 - Use arithmetic operators (+, -, *, /) on two int variables and print the results
        // Declare two int variables (e.g., a = 10, b = 3)
        // Print the result of a + b, a - b, a * b, and a / b
            int a = 10;
            int b = 3;
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b));

        // TODO: 2 - Use the modulus operator (%) to check if a number is even
        // Declare an int variable called number with any value.
        // Print the result of number % 2
        // Print whether the number is even (result is 0) or odd (result is 1)
            int number = 10;
            System.out.println(number % 2); // Output: 0


        // TODO: 3 - Use increment (++) and decrement (--) operators
        // Declare an int variable called counter, set it to 5
        // Use counter++ and print the result, then use counter-- and print the result
            int counter = 5;
            System.out.println(counter++); // Output: 5
            System.out.println(counter--); // Output: 6

        // TODO: 4 - Use compound assignment operators (+=, -=, *=)
        // Declare an int variable called score, set it to 10
        // Use +=, -=, and *= on score, printing after each operation
            int score = 10;
            System.out.println("Initial Score: " + score);

            score += 5;
            System.out.println("After += 5: " + score); // score = score + 5

            score -= 3;
            System.out.println("After -= 3: " + score); // score = score -3

            score *= 2;
            System.out.println("After *= 2: " + score); // score = score * 2


        // TODO: 5 - Use comparison operators (==, !=, >, <, >=, <=) and print the boolean results
        // Declare two int variables (e.g., x = 5, y = 10)
        // Print the result of each comparison, e.g.: System.out.println("x == y: " + (x == y));
            int x = 5;
            int y = 10;

            System.out.println("x = " + x + ", y = " + y);
            System.out.println();

            System.out.println("x == y: " + (x == y));
            System.out.println("x != y: " + (x != y));
            System.out.println("x > y: " + (x > y));
            System.out.println("x < y: " + (x < y));
            System.out.println("x >= y: " + (x >= y));
            System.out.println("x <= y: " + (x <= y));


        // TODO: 6 - Use logical operators (&&, ||, !) to combine conditions
        // Declare two boolean variables (e.g., hasLicense = true, hasInsurance = false)
        // Print the result of: hasLicense && hasInsurance
        // Print the result of: hasLicense || hasInsurance
        // Print the result of: !hasLicense

        boolean hasLicense = true;
        boolean hasInsurance = false;
        System.out.println("hasInsurance: " + hasInsurance);
        System.out.println("hasLicense: " + hasLicense);
        System.out.println();

        System.out.println("hasLicense & hasInsurance: " + (hasLicense & hasInsurance));

        System.out.println("hasLicense && hasInsurance: " + (hasLicense && hasInsurance));
        System.out.println("hasLicense || hasInsurance: " + (hasLicense || hasInsurance));
        System.out.println("!hasLicense: " + (!hasLicense));

        // TODO: 7 - Use the ternary operator to assign "adult" or "minor" based on age
        // Declare an int variable called age with any value
        // Use the ternary operator: String status = (condition) ? "adult" : "minor";
        // Print the status
            int age = 25;
            String status = (age >= 18) ? "Adult" : "Minor";
            System.out.println(status);

    }
}
