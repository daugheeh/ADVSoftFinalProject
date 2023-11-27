import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlawedCodeTests {

    // Test for FlawedCode1
    @Test
    public void testFlawedCode1() {
        assertThrows(ArithmeticException.class, () -> {
            FlawedCode1.main(null);
        });

        assertThrows(NullPointerException.class, () -> {
            FlawedCode1.main(null);
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode1.main(null);
        });
    }

    // Test for FlawedCode2
    @Test
    public void testFlawedCode2() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode2.main(null);
        });

        assertThrows(NullPointerException.class, () -> {
            FlawedCode2.calculateSum(new int[]{1, 2, 3, 4, 5});
        });

        assertThrows(ArithmeticException.class, () -> {
            FlawedCode2.calculateAverage(10, 0);
        });
    }

    // Test for FlawedCode3
    @Test
    public void testFlawedCode3() {
        assertThrows(NullPointerException.class, () -> {
            FlawedCode3.main(null);
        });

        assertThrows(ArithmeticException.class, () -> {
            FlawedCode3.main(null);
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode3.main(null);
        });
    }

    // Test for FlawedCode4
    @Test
    public void testFlawedCode4() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            FlawedCode4.main(null);
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode4.calculateAverage(new int[]{1, 2, 3, 4, 5});
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode4.main(null);
        });
    }

    // Test for FlawedCode5
    @Test
    public void testFlawedCode5() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode5.main(null);
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FlawedCode5.main(null);
        });

        assertThrows(ArithmeticException.class, () -> {
            FlawedCode5.main(null);
        });
    }
}
