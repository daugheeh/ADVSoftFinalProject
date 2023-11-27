import org.junit.Test;
import static org.junit.Assert.*;

public class FlawedCodeTests3 {
    
    @Test
    public void testFlawedCode1() {
        try {
            FlawedCode1.main(null);
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("by zero"));
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 5 out of bounds"));
        }
    }

    @Test
    public void testFlawedCode2() {
        try {
            FlawedCode2.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 3 out of bounds"));
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("Division by zero"));
        } catch (StringIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("String index out of range"));
        }
    }

    @Test
    public void testFlawedCode3() {
        try {
            FlawedCode3.main(null);
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 3 out of bounds"));
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("by zero"));
        } catch (NullPointerException e) {
            assertTrue(e.getMessage().contains("null"));
        }
    }

    @Test
    public void testFlawedCode4() {
        try {
            FlawedCode4.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 1 out of bounds"));
        } catch (NullPointerException e) {
            assertTrue(e.getMessage().contains("null"));
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("by zero"));
        }
    }

    @Test
    public void testFlawedCode5() {
        try {
            FlawedCode5.main(null);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index 3 out of bounds"));
        } catch (NullPointerException e) {
            assertTrue(e.getMessage().contains("null"));
        } catch (ArithmeticException e) {
            assertTrue(e.getMessage().contains("divide by zero"));
        }
    }
}
