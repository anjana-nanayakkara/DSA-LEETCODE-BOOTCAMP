package Recursion.PatternsAndSort;

public class Star {
    public static void main(String[] args) {
//        trangel1(4,0);
        trangel2(4,0);
    }

    private static void trangel2(int r, int c) {
        if(r == 0){
            return;
        }

        if(c<r){
//            System.out.print("*");
            trangel2(r,c+1);
            System.out.print("*");
        }else{
//            System.out.println();
            trangel2(r-1,0);
            System.out.println();
        }
    }

    private static void sideTrangelUpside(int r,int c) {
        if(r == 0){
            return;
        }

        if(c<r){
            System.out.print("*");
            sideTrangelUpside(r,c+1);
        }else{
            System.out.println();
            sideTrangelUpside(r-1,0);
        }
    }
}
