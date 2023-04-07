package day02_dataTurleri_Scanner;

public class C02_DataTurleri {

    public static void main(String[] args) {

        char ilkHarf='8'; // Tek tirnak icinde tek karakter (harf, sayi, ozel karakterler icerebilir.)
        byte ogrYasi1=15; // en dogru kullanim bu olur, hafiza kullanimini optimize etmek icin bu yeterlidir.
        short ogrYasi2=16;
        int ogrYasi3=14;
        long ogrYasi=15;

        double sayi1=3.1234567890123456789;
        System.out.println(sayi1); // 3.1234567890123457
        // Double virgulden sonra 16 hane yazdirir, ama cok kucuk sayilara indiği icin
        // ondalikli kismin sonun hatalar olabilir.
        // 15 / 3 = 4.9999999999999  5.0 5.0000000000000001

        float sayi2 = 45.453334578465354648f;
        // float sayi tanimladiğimizda double'dan farkli oldugunu belirtmek icin
        // sonuna f veya F yazmak zorundayiz
        System.out.println(sayi2); // 45.543335

        // Biz dersler boyunca hafiza onemli olmadigi icin
        // tamsayılar icin int, ondalikli sayilar icin de double kullaniriz.

    }
}
