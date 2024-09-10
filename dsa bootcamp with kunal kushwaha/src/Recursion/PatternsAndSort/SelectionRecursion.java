package Recursion.PatternsAndSort;

import java.util.Arrays;

public class SelectionRecursion {

    public static void main(String[] args) {
        int[] arr = {2,4,3,1,6,9};

        selectionSort(arr,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr,int end) {
        int start = 0;

        if(end == 0){
            return;
        }

        int maxIndex = fidmax(arr,0,end);

        int temp = arr[end];
        arr[end] = arr[maxIndex];
        arr[maxIndex] = temp;

        selectionSort(arr,end-1);


    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
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
