package LinearSearch;


public class LinearSearchCode {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Initializing an array of integers
        int[] nums = {2, 4, 6, 3, 4, 1, 8, 4};
        // The target value we are looking for in the array
        int target = 4;


        // Calling the linearSearch method and storing the result
        int ans = linearSearch(nums, target);

        // Output the index of the target value or -1 if not found
        System.out.println(ans);
    }

    // Method to perform linear search in an array
    // Parameters: arr - the array to search in, target - the value to find
    // Returns: the index of the target if found, otherwise -1
    static int linearSearch(int[] arr, int target) {

        // If the array is empty, return -1 since no elements can be searched
        if (arr.length == 0) {
            return -1;
        }

        // Iterate through the array to find the target
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index]; // Get the element at the current index

            // If the current element matches the target, return the index
            if (element == target) {
                return index;
            }
        }

        // If the target is not found, return -1
        return -1;
    }


}
