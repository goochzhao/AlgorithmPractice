package com.example.myapplication.arrays;

import java.util.HashMap;

public class FindMaxLengthStr {

    public static void main(String[] args) {
        int maxLength = findMaxLength("123425682902");
        System.out.println(maxLength);
    }

    /**
     * 无重复字符的最长子串
     *
     * @param s
     * @return
     */
    private static int findMaxLength(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int maxlength = 0;
        int n = s.length();
        for (int i = 0, j = 0; i < n; i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                int a = hashMap.get(s.charAt(i));
                j = Math.max(a, j);
            }
            maxlength = Math.max(maxlength, i - j);
            hashMap.put(s.charAt(i), i);
        }
        return maxlength;
    }
}
