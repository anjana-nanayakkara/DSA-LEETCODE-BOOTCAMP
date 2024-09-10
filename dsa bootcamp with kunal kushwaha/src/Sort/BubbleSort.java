package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,6,4,3,1};

        int[] resulrt = bubbleSort(arr);

        System.out.println(Arrays.toString(resulrt));
    }

    private static int[] bubbleSort(int[] arr) {

        int length = arr.length;

        for(int i = 0; i<length - 1;i++){
            for(int j = 0; j<length - 1 - i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }return arr;
    }
}
