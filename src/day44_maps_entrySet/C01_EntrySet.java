package day44_maps_entrySet;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C01_EntrySet {
    public static void main(String[] args) {

        // istenen siniftaki ogrencilerin no, isim, soyisim, bolumlerini bir liste olarak yazdirin
        /*
        Daha önce ki yontemlerimizle yapacak olsak
        1- mao'deki tum keyleri okulMap.keySet() methodu ile elde edip bir Sete kaydederiz
        [101,102,103,104,105,106]
        2- for-each loop ile her bir keye ait valueyu aliriz "ALi-Cem-10-H-MF"
           - value.split() ile valueyu bir arraye cevirip kaydederiz [Ali, Cem, 10, H, MF]
           - bu array de sinifi kontrol edip eger istenen sinifa esit ise
           key ve value arrayinden istenen bilgileri yazdirim

        Java key ve value degerleri birlikte kullanilabilsin ve gerekirse
        value update edilebilsin diye Entry interfaceini olusturmustur.
        */

        Map<Integer, String> okulMap = MapMethodDepo.ornekMapOlustur();

        System.out.println(okulMap);
        /*
        {101=Ali-Cem-10-H-MF,
        102=Veli-Can-10-M-TM,
        103=Ali-Can-11-M-Soz,
        104=Ayse-Cem-11-H-TM,
        105=Ayse-Han-10-H-MF,
        106=Veli-Han-10-H-MF}
         */

        MapMethodDepo.sinifaGoreListeYazdir(okulMap,11);


    }


}
