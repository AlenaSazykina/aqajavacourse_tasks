package org.example.massive;

import java.util.Arrays;

public class Task11{
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] result = add(arr, 9, 3);
    System.out.println(Arrays.toString(result));
    }
    public static int[] add(int[] arr, int x, int pos) {
    int[] newArr = new int[arr.length + 1];
    System.arraycopy(arr, 0, newArr, 0, pos);
    newArr[pos] = x;
    System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);

    return newArr;
    }
}
