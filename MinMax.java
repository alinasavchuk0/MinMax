import java.util.Arrays;
public class MinMaxExample {
    public static void main(String[] args){
        // Example array
        int[] numbers = {4, 7, 1, 9, 3, 12, 5};

        // Display array 
        System.out.println("Array: " + Arrays.toString(numbers));

        // Initialize min and max with the first element
        int min = numbers[0];
        int max = numbers[0];

        // loop through the array to find min and max 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]
            }
        if (numbers[i] > max) {
            max = numbers[i];
        }
      }
   // Display results 
   System.out.println("Minimum value: " + min);
   System.out.println("Maximum value: " + max);
    }
}