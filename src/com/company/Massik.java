package com.company;

public class Massik {

    public static void main(String[] args) {

        int s = 0;
        int d = 0;
        int k = 0;

        int mas[] = {1, 2, 5, 0, -4, -8, 12, 45, 3};
        for (int i = 0; i <mas.length ; i++) {
            if (mas[i] > 0){
                s++;
            }
            if (mas[i] < 0){
                d++;
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
