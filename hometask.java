package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("===Task #1===");
        printBiggest();
        printBiggest(2);
        printBiggest(2, 5);
        printBiggest(6, 2, 3);

        System.out.println("===Task #2===");
        inputFromUser(s, 2);

        System.out.println("===Task #3===");
        createRandom(r, 10, 20);

        System.out.println("===Task #4===");
        double[] arr = { 0.5, 0.7, 5, -2, 12.5 };
        printInRange(arr, -4, 0.5);

        System.out.println("\n===Task #4**===");
        printInRangeEtgar(arr, -4, 0.5);
    }

    private static void printBiggest() {
        System.out.println("I am the biggest of them all!");
    }

    private static void printBiggest(int a) {
        System.out.println(a + "is biggest");
    }

    private static void printBiggest(int a, int b) {
        if(a > b){
            System.out.println(a + "is biggest");
        } else if(a < b){
            System.out.println(b + "is biggest");
        } else {
            System.out.println("numbers are equal");
        }
    }

    private static void printBiggest( int a, int b, int c) {
        int max = Math.max(a, b);
        if (a != b && a != c && b != c){
            if (max > b){
                max = Math.max(a, c);
                System.out.println(max + "is biggest");
            } else {
                max = Math.max(b, c);
                System.out.println(max + "is biggest");
            }
        } else {
            System.out.println("numbers are same");
        }
    }

    private static void inputFromUser( Scanner s, float a){
        System.out.print("Please enter the number: ");
        a = s.nextFloat();
    }

    private static void createRandom(Random r, int min, int max){
        System.out.println((int)(Math.random() * (max - min + 1) + min));
    }

    private static void printInRange(double[] arr, double min, double max){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= min && arr[i] <= max){
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void printInRangeEtgar(double[] arr, double min, double max){
        int size = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= min && arr[i] <= max){
                size++;
            }
        }
        double []arr_new = new double [size];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= min && arr[i] <= max){
                arr_new[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr_new.length; i++){
            System.out.print(arr_new[i] + " ");
        }
    }
}
