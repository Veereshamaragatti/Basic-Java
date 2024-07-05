public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Print the elements of the array
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Modify an element in the array
        numbers[2] = 10; // Change the element at index 2 to 10
        
        // Print the modified array
        System.out.println("Modified array:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
