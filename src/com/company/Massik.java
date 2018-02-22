package com.company;

public class Massik {

    public static void main(String[] args) {

        int s = 0;
        int d = 1;
        int k = 0;

        int mas[] = {1, 2, 5, 0, -4, -8, 12, 45, 3};
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0){
                s = s + mas[i];
            }
            if (mas[i] < 0){
                d = d * mas[i];
            }
            if (mas[i] == 0){
                k++;
            }

        }
        System.out.println(s);
        System.out.println(d);
        System.out.println(k);
    }
}
