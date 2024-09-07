package BinarySearch;

public class Leetcode34 {
    public static void main(String[] args) {

        int[] nums = {1,2,2,2,2,3,4};

        int target = 2;

        int[] ans = searchRange(nums,target);

        System.out.println("range = " +ans[0]+" to "+ans[1]);

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    public static int search(int[] nums, int target, boolean startIndex){

        int boundry = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int middle = start + (end - start)/2;

            if(nums[middle]<target){
                start = middle +1;
            } else if (nums[middle]>target) {
                end = middle - 1;
            }else{
                //this could be an answer but we have to check if there any potenal answers are there
                boundry = middle;

                if(startIndex){
                    end = middle - 1;
                }else{
                    start = middle + 1;
                }
            }

        }

        return boundry;
    }
}
