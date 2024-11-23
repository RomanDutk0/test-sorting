package com.epam.rd.autotasks;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sorting {
    public void sort(int[] array) {
        if (array == null)
            throw new IllegalArgumentException();

        if(array.length == 0)
            return;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
}
