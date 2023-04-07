package day38_exception_garbageCollector;

import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {

        /*
        javada Colections konusunda ogrenecegimiz Set gibi bazi yapilar index desteklemez,

        Bu durumunda index olmadigindan elementleri yazdirmak istersek
        fo-each loop kullanabiliriz
        Ama elementler arasinda dolasmak, belirli sartlari saglayanlari
        update etmek isterseniz, for-each loop ile yapamazsiniz

        hatta Lİst'de istenmeyen elementleri silmek istegimizde
        her sildigimiz element uzunlugu degistirdigi icin
        kodlar saglikli calismaz

        bu sorunlari cözmek icin Java Iterator
         */
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(7);

        // cift olan sayilari silin
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)%2==0){
                sayilar.remove(i);
            }
        }
        System.out.println(sayilar);
    }
}
