import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlawedCodeTests {

    // Test for FlawedCode1
    @Test
    public void testFlawedCode1() {
        // Attempting to divide by zero, should throw ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            FlawedCode1.main(new String[]{});
        });

        // Accessing an out-of-bounds array index, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode1.main(new String[]{});
        });

        // Attempting to access the length of a null string, should throw NullPointerException
        assertThrows(NullPointerException.class, () -> {
            FlawedCode1.main(new String[]{});
        });

        // Accessing an out-of-bounds array index, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode1.main(new String[]{});
        });
    }

    // Test for FlawedCode2
    @Test
    public void testFlawedCode2() {
        // Accessing an out-of-bounds array index in calculateSum method, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode2.calculateSum(new int[]{1, 2, 3, 4, 5});
        });

        // Attempting to calculate average with a divisor of zero, should throw ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            FlawedCode2.calculateAverage(10, 0);
        });

        // Accessing an out-of-bounds array index in main method, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode2.main(new String[]{});
        });

        // Attempting to create a substring with invalid indices, should throw StringIndexOutOfBoundsException
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            FlawedCode2.main(new String[]{});
        });
    }

    // Test for FlawedCode3
    @Test
    public void testFlawedCode3() {
        // Accessing an out-of-bounds array index in calculateProduct method, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode3.calculateProduct(new int[]{1, 2, 3, 4, 5});
        });

        // Attempting to access the length of a null array, should throw NullPointerException
        assertThrows(NullPointerException.class, () -> {
            FlawedCode3.main(new String[]{});
        });

        // Attempting to divide by zero, should throw ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            FlawedCode3.main(new String[]{});
        });

        // Accessing an out-of-bounds array index, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode3.main(new String[]{});
        });

        // Accessing an out-of-bounds array index, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode3.main(new String[]{});
        });
    }

    // Test for FlawedCode4
    @Test
    public void testFlawedCode4() {
        // Accessing an out-of-bounds array index in calculateAverage method, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode4.calculateAverage(new int[]{1, 2, 3, 4, 5});
        });

        // Accessing an out-of-bounds array index in main method, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode4.main(new String[]{});
        });

        // Attempting to access the last character of an empty string, should throw StringIndexOutOfBoundsException
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            FlawedCode4.main(new String[]{});
        });

        // Accessing an out-of-bounds array index, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode4.main(new String[]{});
        });

        // Attempting to divide an integer by zero, should throw ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            FlawedCode4.main(new String[]{});
        });
    }

    // Test for FlawedCode5
    @Test
    public void testFlawedCode5() {
        // Accessing an out-of-bounds array index in findMaximum method, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode5.findMaximum(new int[]{1, 2, 3, 4, 5});
        });

        // Accessing an out-of-bounds array index in main method, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode5.main(new String[]{});
        });

        // Attempting to access an out-of-bounds array index, should throw ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode5.main(new String[]{});
        });

        // Attempting to calculate the remainder of division by zero, should throw ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            FlawedCode5.main(new String[]{});
        });
    }
}
