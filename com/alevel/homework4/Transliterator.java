package com.alevel.homework4;

import java.util.Arrays;
import java.util.Scanner;


public class Transliterator {
    public static void main(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, entered cyrillic text ");
        text = scanner.nextLine();
        char[] cyrillic = text.toCharArray();
        String[] latinText = transliterator(cyrillic);
        for (int i = 0; i < 30; i++) {
            System.out.print(latinText[i]);
        }
    }

    public static String[] transliterator(char[] letters) {
        String[] latin = new String[30];
        for (int i = 0; i < 30; i++) {
            switch (letters[i]) {
                case 'а':
                    latin[i] = "a";
                    break;
                case 'б':
                    latin[i] = "b";
                    break;
                case 'в':
                    latin[i] = "v";
                    break;
                case 'д':
                    latin[i] = "d";
                    break;
                case 'е':
                    latin[i] = "e";
                case 'ё':
                    latin[i] = "yo";
                    break;
                case 'ж':
                    latin[i] = "zh";
                    break;
                case 'з':
                    latin[i] = "z";
                    break;
                case 'и':
                    latin[i] = "i";
                    break;
                case 'й':
                    latin[i] = "y";
                    break;
                case 'к':
                    latin[i] = "k";
                    break;
                case 'л':
                    latin[i] = "l";
                    break;
                case 'м':
                    latin[i] = "m";
                    break;
                case 'н':
                    latin[i] = "n";
                    break;
                case 'о':
                    latin[i] = "o";
                    break;
                case 'п':
                    latin[i] = "p";
                    break;
                case 'р':
                    latin[i] = "r";
                    break;
                case 'с':
                    latin[i] = "s";
                    break;
                case 'т':
                    latin[i] = "t";
                    break;
                case 'у':
                    latin[i] = "u";
                    break;
                case 'ф':
                    latin[i] = "f";
                    break;
                case 'х':
                    latin[i] = "kh";

                    break;
                case 'ц':
                    latin[i] = "ts";
                    break;
                case 'ч':
                    latin[i] = "ch";
                    break;
                case 'ш':
                    latin[i] = "sh";
                    break;
                case 'щ':
                    latin[i] = "sch";
                    break;
                case 'ъ':
                    latin[i] = "'";
                    break;
                case 'ы':
                    latin[i] = "y";
                    break;
                case 'ь':
                    latin[i] = "'";
                    break;
                case 'э':
                    latin[i] = "e";
                    break;
                case 'ю':
                    latin[i] = "yu";
                    break;
                case 'я':
                    latin[i] = "ya";
                    break;
                case ' ':
                    latin[i] = " ";
                    break;
                case ',':
                    latin[i] = ",";
                    break;
                case '.':
                    latin[i] = ".";
                    break;
                case '?':
                    latin[i] = "?";
                    break;
                case '!':
                    latin[i] = "!";
                    break;
                case ':':
                    latin[i] = ":";
                    break;
            }
        }
        return latin;
    }
}
