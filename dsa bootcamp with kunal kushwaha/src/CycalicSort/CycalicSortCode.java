package CycalicSort;


import java.util.Arrays;

public class CycalicSortCode {

    public static void main(String[] args) {
        int[] arr = {2,4,3,1,5};

        int[] sortedArr = cycleSort(arr);

        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] cycleSort(int[] arr) {
        int i = 0;

        while (i< arr.length){

            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex] ){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        return arr;

    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;

    }
}
