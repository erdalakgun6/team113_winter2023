package day17_arrays;

import java.util.Arrays;

public class C01_MethodIleElementleriArttirma {
    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr= {3,4,5,6}; // [6, 7, 8, 9]

        arr = arrayElementleriniArtir(arr, 3);

        System.out.println(Arrays.toString(arr));


    }
    public static int[]arrayElementleriniArtir(int[] ilkarr,int artis){

        for (int i = 0; i < ilkarr.length ; i++) {

            ilkarr[i] += artis;

        }
        return ilkarr;

    }

}
