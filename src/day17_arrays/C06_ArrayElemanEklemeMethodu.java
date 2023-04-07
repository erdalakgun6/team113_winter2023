package day17_arrays;

import java.util.Arrays;

public class C06_ArrayElemanEklemeMethodu {
    public static void main(String[] args) {

        // verilen bir array'e istenen bir elementi ekleyip
        // yeni halini bize donduren bir method olusturun

        int[] arr = {2,4,7,8};

        // arr'ye method'u kullanarak 5 ekleyin
        arr= arreyeElementEkle(arr,5); // [2, 4, 7, 8, 5]
        arr= arreyeElementEkle(arr,3); // [2, 4, 7, 8, 5, 3]
        arr= arreyeElementEkle(arr,19); // [2, 4, 7, 8, 5, 3, 19]

        System.out.println(Arrays.toString(arr));

    }

    public static int[] arreyeElementEkle(int[] arr, int eklenecekElement){
        int[] yeniArr= new int[arr.length+1]; //[0,0,0,0]

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        } // [2,4,7,8,0]
        yeniArr[yeniArr.length-1]=eklenecekElement;

                return yeniArr;
    }
}
