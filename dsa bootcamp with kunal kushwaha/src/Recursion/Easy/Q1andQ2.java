package Recursion.Easy;

public class Q1andQ2 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
        printfrom0(n);

    }

    private static void printfrom0(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        printfrom0(n-1);
        System.out.println(n);
    }

    private static void print(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n-1);
    }


}
