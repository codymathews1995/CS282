package swap;

/*
Course:     CS-282
Project:    Module 5 Lab
Name:       Cody Mathews
Date:       4 March 2018
Description: A program takes generic input in order to swap elements within an array
 */
public class Swap {

    public static <T> void swap(T[] a, int i, int j) {
        T temp;

        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        if (i > a.length || j > a.length) {
            throw new IndexOutOfBoundsException();
        }

    }

    public static <T> void printArray(T[] a) {
        int lp;
        System.out.print(a.length + " Elements: ");
        for (lp = 0; lp < a.length; lp++) {
            System.out.print(a[lp] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 6, 8, 10};
        String[] strArray = {"East", "West", "North", "South"};
        Double[] douArray = {1.0, 3.0, 5.0, 7.0, 9.0};
        try {
            printArray(intArray);
            swap(intArray, 1, 2);
        } catch (Exception e) {
            System.err.println("Array out of index");
        }
        printArray(intArray);
        printArray(strArray);
        try {
            swap(strArray, 0, 2);
        } catch (Exception e) {
            System.err.println("Array out of index");
        }
        printArray(strArray);
        printArray(douArray);
        try {
            swap(douArray, 0, 4);
        } catch (Exception e) {
            System.err.println("Array out of index");
        }
        printArray(douArray);

    }
}
