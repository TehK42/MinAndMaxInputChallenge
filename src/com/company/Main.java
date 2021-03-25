package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number:");
            boolean valid = scan.hasNextInt();
            if (valid) {
                int number = scan.nextInt();

//                if(flag) {
//                    flag = false;
//                    min = number;
//                    max = number;
//                }

                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scan.nextLine();

        }
        System.out.println("Minimum = " + min + " and Maximum = " + max);
        scan.close();
    }
}
