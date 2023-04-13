package day42_Queue;

import java.util.Set;
import java.util.TreeSet;

public class C03_Set {
    public static void main(String[] args) {
        // Set unique bakiyor
        // Set index yapisini desteklemez

        Set<String> ogrenciler = new TreeSet<>();
        ogrenciler.add("Emre");
        ogrenciler.add("Kerem");
        ogrenciler.add("Duygu");
        ogrenciler.add("Burcu");

        System.out.println(ogrenciler); // [Burcu, Duygu, Emre, Kerem] doğal sıralı duzenler
        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler); // [Ahmet, Burcu, Duygu, Emre, Kerem]
        ogrenciler.add("Kerem");
        System.out.println(ogrenciler); // [Ahmet, Burcu, Duygu, Emre, Kerem] eski Keremi siler yeni Keremi yazar Unique oldugu icin




    }
}
