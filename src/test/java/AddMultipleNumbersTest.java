/**
 * Unit Test Cases for AddMultipleNumbers program
 * Uses JUnit 4 framework for testing
 */

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AddMultipleNumbersTest {

    private AddMultipleNumbers calculator;

    /**
     * Setup method - runs before each test
     */
    @Before
    public void setUp() {
        calculator = new AddMultipleNumbers();
    }

    // ==================== Tests for addNumbers() method ====================

    /**
     * Test adding two positive numbers
     */
    @Test
    public void testAddTwoPositiveNumbers() {
        int[] numbers = {5, 10};
        int result = AddMultipleNumbers.addNumbers(numbers);
        assertEquals("Sum of 5 and 10 should be 15", 15, result);
    }

    /**
     * Test adding multiple positive numbers
     */
    @Test
    public void testAddMultiplePositiveNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = AddMultipleNumbers.addNumbers(numbers);
        assertEquals("Sum of 1,2,3,4,5 should be 15", 15, result);
    }

    /**
     * Test adding numbers with negative values
     */
    @Test
    public void testAddNumbersWithNegatives() {
        int[] numbers = {10, -5, 8, -3};
        int result = AddMultipleNumbers.addNumbers(numbers);
        assertEquals("Sum of 10,-5,8,-3 should be 10", 10, result);
    }

    /**
     * Test adding single number
     */
    @Test
    public void testAddSingleNumber() {
        int[] numbers = {42};
        int result = AddMultipleNumbers.addNumbers(numbers);
        assertEquals("Sum of single number 42 should be 42", 42, result);
    }

    /**
     * Test adding zeros
     */
    @Test
    public void testAddZeros() {
        int[] numbers = {0, 0, 0};
        int result = AddMultipleNumbers.addNumbers(numbers);
        assertEquals("Sum of zeros should be 0", 0, result);
    }

    /**
     * Test adding empty array
     */
    @Test
    public void testAddEmptyArray() {
        int[] numbers = {};
        int result = AddMultipleNumbers.addNumbers(numbers);
        assertEquals("Sum of empty array should be 0", 0, result);
    }

    /**
     * Test adding large numbers
     */
    @Test
    public void testAddLargeNumbers() {
        int[] numbers = {1000000, 2000000, 3000000};
        int result = AddMultipleNumbers.addNumbers(numbers);
        assertEquals("Sum of large numbers", 6000000, result);
    }

    // ==================== Tests for addNumbersRecursive() method ====================

    /**
     * Test recursive addition with two numbers
     */
    @Test
    public void testRecursiveAddTwoNumbers() {
        int[] numbers = {5, 10};
        int result = AddMultipleNumbers.addNumbersRecursive(numbers, 0);
        assertEquals("Recursive sum of 5 and 10 should be 15", 15, result);
    }

    /**
     * Test recursive addition with multiple numbers
     */
    @Test
    public void testRecursiveAddMultipleNumbers() {
        int[] numbers = {2, 4, 6, 8};
        int result = AddMultipleNumbers.addNumbersRecursive(numbers, 0);
        assertEquals("Recursive sum of 2,4,6,8 should be 20", 20, result);
    }

    /**
     * Test recursive addition with negative numbers
     */
    @Test
    public void testRecursiveAddWithNegatives() {
        int[] numbers = {15, -5, 20, -10};
        int result = AddMultipleNumbers.addNumbersRecursive(numbers, 0);
        assertEquals("Recursive sum with negatives should be 20", 20, result);
    }

    /**
     * Test recursive addition with single number
     */
    @Test
    public void testRecursiveSingleNumber() {
        int[] numbers = {100};
        int result = AddMultipleNumbers.addNumbersRecursive(numbers, 0);
        assertEquals("Recursive sum of single number should be 100", 100, result);
    }

    /**
     * Test recursive addition with starting index
     */
    @Test
    public void testRecursiveWithStartingIndex() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = AddMultipleNumbers.addNumbersRecursive(numbers, 2);
        assertEquals("Recursive sum from index 2 should be 3+4+5=12", 12, result);
    }

    // ==================== Tests for addNumbersVarargs() method ====================

    /**
     * Test varargs with two numbers
     */
    @Test
    public void testVarargsAddTwoNumbers() {
        int result = AddMultipleNumbers.addNumbersVarargs(5, 10);
        assertEquals("Varargs sum of 5 and 10 should be 15", 15, result);
    }

    /**
     * Test varargs with multiple numbers
     */
    @Test
    public void testVarargsAddMultipleNumbers() {
        int result = AddMultipleNumbers.addNumbersVarargs(10, 20, 30, 40, 50);
        assertEquals("Varargs sum should be 150", 150, result);
    }

    /**
     * Test varargs with single number
     */
    @Test
    public void testVarargsSingleNumber() {
        int result = AddMultipleNumbers.addNumbersVarargs(99);
        assertEquals("Varargs sum of single number should be 99", 99, result);
    }

    /**
     * Test varargs with no arguments
     */
    @Test
    public void testVarargsNoArguments() {
        int result = AddMultipleNumbers.addNumbersVarargs();
        assertEquals("Varargs sum with no arguments should be 0", 0, result);
    }

    /**
     * Test varargs with negative numbers
     */
    @Test
    public void testVarargsWithNegatives() {
        int result = AddMultipleNumbers.addNumbersVarargs(50, -20, 30, -10);
        assertEquals("Varargs sum with negatives should be 50", 50, result);
    }

    /**
     * Test varargs with array conversion
     */
    @Test
    public void testVarargsWithArrayConversion() {
        int[] numbers = {7, 8, 9};
        int result = AddMultipleNumbers.addNumbersVarargs(numbers);
        assertEquals("Varargs sum with array should be 24", 24, result);
    }

    // ==================== Comparison Tests ====================

    /**
     * Verify all three methods return the same result
     */
    @Test
    public void testAllMethodsReturnSameResult() {
        int[] numbers = {10, 20, 30, 40};
        int result1 = AddMultipleNumbers.addNumbers(numbers);
        int result2 = AddMultipleNumbers.addNumbersRecursive(numbers, 0);
        int result3 = AddMultipleNumbers.addNumbersVarargs(10, 20, 30, 40);

        assertEquals("All methods should return same result", result1, result2);
        assertEquals("All methods should return same result", result2, result3);
        assertEquals("Expected sum is 100", 100, result1);
    }

    // ==================== Edge Cases ====================

    /**
     * Test with very large array
     */
    @Test
    public void testLargeArraySize() {
        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbers[i] = 1;
        }
        int result = AddMultipleNumbers.addNumbers(numbers);
        assertEquals("Sum of 1000 ones should be 1000", 1000, result);
    }

    /**
     * Test with mix of positive, negative, and zero
     */
    @Test
    public void testMixedValues() {
        int[] numbers = {100, -50, 0, 75, -25};
        int result = AddMultipleNumbers.addNumbers(numbers);
        assertEquals("Mixed values sum should be 100", 100, result);
    }

    /**
     * Test boundary value - minimum integer
     */
    @Test
    public void testWithSmallNumbers() {
        int[] numbers = {-100, -200, -300};
        int result = AddMultipleNumbers.addNumbers(numbers);
        assertEquals("Sum of negative numbers should be -600", -600, result);
    }
}
