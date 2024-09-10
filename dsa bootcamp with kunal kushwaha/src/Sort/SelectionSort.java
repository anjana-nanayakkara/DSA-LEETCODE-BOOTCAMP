package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {

        int length = arr.length;

        for(int end =length -1; end>0; end--){

            int maxIndex = fidmax(arr,0,end);

            int temp = arr[end];
            arr[end] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    private static int fidmax(int[] arr, int start, int end) {

        int max = start;
        for(int i = start; i<=end; i++ ){

            if (arr[i] > arr[max]) {
                max = i;
            }

        }

        return max;

    }
}
