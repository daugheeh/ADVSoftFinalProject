public class FlawedCode5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Maximum: " + findMaximum(numbers));
        
        String text = "Hello, World";
        int indexOfComma = text.indexOf(",");
        System.out.println("Index of Comma: " + indexOfComma);
        
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[3] = "Charlie";
        
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        
        int x = 10;
        int y = 0;
        int result = x % y;
        System.out.println("Result: " + result);
        
        double pi = Math.PI;
        System.out.println("Pi: " + pi);
    }
    
    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i <= numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}

