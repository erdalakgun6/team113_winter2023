package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] isimler = {"Nurefsan","Berke","Mustafa"};
        int[] sayilar = {3,4,5,6,7,8,9,3,5,6,4};
        char[] karakterler = {'e','5',','};

        // Array non-primitive data turlerindendir
        // Eger array'i liste seklinde olusturmayip
        // new keyword kullanirsak
        // UZUNLUGUNU yazmak ZORUNDAYIZ

        String[] arr= new String[5];
        // bir Array tanimlanan uzunluktan daha fazla veya az eleman alamaz

        // Bir array i yazdirmak istersek
        // Array ler direk yazdirilamaz
        System.out.println(isimler); // [Ljava.lang.String;@48140564

        System.out.println(Arrays.toString(sayilar)); // [3, 4, 5, 6, 7, 8, 9, 3, 5, 6, 4]

        System.out.println(Arrays.toString(arr)); // [null, null, null, null, null]

        int [] a = new int[7];
        System.out.println(Arrays.toString(a));
        // array deki elementlere nasil ulasiriz ? index ile

        a[0] = 4; // [4, 0, 0, 0, 0, 0, 0]
        a[3] = 7; // [4, 0, 0, 7, 0, 0, 0]
        // a[7] = 8; // ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(a));

        // Sayilar arrayinin 4. indexindeki elementi yazdirin
        System.out.println(sayilar[4]); // 7

        // isimler arrayinin 1.indexindeki ismi yazdirin
        System.out.println(isimler[1]); // Berke



    }
}
