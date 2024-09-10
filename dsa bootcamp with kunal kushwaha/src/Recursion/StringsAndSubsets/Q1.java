package Recursion.StringsAndSubsets;

public class Q1 {

    public static void main(String[] args) {
        String unProcessed = "abacaappleappdae";
        String unProcessed2 = "appapple";
        String processed = "";

//        skip_A(unProcessed,processed);
//
//        String processed2 = skip_A2(unProcessed);
//        System.out.println(processed2);
//
//        String processed3 = skip_apple(unProcessed);
//        System.out.println(processed3);

        String processed4 = skip_app_not_apple(unProcessed2);
        System.out.println(processed4);
    }

    private static void skip_A(String unProcessed, String processed) {

        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char firstChar = unProcessed.charAt(0);
        if(firstChar == 'a'){
            skip_A(unProcessed.substring(1),processed);
        }else{
            skip_A(unProcessed.substring(1),processed+firstChar);
        }
    }

    private static String skip_A2(String unProcessed) {

        if(unProcessed.isEmpty()){
            return "";
        }

        char firstChar = unProcessed.charAt(0);
        String processed = "";

        if(firstChar == 'a'){
            return "" + skip_A2(unProcessed.substring(1));
        }else{
            return firstChar + skip_A2(unProcessed.substring(1));
        }



    }

    private static String skip_apple(String unProcessed) {

        if(unProcessed.isEmpty()){
            return "";
        }

        if(unProcessed.startsWith("apple")){
            return skip_apple(unProcessed.substring(5));
        }else{
            return unProcessed.charAt(0) + skip_apple(unProcessed.substring(1));
        }



    }

    private static String skip_app_not_apple(String unProcessed) {

        if(unProcessed.isEmpty()){
            return "";
        }

        if(unProcessed.startsWith("app") && !unProcessed.startsWith("apple")){
            return skip_app_not_apple(unProcessed.substring(3));
        }else{
            return unProcessed.charAt(0) + skip_app_not_apple(unProcessed.substring(1));
        }



    }
}
