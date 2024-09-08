package CycalicSort;

import java.util.Arrays;

public class Leetcode268 {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4};

        int[] sortedArr = cycleSort(arr);

        int missed = findMiss(sortedArr);
        System.out.println(missed);
    }

    private static int findMiss(int[] sortedArr) {
        int i = 0;
        for (i=0;i<sortedArr.length;i++) {
            if(sortedArr[i] != i){
                return i;
            }
        }
        return (sortedArr.length);
    }

    private static int[] cycleSort(int[] arr) {
        int currentIndex = 0;

        while(currentIndex < arr.length){
            int correctIndex = arr[currentIndex];

            if(arr[currentIndex] == arr.length){
                currentIndex++;
                continue;
            }

            if(arr[currentIndex] != arr[correctIndex]){
                swap(arr,currentIndex,correctIndex);
            }else{
                currentIndex++;
            }
        }return arr;
    }

    private static void swap(int[] arr, int currentIndex, int correctIndex) {
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }


}
