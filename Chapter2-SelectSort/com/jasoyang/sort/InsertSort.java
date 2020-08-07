package com.jasoyang.sort;

public class InsertSort implements ISort {
    public void Sort(int data[]) {
        for (int j = 1; j < data.length; j++) {
            int key = data[j];
            int i = j - 1;
            while (i >= 0 && data[i] > key) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
    }
}
