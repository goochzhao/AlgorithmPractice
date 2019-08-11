package com.example.myapplication.arrays;

import android.util.SparseArray;
import android.util.SparseIntArray;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] numFromTarget = findNumFromTarget(new int[]{1, 2, 4}, 3);
        if (numFromTarget != null) {
            for (int i : numFromTarget) {
                System.out.println(i);
            }
        }
    }

    private static int[] findNumFromTarget(int[] sums, int target) {
        if (sums.length <= 0) {
            return null;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int length = sums.length;
        for (int i = 0; i < length; i++) {
            int value = target - sums[i];
            if (hashMap.containsKey(sums[i])) {
                return new int[]{i, hashMap.get(sums[i])};
            }
            hashMap.put(value, i);
        }
        return null;
    }
}
