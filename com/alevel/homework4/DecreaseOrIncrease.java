package com.alevel.homework4;

import java.util.Scanner;

public class DecreaseOrIncrease {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] result = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, entered 10 any integer ");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        String question;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Do you want to arrange numbers ascending (a) or descending (d)?");
        question = scanner1.nextLine();
        switch (question) {
            case "a": {
                result = ascending(array);
                System.out.println("Ascending is ");
                break;
            }
            case "d": {
                result = descending(array);
                System.out.println("Descending is ");
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("  " + result[i]);
        }
    }

    public static int[] ascending(int[] numbers) {
        for (int i = 0; i <= 8; i++) {
            for (int k = 0; k < 9; k++) {
                if (numbers[k] > numbers[k + 1]) {
                    int swap = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = swap;
                }
            }
        }
        return numbers;
    }

    public static int[] descending(int[] numbers) {
        for (int i = 0; i <= 8; i++) {
            for (int k = 0; k < 9; k++) {
                if (numbers[k] < numbers[k + 1]) {
                    int swap = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = swap;
                }
            }
        }
        return numbers;
    }
}

