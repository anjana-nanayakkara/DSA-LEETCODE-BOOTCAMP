package Recursion.Easy;

public class Q10 {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 8;
        int num3 = 123;
        System.out.println(steps(num1));
        System.out.println(steps(num2));
        System.out.println(steps(num3));

    }

    private static int steps(int num) {
        int count = 0;
        return helper(num,count);
    }

    private static int helper(int num, int count) {
        if(num==0){
            return count;
        }

        if(num%2 == 0){
            return helper(num/2,count+1);
        }else{
            return helper(num-1,count+1);
        }
    }
}
