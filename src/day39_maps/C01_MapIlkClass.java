package day39_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapIlkClass {
    public static void main(String[] args) {
        Map<Integer,String> okulMaps= new HashMap<>();

        /*
        bir map olusturulurken ve element eklerken
        bilgilere sonradan erisimin mumkun
        olabilmesi icin tum elementlerin ayni bilgileri barindirdigindan
        ve ayni siralama ile element'e eklendiginden emin olmaliyiz
         */
        okulMaps.put(101, "Ali, Cem, 10, H, MF");
        okulMaps.put(102, "Veli, Can, 10, M, TM");
        okulMaps.put(103, "Ali, Can, 11, M, Soz");
        okulMaps.put(104, "Ayse, Cem, 11, H, TM");
        okulMaps.put(105, "Ayse, Han, 10, H, MF");
        okulMaps.put(106, "Veli, Han, 10, H, MF");

        System.out.println(okulMaps);

        // Map'de kac element var?
        System.out.println(okulMaps.size()); // 6

        // Tum Key'leri yazdiralim
        System.out.println(okulMaps.keySet()); // [101, 102, 103, 104, 105, 106]

        // tum value'lari yazdiralim
        System.out.println(okulMaps.values());
        // [Ali, Cem, 10, H, MF, Veli, Can, 10, M, TM, Ali, Can, 11, M, Soz, Ayse, Cem, 11, H, TM, Ayse, Han, 10, H, MF, Veli, Han, 10, H, MF]

        // value collection'i icinde kac element vardir?
        System.out.println(okulMaps.values().size()); // 6


    }
}
