package BinarySearch;

public class RotetadArraySearch {

    public static void main(String[] args) {
        int[] arr = {8,9,10,11,1,2,3,4,5,6,7};

        int pivotIndex = findPivot(arr);

        System.out.println(pivotIndex);

        int target = 7;

        int targetIndex = searchInRotetedArray(arr,target,pivotIndex);

        System.out.println(targetIndex);
    }

    private static int searchInRotetedArray(int[] arr, int target, int pivotIndex) {

        if(arr[pivotIndex] == target){
            return pivotIndex;
        }

        if(target>=arr[0]){
            int start = 0;
            int end = pivotIndex-1;

            return binarySearch(arr,target,start,end);
        }


        int start = pivotIndex+1;
        int end = arr.length-1;
        return binarySearch(arr,target,start,end);


    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        while(start<=end){
            int middle = start + (end - start)/2;

            if(arr[middle]<target){
                start = middle+1;
            } else if (arr[middle]>target) {
                end = middle-1;
            }else{
                return middle;
            }
        }
        return -1;
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end-start)/2;

            if(middle<end && arr[middle]>arr[middle+1]){
                return middle;
            }

            if(middle>start && arr[middle]<arr[middle-1]){
                return middle-1;
            }

            if(arr[middle]<=arr[start]){
                end = middle-1;
            }else{
                start = middle +1;
            }

        } return -1;

    }
}
