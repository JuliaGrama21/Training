package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int array[] = {2, 8, 6, 3, 1, 0, 4};
        System.out.println(Arrays.toString(sort(array)));
    }

    private static int[] sort(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    k = array[j];
                    array[j] = array[i];
                    array[i] = k;
                }
            }

        }
        return array;
    }

}
