import org.junit.Test;

import static org.junit.Assert.*;

public class FlawedCodeTests6 {

    @Test
    public void testFlawedCode1() {
        try {
            FlawedCode1.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            // Check for specific exceptions and their locations
            assertTrue(e instanceof ArithmeticException); // Division by zero
            assertTrue(e.getMessage().contains("/ by zero"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode1.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("num1 / num2"));
            assertTrue(e.getStackTrace()[0].toString().contains("System.console().readLine()"));
        }

        try {
            FlawedCode1.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException); // Null pointer exception
            assertTrue(e.getMessage().contains("null"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode1.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("str.length()"));
        }

        try {
            FlawedCode1.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArrayIndexOutOfBoundsException); // Array index out of bounds
            assertTrue(e.getMessage().contains("Index 5 out of bounds for length 5"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode1.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("arr[5]"));
        }
    }

    @Test
    public void testFlawedCode2() {
        try {
            FlawedCode2.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArrayIndexOutOfBoundsException); // Array index out of bounds
            assertTrue(e.getMessage().contains("Index 3 out of bounds for length 3"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode2.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("calculateSum"));
        }

        try {
            FlawedCode2.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException); // Null pointer exception
            assertTrue(e.getMessage().contains("null"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode2.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("name.length()"));
        }

        try {
            FlawedCode2.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArithmeticException); // Division by zero
            assertTrue(e.getMessage().contains("Division by zero"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode2.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("calculateAverage"));
        }

        try {
            FlawedCode2.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArrayIndexOutOfBoundsException); // Array index out of bounds
            assertTrue(e.getMessage().contains("Index 3 out of bounds for length 3"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode2.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("element"));
        }

        try {
            FlawedCode2.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof StringIndexOutOfBoundsException); // String index out of bounds
            assertTrue(e.getMessage().contains("String index out of range: -3"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode2.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("substring"));
        }
    }

    @Test
    public void testFlawedCode3() {
        try {
            FlawedCode3.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException); // Null pointer exception
            assertTrue(e.getMessage().contains("null"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode3.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("emptyArray.length"));
        }

        try {
            FlawedCode3.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArithmeticException); // Division by zero
            assertTrue(e.getMessage().contains("Division by zero"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode3.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("result"));
        }

        try {
            FlawedCode3.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArrayIndexOutOfBoundsException); // Array index out of bounds
            assertTrue(e.getMessage().contains("Index 3 out of bounds for length 3"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode3.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("names[i]"));
        }

        try {
            FlawedCode3.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof StringIndexOutOfBoundsException); // String index out of bounds
            assertTrue(e.getMessage().contains("String index out of range: 12"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode3.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("charAt"));
        }
    }

    @Test
    public void testFlawedCode4() {
        try {
            FlawedCode4.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArrayIndexOutOfBoundsException); // Array index out of bounds
            assertTrue(e.getMessage().contains("Index 0 out of bounds for length 0"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode4.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("calculateAverage"));
        }

        try {
            FlawedCode4.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof StringIndexOutOfBoundsException); // String index out of bounds
            assertTrue(e.getMessage().contains("String index out of range: 12"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode4.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("charAt"));
        }

        try {
            FlawedCode4.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArrayIndexOutOfBoundsException); // Array index out of bounds
            assertTrue(e.getMessage().contains("Index 0 out of bounds for length 0"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode4.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("firstElement"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode4.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("result"));
        }

        try {
            FlawedCode4.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArrayIndexOutOfBoundsException); // Array index out of bounds
            assertTrue(e.getMessage().contains("Index 3 out of bounds for length 3"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode4.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("names[i]"));
        }
    }

    @Test
    public void testFlawedCode5() {
        try {
            FlawedCode5.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArrayIndexOutOfBoundsException); // Array index out of bounds
            assertTrue(e.getMessage().contains("Index 3 out of bounds for length 3"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode5.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("findMaximum"));
        }

        try {
            FlawedCode5.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException); // Null pointer exception
            assertTrue(e.getMessage().contains("null"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode5.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("names[3]"));
        }

        try {
            FlawedCode5.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArithmeticException); // Division by zero
            assertTrue(e.getMessage().contains("Division by zero"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode5.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("result"));
        }

        try {
            FlawedCode5.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArrayIndexOutOfBoundsException); // Array index out of bounds
            assertTrue(e.getMessage().contains("Index 3 out of bounds for length 3"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode5.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("names[i]"));
        }

        try {
            FlawedCode5.main(null);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArithmeticException); // Arithmetic exception
            assertTrue(e.getMessage().contains("Divide by zero"));
            assertTrue(e.getStackTrace()[0].toString().contains("FlawedCode5.main"));
            assertTrue(e.getStackTrace()[0].toString().contains("result"));
        }
    }
}
