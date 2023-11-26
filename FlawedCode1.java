public class FlawedCode1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        System.out.print("Enter a number: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.print("Enter another number: ");
        num2 = Integer.parseInt(System.console().readLine());

        int result = num1 / num2;

        System.out.println("Result: " + result);

        int[] arr = new int[5];
        arr[5] = 42;

        String str = null;
        System.out.println(str.length());

        int[] arr2 = {1, 2, 3};
        int sum = 0;
        for (int i = 0; i <= arr2.length; i++) {
            sum += arr2[i];
        }

        int x = 5;
        int y = 0;
        int z = x / y;
    }
}
