package org.example;
/*
Написать функцию, возвращающую разницу между самым
большим и самым ма- леньким элементами переданного
не пустого массива.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {2,5,9,4,3,3};
        System.out.println(findDifference(arr));
    }
    public static int findDifference(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        return max - min;
    }
}
