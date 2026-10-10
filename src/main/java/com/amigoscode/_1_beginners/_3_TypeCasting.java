package com.amigoscode._1_beginners;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class _3_TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.
        int age = 21;
        double widened = age;
        System.out.println(widened); // Output: 21.0





        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.
            double value = 9.78;
            int casted = (int)value;
            System.out.println(casted); // Output: 9


        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.
            int value1 = 65;
            char char1 = (char)value1;
            System.out.println(char1);



        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
            int value26 = 90;
            char char26 = (char)value26;
            System.out.println(char26);


        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
            String str = "42";
            int number = Integer.parseInt(str);
            System.out.println(number); // Output: 42

        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
            int num1 = 42;
            String str1 = String.valueOf(num1);
            System.out.println(str1); // Output: 42
    }
}
