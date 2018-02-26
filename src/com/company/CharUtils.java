package com.company;

import java.util.HashSet;
import java.util.Set;

public class CharUtils {

    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        set.add('1');
        String text = "прогрhjkl/.,,,,myuiамування";
        char symbols[] = new char[text.length()];
        for (int i = 0; i < text.length() ; i++) {
            if (!isCharInArray(symbols, text.charAt(i))){
                symbols[i] = text.charAt(i);
            }
        }
        int counters[] = new int[symbols.length];
        for (int i = 0; i < symbols.length ; i++) {
            counters[i] = getCountOfSymbols(text, symbols[i]);
        }
        for (int i = 0; i < symbols.length ; i++) {
            if (symbols[i] != '\0') {
                System.out.println(symbols[i] + " - " + counters[i]);
            }
        }
    }

    private static boolean isCharInArray(char[] mas, char symbol){
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]  == symbol){
                return  true;
            }

        } return false;
    }

    private static int getCountOfSymbols(String text, char symbol){
        int k = 0;
        for (int i = 0; i < text.length() ; i++) {
            if (text.charAt(i) == symbol){
                k++;
            }
        } return k;
    }
}
