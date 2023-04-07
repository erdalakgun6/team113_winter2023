package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {

        // verilen bir array de istenen elemanın olup olmadigini bulur

        int [] arr ={4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr, 5)); // -2



        // Array de binarySearch() un duzgun calismasi icin
        // oncelikle sort() calistirilmalidir

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,5)); // 4


    }
}
