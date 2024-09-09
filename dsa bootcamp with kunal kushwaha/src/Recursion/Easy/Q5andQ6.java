package Recursion.Easy;

public class Q5andQ6 {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("sum of digits "+sumOfDigits(num) );
        System.out.println("product of digits "+productOfDigits(num) );
    }

    private static int productOfDigits(int num) {
        if(num==0){
            return 0;
        }

        int lastDigit = num%10;
        int sum = lastDigit * sumOfDigits(num/10);

        return sum;
    }

    private static int sumOfDigits(int num) {
        if(num==0){
            return 0;
        }

        int lastDigit = num%10;
        int sum = lastDigit + sumOfDigits(num/10);

        return sum;

    }
}
