package com.alevel.homework4;

import java.util.Scanner;

public class minOrMax {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, entered 10 any integer ");
        for (int i=0; i<10; i++) {
array[i] = scanner.nextInt();
        }
       /* for (int i=0; i<10; i++) {
            System.out.print("  " + array[i]);
        }*/
        String question;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Do you want to find maximum or minimum among this number?");
        question = scanner1.nextLine();
        switch(question){
            case "maximum":{
                int result = FindMax(array);
                System.out.println("Maximum among this numbers is " +result);
                break;
            }
            case "minimum": {
                int result = FindMin(array);
                System.out.println("Minimum among this numbers is " +result);
                break;
            }
        }


    }
    public static int FindMax(int[]numbers){
        int max = numbers[0];
        for (int i =1; i< 10;i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
            return max;
    }
        public static int FindMin(int[]numbers){
            int min = numbers[0];
            for (int i =1; i< 10;i++) {
                if (min > numbers[i]) {
                    min = numbers[i];
                }
            }
                return min;
            }
}
