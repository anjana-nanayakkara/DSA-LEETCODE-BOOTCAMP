package BinarySearch;

public class Leetcode744 {
    public static void main(String[] args) {

        char[] arr = {'c','f','j'};
        char target = 'j';

        char result = nextGreatestLetter(arr,target);

        System.out.println(result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;

        int end = letters.length-1;

        while(start<=end){

            int middle = start+(end-start)/2;

            if(target<letters[middle]){
                end = middle-1;
            } else{
                start = middle+1;
            }

        }

        return letters[start % letters.length];

    }
}
