package day17_arrays;

import java.util.Arrays;

public class C08_sort_binarySearch {
    public static void main(String[] args) {
         // Verilen bir arrayi natural ordera gore siralamak icin
         // Arrays.sort() kullanilir

        int[] arr1={3,9,6,1,7}; // [1, 3, 6, 7, 9]
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));
        String[] arr2 = {"Hasan","Hüseyin","Mehmet","Mesut","Mercan","Ali"}; // [Ali, Hasan, Hüseyin, Mehmet, Mercan, Mesut]
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // sort yapildiktan sonra
        // arrayde bir elementin var oldugunu kontrol etmek icin

        System.out.println(Arrays.binarySearch(arr2, "ali"));

    }
}
