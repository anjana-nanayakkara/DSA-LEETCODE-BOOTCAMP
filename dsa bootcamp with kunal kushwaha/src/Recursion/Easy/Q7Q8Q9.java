package Recursion.Easy;

public class Q7Q8Q9 {
    public static void main(String[] args) {
        int num = 12321;
        reverse(num);
        System.out.println(sum);
        int rev = rev2(num);
        System.out.println(rev);


        if(rev ==num){
            System.out.println(num+" is a palindrome");
        }

        int count = countZeros(num);

        System.out.println("zeros = "+count);
    }

    private static int countZeros(int num) {
        int count = 0;
         return helper2(num, count);
    }

    private static int helper2(int num, int count) {
        {
            if(num==0){
                return count;
            }

            if(num%10==0){
                return helper2(num/10,count+1);
            }else{return helper2(num/10,count);}
        }
    }

    static int sum = 0;
    private static void reverse(int num) {
        if(num == 0){
            return;
        }

        int lastDigit = num%10;
        int rem = num/10;
        sum = sum*10 + lastDigit;
        reverse(num/10);
    }

    private static int rev2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n<10){
            return n;
        }

        int rem = n%10;
        return rem * (int)(Math.pow(10,digits - 1)) + helper(n/10,digits-1);
    }
}
