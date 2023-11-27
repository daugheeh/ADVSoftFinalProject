import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01501");
        int[] intArray5 = new int[] { ' ', (byte) 10, (byte) 0, 10, (byte) 10 };
        int int6 = FlawedCode3.calculateProduct(intArray5);
        int int7 = FlawedCode3.calculateProduct(intArray5);
        int int8 = FlawedCode3.calculateProduct(intArray5);
        int int9 = FlawedCode3.calculateProduct(intArray5);
        int int10 = FlawedCode3.calculateProduct(intArray5);
        int int11 = FlawedCode3.calculateProduct(intArray5);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray5);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01502");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01503");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01504");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01505");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01506");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double20 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01507");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01508");
        int[] intArray2 = new int[] { (byte) 1, '4' };
        int int3 = FlawedCode3.calculateProduct(intArray2);
        int int4 = FlawedCode3.calculateProduct(intArray2);
        int int5 = FlawedCode3.calculateProduct(intArray2);
        int int6 = FlawedCode3.calculateProduct(intArray2);
        int int7 = FlawedCode3.calculateProduct(intArray2);
        int int8 = FlawedCode3.calculateProduct(intArray2);
        int int9 = FlawedCode3.calculateProduct(intArray2);
        int int10 = FlawedCode3.calculateProduct(intArray2);
        int int11 = FlawedCode3.calculateProduct(intArray2);
        int int12 = FlawedCode3.calculateProduct(intArray2);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode2.calculateSum(intArray2);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01509");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01510");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01511");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01512");
        int[] intArray1 = new int[] { (byte) 0 };
        int int2 = FlawedCode3.calculateProduct(intArray1);
        int int3 = FlawedCode3.calculateProduct(intArray1);
        int int4 = FlawedCode3.calculateProduct(intArray1);
        int int5 = FlawedCode3.calculateProduct(intArray1);
        int int6 = FlawedCode3.calculateProduct(intArray1);
        int int7 = FlawedCode3.calculateProduct(intArray1);
        int int8 = FlawedCode3.calculateProduct(intArray1);
        int int9 = FlawedCode3.calculateProduct(intArray1);
        int int10 = FlawedCode3.calculateProduct(intArray1);
        int int11 = FlawedCode3.calculateProduct(intArray1);
        int int12 = FlawedCode3.calculateProduct(intArray1);
        int int13 = FlawedCode3.calculateProduct(intArray1);
        int int14 = FlawedCode3.calculateProduct(intArray1);
        int int15 = FlawedCode3.calculateProduct(intArray1);
        int int16 = FlawedCode3.calculateProduct(intArray1);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray1);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01513");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double22 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01514");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01515");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01516");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, 1 };
        int int4 = FlawedCode3.calculateProduct(intArray3);
        int int5 = FlawedCode3.calculateProduct(intArray3);
        int int6 = FlawedCode3.calculateProduct(intArray3);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int7 = FlawedCode2.calculateSum(intArray3);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01517");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01518");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01519");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01520");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01521");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01522");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01523");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01524");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01525");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01526");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01527");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01528");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode3.calculateProduct(intArray0);
        int int22 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double23 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01529");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01530");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01531");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01532");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double10 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01533");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01534");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01535");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01536");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01537");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01538");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01539");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01540");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01541");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01542");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01543");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01544");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01545");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01546");
        int[] intArray4 = new int[] { '#', 'a', (short) 0, (byte) 1 };
        int int5 = FlawedCode3.calculateProduct(intArray4);
        int int6 = FlawedCode3.calculateProduct(intArray4);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int7 = FlawedCode2.calculateSum(intArray4);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01547");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01548");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double9 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01549");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01550");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01551");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01552");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01553");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01554");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01555");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01556");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01557");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01558");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01559");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01560");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01561");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01562");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01563");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01564");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01565");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01566");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        int int21 = FlawedCode2.calculateSum(intArray0);
        int int22 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double23 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01567");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01568");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01569");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01570");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01571");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01572");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01573");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01574");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01575");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01576");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01577");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01578");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01579");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01580");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01581");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01582");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, 1 };
        int int4 = FlawedCode3.calculateProduct(intArray3);
        int int5 = FlawedCode3.calculateProduct(intArray3);
        int int6 = FlawedCode3.calculateProduct(intArray3);
        int int7 = FlawedCode3.calculateProduct(intArray3);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray3);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01583");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double22 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01584");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01585");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01586");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double10 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01587");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01588");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01589");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01590");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01591");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01592");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01593");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double21 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01594");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01595");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double10 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01596");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01597");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01598");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01599");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01600");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01601");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01602");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01603");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01604");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01605");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01606");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double9 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01607");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01608");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        int int21 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int22 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01609");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01610");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01611");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01612");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01613");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int19 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01614");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01615");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01616");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int19 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01617");
        int[] intArray2 = new int[] { (byte) 1, '4' };
        int int3 = FlawedCode3.calculateProduct(intArray2);
        int int4 = FlawedCode3.calculateProduct(intArray2);
        int int5 = FlawedCode3.calculateProduct(intArray2);
        int int6 = FlawedCode3.calculateProduct(intArray2);
        int int7 = FlawedCode3.calculateProduct(intArray2);
        int int8 = FlawedCode3.calculateProduct(intArray2);
        int int9 = FlawedCode3.calculateProduct(intArray2);
        int int10 = FlawedCode3.calculateProduct(intArray2);
        int int11 = FlawedCode3.calculateProduct(intArray2);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray2);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01618");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01619");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01620");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01621");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int21 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01622");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01623");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01624");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01625");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01626");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01627");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01628");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01629");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01630");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01631");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01632");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01633");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01634");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        int int21 = FlawedCode2.calculateSum(intArray0);
        int int22 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int23 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01635");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01636");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01637");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01638");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01639");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01640");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        int int21 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double22 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01641");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01642");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01643");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01644");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01645");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01646");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01647");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01648");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01649");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01650");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01651");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01652");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01653");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01654");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01655");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int19 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01656");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01657");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01658");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01659");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01660");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01661");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double7 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01662");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01663");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01664");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int19 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01665");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double10 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01666");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01667");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01668");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01669");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int7 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01670");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01671");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01672");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01673");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01674");
        int[] intArray5 = new int[] { ' ', (byte) 10, (byte) 0, 10, (byte) 10 };
        int int6 = FlawedCode3.calculateProduct(intArray5);
        int int7 = FlawedCode3.calculateProduct(intArray5);
        int int8 = FlawedCode3.calculateProduct(intArray5);
        int int9 = FlawedCode3.calculateProduct(intArray5);
        int int10 = FlawedCode3.calculateProduct(intArray5);
        int int11 = FlawedCode3.calculateProduct(intArray5);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode2.calculateSum(intArray5);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01675");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01676");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01677");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double10 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01678");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01679");
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double2 = FlawedCode2.calculateAverage((int) 'a', (int) (short) 0);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01680");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01681");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01682");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01683");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01684");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01685");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01686");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01687");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01688");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01689");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01690");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01691");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01692");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01693");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01694");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01695");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01696");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01697");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01698");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double21 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01699");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01700");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01701");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01702");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01703");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01704");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01705");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01706");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01707");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01708");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01709");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01710");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01711");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01712");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01713");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01714");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01715");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01716");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int20 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01717");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01718");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double22 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01719");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01720");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01721");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01722");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double20 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01723");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01724");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01725");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01726");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode3.calculateProduct(intArray0);
        int int22 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int23 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01727");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01728");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01729");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01730");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01731");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01732");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01733");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01734");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double10 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01735");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double10 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01736");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double21 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01737");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01738");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01739");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01740");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01741");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double20 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01742");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01743");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01744");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01745");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01746");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01747");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01748");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01749");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01750");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01751");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01752");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01753");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01754");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01755");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01756");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int19 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01757");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01758");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01759");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01760");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01761");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01762");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01763");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double9 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01764");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01765");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01766");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01767");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01768");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01769");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01770");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01771");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double9 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01772");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01773");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int19 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01774");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01775");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01776");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01777");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01778");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01779");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01780");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01781");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01782");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01783");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01784");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int21 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01785");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01786");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01787");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01788");
        int[] intArray4 = new int[] { '#', 'a', (short) 0, (byte) 1 };
        int int5 = FlawedCode3.calculateProduct(intArray4);
        int int6 = FlawedCode3.calculateProduct(intArray4);
        int int7 = FlawedCode3.calculateProduct(intArray4);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode2.calculateSum(intArray4);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01789");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01790");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01791");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01792");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01793");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01794");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01795");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01796");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01797");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01798");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01799");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01800");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01801");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01802");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01803");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01804");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01805");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01806");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01807");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01808");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01809");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double9 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01810");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01811");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01812");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode3.calculateProduct(intArray0);
        int int22 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int23 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01813");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01814");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01815");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01816");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01817");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01818");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        int int21 = FlawedCode3.calculateProduct(intArray0);
        int int22 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double23 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01819");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01820");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01821");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01822");
        int[] intArray1 = new int[] { (byte) 0 };
        int int2 = FlawedCode3.calculateProduct(intArray1);
        int int3 = FlawedCode3.calculateProduct(intArray1);
        int int4 = FlawedCode3.calculateProduct(intArray1);
        int int5 = FlawedCode3.calculateProduct(intArray1);
        int int6 = FlawedCode3.calculateProduct(intArray1);
        int int7 = FlawedCode3.calculateProduct(intArray1);
        int int8 = FlawedCode3.calculateProduct(intArray1);
        int int9 = FlawedCode3.calculateProduct(intArray1);
        int int10 = FlawedCode3.calculateProduct(intArray1);
        int int11 = FlawedCode3.calculateProduct(intArray1);
        int int12 = FlawedCode3.calculateProduct(intArray1);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray1);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01823");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01824");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01825");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01826");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01827");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01828");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        int int3 = FlawedCode3.calculateProduct(intArray2);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int4 = FlawedCode2.calculateSum(intArray2);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01829");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01830");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01831");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01832");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01833");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01834");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01835");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double9 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01836");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01837");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01838");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01839");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01840");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01841");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01842");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01843");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01844");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, 1 };
        int int4 = FlawedCode3.calculateProduct(intArray3);
        int int5 = FlawedCode3.calculateProduct(intArray3);
        int int6 = FlawedCode3.calculateProduct(intArray3);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double7 = FlawedCode4.calculateAverage(intArray3);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01845");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01846");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01847");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01848");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01849");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01850");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01851");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01852");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01853");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01854");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01855");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int19 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01856");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01857");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01858");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01859");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01860");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double9 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01861");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01862");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01863");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01864");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01865");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01866");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double10 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01867");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01868");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01869");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01870");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01871");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01872");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01873");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01874");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double10 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01875");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01876");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01877");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int19 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01878");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01879");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode3.calculateProduct(intArray0);
        int int22 = FlawedCode3.calculateProduct(intArray0);
        int int23 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double24 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01880");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01881");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01882");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01883");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01884");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01885");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01886");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01887");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01888");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01889");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        int int21 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int22 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01890");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01891");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int20 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01892");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01893");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01894");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01895");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01896");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01897");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01898");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode2.calculateSum(intArray0);
        int int22 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int23 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01899");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01900");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01901");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01902");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01903");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01904");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01905");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01906");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double20 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01907");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        int int21 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int22 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01908");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01909");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01910");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01911");
        int[] intArray1 = new int[] { (byte) 0 };
        int int2 = FlawedCode3.calculateProduct(intArray1);
        int int3 = FlawedCode3.calculateProduct(intArray1);
        int int4 = FlawedCode3.calculateProduct(intArray1);
        int int5 = FlawedCode3.calculateProduct(intArray1);
        int int6 = FlawedCode3.calculateProduct(intArray1);
        int int7 = FlawedCode3.calculateProduct(intArray1);
        int int8 = FlawedCode3.calculateProduct(intArray1);
        int int9 = FlawedCode3.calculateProduct(intArray1);
        int int10 = FlawedCode3.calculateProduct(intArray1);
        int int11 = FlawedCode3.calculateProduct(intArray1);
        int int12 = FlawedCode3.calculateProduct(intArray1);
        int int13 = FlawedCode3.calculateProduct(intArray1);
        int int14 = FlawedCode3.calculateProduct(intArray1);
        int int15 = FlawedCode3.calculateProduct(intArray1);
        int int16 = FlawedCode3.calculateProduct(intArray1);
        int int17 = FlawedCode3.calculateProduct(intArray1);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode2.calculateSum(intArray1);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01912");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01913");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double11 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01914");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01915");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01916");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01917");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01918");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01919");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01920");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01921");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01922");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01923");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01924");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int21 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01925");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01926");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01927");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode3.calculateProduct(intArray0);
        int int22 = FlawedCode3.calculateProduct(intArray0);
        int int23 = FlawedCode2.calculateSum(intArray0);
        int int24 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int25 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01928");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01929");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01930");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01931");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01932");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01933");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01934");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01935");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01936");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01937");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01938");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01939");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double21 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01940");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01941");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01942");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01943");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01944");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01945");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01946");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01947");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01948");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01949");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01950");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01951");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01952");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01953");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01954");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double18 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01955");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01956");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01957");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01958");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01959");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double14 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01960");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01961");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01962");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01963");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int13 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01964");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01965");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int19 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01966");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01967");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int9 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01968");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double13 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01969");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode2.calculateSum(intArray0);
        int int22 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double23 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01970");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01971");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double17 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01972");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int19 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01973");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode2.calculateSum(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double21 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01974");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01975");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int12 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01976");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01977");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01978");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01979");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode2.calculateSum(intArray0);
        int int22 = FlawedCode2.calculateSum(intArray0);
        int int23 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int24 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01980");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01981");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int18 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01982");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int16 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01983");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        int int17 = FlawedCode2.calculateSum(intArray0);
        int int18 = FlawedCode2.calculateSum(intArray0);
        int int19 = FlawedCode3.calculateProduct(intArray0);
        int int20 = FlawedCode2.calculateSum(intArray0);
        int int21 = FlawedCode2.calculateSum(intArray0);
        int int22 = FlawedCode2.calculateSum(intArray0);
        int int23 = FlawedCode2.calculateSum(intArray0);
        int int24 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int25 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01984");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01985");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01986");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        int int16 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01987");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01988");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double8 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01989");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int11 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01990");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int17 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01991");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int8 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01992");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        int int15 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double16 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01993");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double12 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01994");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode2.calculateSum(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        int int15 = FlawedCode3.calculateProduct(intArray0);
        int int16 = FlawedCode3.calculateProduct(intArray0);
        int int17 = FlawedCode3.calculateProduct(intArray0);
        int int18 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double19 = FlawedCode4.calculateAverage(intArray0);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01995");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode2.calculateSum(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int10 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01996");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01997");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode2.calculateSum(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode2.calculateSum(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode2.calculateSum(intArray0);
        int int14 = FlawedCode2.calculateSum(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int15 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01998");
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double2 = FlawedCode2.calculateAverage((int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test01999");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode3.calculateProduct(intArray0);
        int int5 = FlawedCode2.calculateSum(intArray0);
        int int6 = FlawedCode2.calculateSum(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode3.calculateProduct(intArray0);
        int int9 = FlawedCode3.calculateProduct(intArray0);
        int int10 = FlawedCode2.calculateSum(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode2.calculateSum(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        int int14 = FlawedCode5.findMaximum(intArray0);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test02000");
        int[] intArray0 = new int[] {};
        int int1 = FlawedCode2.calculateSum(intArray0);
        int int2 = FlawedCode3.calculateProduct(intArray0);
        int int3 = FlawedCode3.calculateProduct(intArray0);
        int int4 = FlawedCode2.calculateSum(intArray0);
        int int5 = FlawedCode3.calculateProduct(intArray0);
        int int6 = FlawedCode3.calculateProduct(intArray0);
        int int7 = FlawedCode3.calculateProduct(intArray0);
        int int8 = FlawedCode2.calculateSum(intArray0);
        int int9 = FlawedCode2.calculateSum(intArray0);
        int int10 = FlawedCode3.calculateProduct(intArray0);
        int int11 = FlawedCode3.calculateProduct(intArray0);
        int int12 = FlawedCode3.calculateProduct(intArray0);
        int int13 = FlawedCode3.calculateProduct(intArray0);
        int int14 = FlawedCode3.calculateProduct(intArray0);
        // during test generation this statement threw an exception of type java.lang.ArrayIndexOutOfBoundsException in error
        double double15 = FlawedCode4.calculateAverage(intArray0);
    }
}

