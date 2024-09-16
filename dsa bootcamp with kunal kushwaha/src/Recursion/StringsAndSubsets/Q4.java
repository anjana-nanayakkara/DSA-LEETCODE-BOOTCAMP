package Recursion.StringsAndSubsets;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        subseq(p,up);

        ArrayList<String> result = subseqWithArr(p,up);
        System.out.println(result);
    }

    private static void subseq(String p, String up) {

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));

    }
    private static ArrayList<String> subseqWithArr(String p, String up) {

        ArrayList<String> result = new ArrayList<>();

        if(up.isEmpty()){


            result.add(p);
            return result;
        }

        char ch = up.charAt(0);
        ArrayList<String> beforeResultleft = subseqWithArr(p+ch,up.substring(1));
        ArrayList<String> beforeResultRight = subseqWithArr(p,up.substring(1));

        beforeResultleft.addAll(beforeResultRight);
        return beforeResultleft;

    }
}
