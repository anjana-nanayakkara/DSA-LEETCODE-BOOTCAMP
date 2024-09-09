package Recursion.Easy;

public class Q3andQ4 {

    public static void main(String[] args) {
        System.out.println("factorial "+fact(5));
        System.out.println("sum "+sum(5));
    }

    private static int sum(int n) {
        if (n>0){
            if(n==1){
                return n;
            }

            return (n + sum(n-1));
        }
        return 0;
    }

    private static int fact(int n) {
        if (n>0){
            if(n==1){
                return n;
            }

            return (n * fact(n-1));
        }
        return 0;
    }


}
