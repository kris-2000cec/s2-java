public class exception20 {
    public static void main(String[] args) {
        
        
        try {
            int result = 10 / 0;  // This will cause ArithmeticException (division by zero)
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: ArithmeticException - Cannot divide by zero!");
        }

        // (b)
        try {
            int[] arr = {1, 2, 3};  // Array with 3 elements
            System.out.println(arr[5]);  // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException - Index out of bounds!");
        }

       
        System.out.println("Program continues to run normally after handling exceptions.");
    }
}

