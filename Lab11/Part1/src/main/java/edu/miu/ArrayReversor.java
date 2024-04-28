package edu.miu;

import java.util.Arrays;

public class ArrayReversor {
    private final ArrayFlattenerService arrayFlattenService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenService) {
        this.arrayFlattenService = arrayFlattenService;
    }

    public int[] reverse(int[][] arr){
        if (arr == null) return null;

        int[] flatten = this.arrayFlattenService.flatten(arr);
        int[] result = new int[flatten.length];
        int index = 0;
        for(int i=flatten.length-1; i>=0; i--){
            result[index++] = flatten[i];
        }

        return result;
    }
}
