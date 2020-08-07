package com.jasoyang.sort;

public class SelectSort implements ISort {

    public void Sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = nums[i];
            int pos = i;


            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    pos = j;
                }
            }
            nums[pos] = nums[i];
            nums[i] = min;
        }
        return;
    }

}