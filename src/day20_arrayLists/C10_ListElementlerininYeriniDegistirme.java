package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_ListElementlerininYeriniDegistirme {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);

        // 2. indexteki element ile 5. indexteki elementin yerini degistrin

        System.out.println(sayilar); // [3, 5, 1, 4, 3, 7, 10]

        // once bir tanesini temp variable'a atayalım

        int temp = sayilar.get(2);

        // 2. indexe 5. indexdeki degeri atayalim

        sayilar.set(2,sayilar.get(5));

        // 5. indexe tempdeki degeri atayalım

        sayilar.set(5,temp);
        System.out.println(sayilar);

        // odev : verilen bir listede, istenen 2 index'deki elementlerin yerini degistirip
        //        yeni listeyi bize donduren bir method olusturun

    }
}
