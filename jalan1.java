package com.stuffvish.hellospring;

import java.util.*;

public class jalan1 {

    public static void main(String[] args) {
        int[] arr = {-4, 1, 3, -2, -1};
        int[] result = findZeroSum(arr);
        if (result == null) {
            System.out.println("No Elements found");
        } else {
            System.out.println(Arrays.toString(result));
        }
    }

    public static int[] findZeroSum(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                return Arrays.copyOfRange(arr, 0, i + 1);
            } else if (map.containsKey(sum)) {
                return Arrays.copyOfRange(arr, map.get(sum) + 1, i + 1);
            }
            map.put(sum, i);
        }
        return null;
    }
}
