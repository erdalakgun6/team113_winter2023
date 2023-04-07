package day38_exception_garbageCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_ListIterator {
    public static void main(String[] args) {
        List sayilar = new ArrayList<>();
        sayilar.add(61);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(72);

        // tum elementleri index kullanmadan 3 artirin


        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()){

            Integer sayi = (Integer) lit.next();

            lit.set(sayi+3);

        }
        System.out.println(sayilar);
    }
}
