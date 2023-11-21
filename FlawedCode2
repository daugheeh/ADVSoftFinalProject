public class FlawedCode2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Sum: " + calculateSum(numbers));
        
        String name = null;
        int length = name.length();
        System.out.println("Name Length: " + length);
        
        double result = calculateAverage(10, 0);
        System.out.println("Average: " + result);
        
        int[] array = {1, 2, 3};
        int element = array[3];
        System.out.println("Element: " + element);
        
        String text = "This is a sample text";
        String substring = text.substring(5, 2);
        System.out.println("Substring: " + substring);
    }
    
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 1; i <= numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    
    public static double calculateAverage(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}

