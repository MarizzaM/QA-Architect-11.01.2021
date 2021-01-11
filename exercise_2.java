package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        print_a_pow_b_and_c_pow_d(2,8, 2,10);
        myCalc("*", 5, 2);
        myCalc(5, 2);

        int arr[] = new int[5];
        create_arr_random(r, arr);
        print_arr_random(arr);
    }

    private static void create_arr_random(Random r, int[] a) {
        for(int i = 0; i < a.length; i++){
            a[i] = r.nextInt(50);
        }
    }

    private static void print_arr_random(int[] a) {
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    private static void print_a_pow_b_and_c_pow_d(double a, double b, double c, double d) {
        System.out.println(String.format("%f ^ %f = %f", a, b, Math.pow(a ,b) ));
        System.out.println(String.format("%f ^ %f = %f", c, d, Math.pow(c ,d) ));
    }

    private static void myCalc(String s, int a, int b){
        switch (s){
            case ("+"):
                System.out.println(String.format("%d + %d = %d", a, b, a + b ));
                break;
            case ("-"):
                System.out.println(String.format("%d - %d = %d", a, b, a - b ));
                break;
            case ("*"):
                System.out.println(String.format("%d * %d = %d", a, b, a * b ));
                break;
            case ("div"):
                if (b != 0){
                    System.out.println(String.format("%d / %d = %f", a, b, (float)a / b ));
                } else {
                    System.out.println("Error! Division by zero");
                }
                break;
        }
    }

    private static void myCalc(int a, int b){
        String s = "+";
        switch (s){
            case ("+"):
                System.out.println(String.format("%d + %d = %d", a, b, a + b ));
                break;
            case ("-"):
                System.out.println(String.format("%d - %d = %d", a, b, a - b ));
                break;
            case ("*"):
                System.out.println(String.format("%d * %d = %d", a, b, a * b ));
                break;
            case ("div"):
                if (b != 0){
                    System.out.println(String.format("%d / %d = %f", a, b, (float)a / b ));
                } else {
                    System.out.println("Error! Division by zero");
                }
                break;
        }
    }
}
