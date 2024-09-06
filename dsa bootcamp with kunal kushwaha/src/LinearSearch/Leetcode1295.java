package LinearSearch;

public class Leetcode1295 {
    public static void main(String[] args) {
        int[] arr = {1,23,456,4545};
        int countOfEven = findNumbers(arr);

        System.out.println(countOfEven);

    }

    private static int findNumbers(int[] arr) {

        int evenDigitCount = 0;

        for(int val : arr){
            if(digitCount(val)){
                evenDigitCount++;
            };
        }
        return evenDigitCount;

    }

    private static boolean digitCount(int val) {
        int count=0;

        while(val>0){
            val=val/10;
            count++;
        }

        if(count%2 == 0){
            return true;
        }else{
            return false;
        }
    }



}
