package edu.miu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       var arrayFlattener = new ArrayFlattener();
       var arrayReversor = new ArrayReversor(arrayFlattener);
       var reversedArray = arrayReversor.reverse(new int[][] {{1, 2, 3}, {4, 5, 6}});
    }
}