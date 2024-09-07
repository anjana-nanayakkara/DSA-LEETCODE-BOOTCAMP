package BinarySearch;

public class FindOnInfiniteArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 11;

        int result = findValueWithReverseOfBS(arr,target);
        System.out.println(result);
    }

    private static int findValueWithReverseOfBS(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(arr[end]<target){
            int newStart = end+1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }

        int result = search(arr,target,start,end);
        return result;
    }

    private static int search(int[] arr, int target, int start, int end) {

        while(start<=end){
            int middle = start + (end-start)/2;

            if(arr[middle]<target){
                start= middle+1;
            } else if (arr[middle]>target) {
                end= middle-1;
            }else{
                return middle;
            }
        }return -1;
    }


}
