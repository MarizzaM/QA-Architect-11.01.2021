package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int[] arr = {1, 2, 3};
        print_arr(arr);
        zero_array(arr);
        System.out.println();
        print_arr(arr);
        myCompare("str", "str");

    }

    private static void zero_array(int[] arr){
        for (int i = 0; i < arr.length; i++ ){
            arr[i] = 0;
        }
    }

    private static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
    }

    private static void myCompare(String s1, String s2){
        if (s1.equals(s2)){
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }

}
