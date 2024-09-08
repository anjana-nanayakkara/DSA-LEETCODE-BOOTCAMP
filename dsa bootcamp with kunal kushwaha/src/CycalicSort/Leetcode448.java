package CycalicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode448 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};

        List<Integer> solution = cycleSort(arr);

        System.out.println(solution);
    }

    private static List<Integer> cycleSort(int[] arr) {
        int index = 0;
        while(index< arr.length){
            int correctIndex = arr[index] - 1;

            if(arr[index] != arr[correctIndex]){
                swap(arr,index,correctIndex);
            }else{
                index++;
            }
        }

        List<Integer> solution = new ArrayList<>();

        for (int i = 0;i< arr.length;i++){
            if(i != (arr[i]-1)){
                solution.add((i+1));
            }
        }

        return solution;
    }

    private static void swap(int[] arr, int currentIndex, int correctIndex) {
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }


}
