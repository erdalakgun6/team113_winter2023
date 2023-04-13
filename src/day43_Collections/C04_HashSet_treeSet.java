package day43_Collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_HashSet_treeSet {
    /*
    bir hashset ve treeSet olusturalim
    bir loop ile iclerinde 150000 eleman ekleyelim
    islem surelerini kiyaslayalim
     */
    public static void main(String[] args) {

        Random rnd= new Random();
        int sayi;
        Set<Integer> hashSet =new HashSet<>();
        Set<Integer> treeSet= new TreeSet<>();
        Long hashStart=System.currentTimeMillis();

        for (int i = 0; i < 150000; i++) {
            sayi= rnd.nextInt(1250000);

            hashSet.add(sayi);
        }
        Long hashFinish=System.currentTimeMillis();

        Long treeStart=System.currentTimeMillis();
        for (int i = 0; i < 150000; i++) {
            sayi= rnd.nextInt(1250000);
            treeSet.add(sayi);
        }
        Long treeFinish=System.currentTimeMillis();

        System.out.println("Hash Islem Suresi : "+ (hashFinish-hashStart)); // Hash Islem Suresi : 47
        System.out.println("Tree Islem suresi : "+ (treeFinish-treeStart)); // Tree Islem suresi : 109


    }
}
