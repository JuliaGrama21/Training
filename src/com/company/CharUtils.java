package com.company;

import java.util.HashMap;
import java.util.Map;

public class CharUtils {

    public static void main(String[] args) {
        String text = "програмування";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            Integer in = map.computeIfAbsent(c, number -> 0);
            map.put(c, in + 1);
        }

        map.forEach((key, value) -> System.out.println(key + " - " + value));

//        char symbols[] = new char[text.length()];
//        for (int i = 0; i < text.length() ; i++) {
//            if (!isCharInArray(symbols, text.charAt(i))){
//                symbols[i] = text.charAt(i);
//            }
//        }
//        int counters[] = new int[symbols.length];
//        for (int i = 0; i < symbols.length ; i++) {
//            counters[i] = getCountOfSymbols(text, symbols[i]);
//        }
//        for (int i = 0; i < symbols.length ; i++) {
//            if (symbols[i] != '\0') {
//                System.out.println(symbols[i] + " - " + counters[i]);
//            }
//        }
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
