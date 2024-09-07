package BinarySearch;

public class Leetcode852 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,3,2};

        int ans = search(arr);

        System.out.println(ans);
    }

    private static int search(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int middle =0;

        while(start<end){
            middle = start + (end - start)/2;

            if(arr[middle]>arr[middle+1]){
                end = middle;
            } else{
                start = middle+1;
            }

        } return arr[start];
    }
}
