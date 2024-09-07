package BinarySearch;



public class BinarySearchCode {

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Define the target value to search for
        int target = 2;

        // Call the binarySearch function and store the result
        int result = binarySearch(arr, target);

        // Print the result (index of the target or -1 if not found)
        System.out.println(result);
    }

    // Binary Search function to find the index of a target value
    private static int binarySearch(int[] arr, int target) {

        // Initialize start and end pointers
        int start = 0;
        int end = arr.length - 1;

        // Loop until the search space is valid
        while (start <= end) {
            // Calculate the middle index to avoid overflow
            int middle = start + (end - start) / 2;

            // If the middle element is less than the target, ignore the left half
            if (arr[middle] < target) {
                start = middle + 1;

                // If the middle element is greater than the target, ignore the right half
            } else if (arr[middle] > target) {
                end = middle - 1;

                // If the target is found, return the index
            } else {
                return middle;
            }
        }

        // If target is not found, return -1
        return -1;
    }
}
