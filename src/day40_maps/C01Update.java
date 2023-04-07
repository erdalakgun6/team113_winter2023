package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C01Update {
    public static void main(String[] args) {
        // verilen map de sube ismi M olanlarin subesini N yapin

        Map<Integer, String>okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        // [Ali-Cem-10-H-MF,
        // Veli-Can-10-M-TM,
        // Ali-Can-11-M-Soz,
        // Ayse-Cem-11-H-TM,
        // Ayse-Han-10-H-MF,
        // Veli-Han-10-H-MF,
        // Kerem-Umut-12-K-MF]

        System.out.println(okulMap.get(101));
        okulMap.put(101, "Ali-Cem-10-M-MF");
        okulMap.put(102,"Kemal-Can-11-M-Soz");
        System.out.println(okulMap);




        // 6- return edilen yeni halini eski okulMape assign edelim
        okulMap=MapMethodDepo.topluSubedegistirme(okulMap,"M","N");
        System.out.println(okulMap);
    }
}
