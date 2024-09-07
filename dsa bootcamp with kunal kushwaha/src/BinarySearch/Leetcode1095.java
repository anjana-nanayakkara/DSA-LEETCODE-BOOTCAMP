package BinarySearch;

public class Leetcode1095 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,4,3,2,1};
        
        int target = 3;

        int result = findInMountainArray(target,arr);

        System.out.println(result);

    }

    public static int findInMountainArray(int target, int[] arr) {

        int peak = findPeak(arr);

        int valAtAcePart = orderIgnosticBinarySearch(arr,target,peak,true);

        if (valAtAcePart != -1){
            return  valAtAcePart;
        }
        int valAtDcePart = orderIgnosticBinarySearch(arr,target,peak,false);
        return valAtDcePart;
    }

    private static int orderIgnosticBinarySearch(int[] arr, int target, int peak, boolean isAse ) {
        int start,end;

        if(isAse){
            start = 0;
            end = peak;
        }else{
            start = peak;
            end = arr.length-1;
        }

        while(start<=end){
            int middle = start + (end-start)/2;

            if(arr[middle]<target){
                if(isAse){
                    start = middle+1;
                }else{
                    end = middle -1;
                }
            } else if (arr[middle]>target) {
                if(isAse){
                    end = middle-1;
                }else{
                    start = middle + 1;
                }
            }else{
                return middle;
            }
        } return -1;

    }

    private static int findPeak(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int middle = start + (end - start)/2;

            if (arr[middle] < arr[middle+1]) {
                start = middle+1;
            }else{
                end = middle;
            }
        }
        return start;

    }


}
