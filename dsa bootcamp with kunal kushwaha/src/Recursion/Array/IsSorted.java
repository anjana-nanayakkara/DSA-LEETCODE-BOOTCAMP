package Recursion.Array;

public class IsSorted {

    public static void main(String[] args) {
        int[] arr = {2,2,3,6,7};

        if(isSorted(arr,0)){
            System.out.println("array is sorted");
        }else {
            System.out.println("array is not sorted");
        }


    }



    private static boolean isSorted(int[] arr, int index) {

        if(index == arr.length-1){
            return true;
        }

        return arr[index]<=arr[index+1] && isSorted(arr, index+1);


    }
}
