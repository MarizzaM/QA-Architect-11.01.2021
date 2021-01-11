package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        print_from_1_to_max(5);

        System.out.print("\nPlease enter the number: ");
        int num1 = s.nextInt();
        System.out.print("\nPlease enter the number: ");
        int num2= s.nextInt();
        sum_2_numbers(num1, num2);
        minus_2_numbers(num1, num2);
        mul_2_numbers(num1, num2);
        div_2_numbers(num1, num2);

    }

    private static void div_2_numbers(int num1, int num2) {
        if(num2!=0){
            System.out.print(String.format("\nDiv: %f",  (float) num1/num2));
        } else {
            System.out.println("\nError");
        }
    }
    private static void mul_2_numbers(int num1, int num2) {
        System.out.print(String.format("\nMult: %d",  num1*num2));
    }

    private static void minus_2_numbers(int num1, int num2) {
        System.out.print(String.format("\nMinus: %d",  num1-num2));
    }

    private static void sum_2_numbers(int num1, int num2) {
        System.out.print(String.format("\nSum: %d",  num1+num2));
    }

    private static void print_from_1_to_max(int max) {
        for(int i = 1; i <= max; i++){
            System.out.print(i + " ");
        }
    }
    
}
