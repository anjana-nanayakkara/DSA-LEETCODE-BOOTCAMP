package Recursion.Array;

public class RotetedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3};

        int target = 2;

        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

    private static int binarySearch(int[] arr, int target, int s, int e) {
        if(s>e){
            return -1;
        }

        int middle = s+(e-s)/2;

        if (arr[middle] == target){
            return middle;
        }

        if(arr[s]<= arr[middle]){
            if((arr[s]<target) && arr[middle]>=target){
                return binarySearch(arr,target,s,middle-1);
            }else{
                return binarySearch(arr,target,middle+1,e);
            }
        }

        if(target>=arr[middle] && target<=arr[e]){
            return binarySearch(arr,target,middle+1,e);
        }

        return binarySearch(arr,target,s,middle-1);

    }

}
