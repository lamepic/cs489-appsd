package edu.miu;

import java.util.ArrayList;

public class ArrayFlattener implements ArrayFlattenerService {

    public int[] flatten(int[][] arr){
        if(arr == null) return null;
        var result = new ArrayList<Integer>();

        for (int[] curr : arr) {
            if (curr.getClass().isArray()) {
                for (int item : curr) {
                    result.add(item);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
