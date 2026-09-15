/**
 * Java program to add multiple numbers
 * This program demonstrates different methods to add multiple numbers
 */

import java.util.Scanner;

public class AddMultipleNumbers {

    /**
     * Method 1: Add multiple numbers using a loop
     * @param numbers array of numbers to add
     * @return sum of all numbers
     */
    public static int addNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * Method 2: Add multiple numbers using recursion
     * @param numbers array of numbers
     * @param index current index
     * @return sum of remaining numbers
     */
    public static int addNumbersRecursive(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + addNumbersRecursive(numbers, index + 1);
    }

    /**
     * Method 3: Add numbers using variable arguments (varargs)
     * @param numbers variable number of integers
     * @return sum of all numbers
     */
    public static int addNumbersVarargs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * Main method to demonstrate all methods
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program to Add Multiple Numbers ===\n");

        // Method 1: Using array input
        System.out.print("Enter the number of integers to add: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate sum using different methods
        int sum1 = addNumbers(numbers);
        System.out.println("\n--- Results ---");
        System.out.println("Sum (using loop): " + sum1);

        int sum2 = addNumbersRecursive(numbers, 0);
        System.out.println("Sum (using recursion): " + sum2);

        int sum3 = addNumbersVarargs(numbers);
        System.out.println("Sum (using varargs): " + sum3);

        // Example with varargs (direct usage)
        System.out.println("\nExample: Sum of 5 + 10 + 15 + 20 = " + addNumbersVarargs(5, 10, 15, 20));

        scanner.close();
    }
}
