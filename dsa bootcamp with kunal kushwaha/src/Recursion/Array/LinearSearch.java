package Recursion.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {2,2,4,6,7};

        int target = 6;

        int resultIndex = linearSearch(arr, target, 0);
        System.out.println(resultIndex);

        int target2 = 2;
        linearSearchMultipleAnswers(arr, target2, 0);
        System.out.println(answers);

        int target3 = 2;
        ArrayList<Integer> linearSearchMultipleAnswersWithArrlistInside = new ArrayList<>();
        linearSearchMultipleAnswersWithArrlistInside(arr, target2, 0, linearSearchMultipleAnswersWithArrlistInside);
        System.out.println(linearSearchMultipleAnswersWithArrlistInside);

        ArrayList<Integer> answersForListInside = new ArrayList<>();
        answersForListInside = searchWithArraylistInsideTheBody(arr, target3,0);
        System.out.println(answersForListInside);

    }

    private static int linearSearch(int[] arr, int target, int index) {

        if(index == arr.length-1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return linearSearch(arr, target, index+1);
        }

    }

    static List<Integer> answers = new ArrayList<>();
    private static void linearSearchMultipleAnswers(int[] arr, int target, int index) {

        if(index == arr.length-1){
            return ;
        }

        if(arr[index] == target){
            answers.add(index);
        }

        linearSearchMultipleAnswers(arr, target, index+1);


    }

    private static List<Integer> linearSearchMultipleAnswersWithArrlistInside(int[] arr, int target, int index, ArrayList<Integer> answers) {

        if(index == arr.length-1){
            return answers;
        }

        if(arr[index] == target){
            answers.add(index);
        }

        return linearSearchMultipleAnswersWithArrlistInside(arr, target, index+1,answers);



    }

    private static ArrayList<Integer> searchWithArraylistInsideTheBody(int[] arr, int target, int index) {

        ArrayList<Integer> answers = new ArrayList<>();

        if(index == arr.length){
            return answers;
        }

        if(arr[index] == target){
            answers.add(index);
        }

        ArrayList<Integer> beforeAnswers = searchWithArraylistInsideTheBody(arr, target, index+1);

        answers.addAll(beforeAnswers);

        return answers;
}}
