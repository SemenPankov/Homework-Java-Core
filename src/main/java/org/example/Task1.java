package org.example;

import java.util.Arrays;

/*
Написать метод,
возвращающий количество чётных элементов массива.
countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {2,5,9,4,3,3};
        System.out.println(countEvens(arr));
    }
    public static int countEvens(int[] arr){
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
