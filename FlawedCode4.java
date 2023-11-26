public class FlawedCode4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Average: " + calculateAverage(numbers));
        
        String text = "Hello, World";
        char lastChar = text.charAt(text.length());
        System.out.println("Last Character: " + lastChar);
        
        int[] emptyArray = new int[0];
        int firstElement = emptyArray[0];
        System.out.println("First Element: " + firstElement);
        
        double x = 10.0;
        int y = 3;
        double result = x / y;
        System.out.println("Result: " + result);
        
        String[] names = {"Alice", "Bob", "Charlie"};
        for (int i = 0; i < names.length(); i++) {
            System.out.println(names[i]);
        }
    }
    
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}
