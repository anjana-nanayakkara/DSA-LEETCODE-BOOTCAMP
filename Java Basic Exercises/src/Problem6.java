//7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the value : ");
        int num = in.nextInt();

//        System.out.println(num + " * 1 = "+num*1);
//        System.out.println(num + " * 2 = "+num*2);
//        System.out.println(num + " * 3 = "+num*3);
//        System.out.println(num + " * 4 = "+num*4);
//        System.out.println(num + " * 5 = "+num*5);
//        System.out.println(num + " * 6 = "+num*6);
//        System.out.println(num + " * 7 = "+num*7);
//        System.out.println(num + " * 8 = "+num*8);
//        System.out.println(num + " * 9 = "+num*9);
//        System.out.println(num + " * 10 = "+num*10);

        for (int i=0 ; i<=10 ;i++){
            System.out.println(num + " * " + i + " = "+num*i);
        }




    }
}
