package org.example;

/*
Написать функцию, возвращающую истину,
если в переданном массиве есть два соседних элемента,
с нулевым значением.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = {2,5,0,0,3,3};
        System.out.println(hasZeroNeighbors(arr));
    }

    public static boolean hasZeroNeighbors(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0){
                return true;
            }
        }
        return false;
    }
}
