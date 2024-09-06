package LinearSearch;

public class SearchInString {

    public static void main(String[] args) {
        String str = "anjana";
        char target2 = 'a';

        Boolean ans2 = linearSearchAtString(str, target2);
    }

    static boolean linearSearchAtString(String str, char target) {

        // If the array is empty, return -1 since no elements can be searched
        if (str.length() == 0) {
            return false;
        }

        // Iterate through the array to find the target
        for (char ch:str.toCharArray()) {
            if(ch == target){
                return true;
            }
        }

        // If the target is not found, return -1
        return false;
    }
}
