package BinarySearch;

public class CeilingAndFloor {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = {1, 2, 3, 5, 6, 7};

        // Define the target value to search for (which doesn't exist in the array)
        int target = 4;

        // Call the ceiling function and store the result
        int ceiling = ceiling(arr, target);

        // Call the floor function and store the result
        int floor = floor(arr, target);

        // Print the ceiling and floor values
        System.out.println("ceiling = " + ceiling + " floor = " + floor);
    }

    // Function to find the ceiling of a target in the array
// Ceiling: Smallest element greater than or equal to the target
    private static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // If the target is greater than the largest element, no ceiling exists
        if (target > arr[arr.length - 1]) {
            return -1; // Return -1 when no ceiling is found
        }

        // Perform binary search to find the ceiling
        while (start <= end) {
            int middle = start + (end - start) / 2;

            // If the target is smaller than the middle element, search the left half
            if (target < arr[middle]) {
                end = middle - 1;

                // If the target is larger than the middle element, search the right half
            } else if (target > arr[middle]) {
                start = middle + 1;

                // If the target is equal to the middle element, return the middle index
            } else {
                return middle;
            }
        }

        // Return the index of the next greater element (start points to it after the loop)
        return start;
    }

    // Function to find the floor of a target in the array
// Floor: Largest element smaller than or equal to the target
    private static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Perform binary search to find the floor
        while (start <= end) {
            int middle = start + (end - start) / 2;

            // If the target is smaller than the middle element, search the left half
            if (target < arr[middle]) {
                end = middle - 1;

                // If the target is larger than the middle element, search the right half
            } else if (target > arr[middle]) {
                start = middle + 1;

                // If the target is equal to the middle element, return the middle index
            } else {
                return middle;
            }
        }

        // Return the index of the largest element smaller than the target (end points to it after the loop)
        return end;
    }
}
