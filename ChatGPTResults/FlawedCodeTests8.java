import org.junit.Test;
import static org.junit.Assert.*;

public class FlawedCodeTests8 {

    // Test for FlawedCode1
    @Test
    public void testFlawedCode1() {
        // Division by zero error
        try {
            FlawedCode1.main(null);
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("by zero"));
        }

        // ArrayIndexOutOfBoundsException when accessing arr[5]
        try {
            FlawedCode1.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 5 out of bounds for length 5"));
        }

        // NullPointerException when trying to get the length of a null string
        try {
            FlawedCode1.main(null);
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }

        // ArrayIndexOutOfBoundsException when accessing arr2[3]
        try {
            FlawedCode1.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 3 out of bounds for length 3"));
        }

        // ArithmeticException: Division by zero
        try {
            FlawedCode1.main(null);
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("by zero"));
        }
    }

    // Test for FlawedCode2
    @Test
    public void testFlawedCode2() {
        // ArrayIndexOutOfBoundsException when calculating the sum
        try {
            FlawedCode2.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 5 out of bounds for length 3"));
        }

        // NullPointerException when trying to get the length of a null string
        try {
            FlawedCode2.main(null);
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }

        // ArithmeticException: Division by zero when calculating the average
        try {
            FlawedCode2.main(null);
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("Division by zero"));
        }

        // ArrayIndexOutOfBoundsException when accessing array[3]
        try {
            FlawedCode2.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 3 out of bounds for length 3"));
        }

        // StringIndexOutOfBoundsException when getting a substring
        try {
            FlawedCode2.main(null);
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull(e.getMessage());
        }
    }

    // Test for FlawedCode3
    @Test
    public void testFlawedCode3() {
        // ArrayIndexOutOfBoundsException when calculating the product
        try {
            FlawedCode3.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 5 out of bounds for length 5"));
        }

        // NullPointerException when trying to get the length of a null array
        try {
            FlawedCode3.main(null);
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }

        // ArithmeticException: Division by zero when dividing by zero
        try {
            FlawedCode3.main(null);
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("by zero"));
        }

        // ArrayIndexOutOfBoundsException when iterating over names array
        try {
            FlawedCode3.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 3 out of bounds for length 3"));
        }

        // NullPointerException when accessing an element of a null array
        try {
            FlawedCode3.main(null);
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }

    // Test for FlawedCode4
    @Test
    public void testFlawedCode4() {
        // ArithmeticException: Division by zero when calculating the average
        try {
            FlawedCode4.main(null);
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("Division by zero"));
        }

        // StringIndexOutOfBoundsException when getting the last character
        try {
            FlawedCode4.main(null);
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull(e.getMessage());
        }

        // ArrayIndexOutOfBoundsException when accessing an empty array
        try {
            FlawedCode4.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 0 out of bounds for length 0"));
        }

        // ArithmeticException: Division by zero when dividing by zero
        try {
            FlawedCode4.main(null);
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("by zero"));
        }
    }

    // Test for FlawedCode5
    @Test
    public void testFlawedCode5() {
        // ArrayIndexOutOfBoundsException when finding the maximum
        try {
            FlawedCode5.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 5 out of bounds for length 5"));
        }

        // NullPointerException when accessing names[3]
        try {
            FlawedCode5.main(null);
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }

        // ArithmeticException: Division by zero when calculating the result
        try {
            FlawedCode5.main(null);
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("by zero"));
        }
    }
}
