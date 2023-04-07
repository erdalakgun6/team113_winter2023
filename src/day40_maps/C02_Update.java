package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C02_Update {



        // verilen okul mapinde
        // ogrencilerin siniflarini bir artirin
        // eger 12.sinif varsa, sinif bilgisi olarak mezun yazin

        // eger update varsa, key ve value birlikte dusunulmelidir
        // ayni key ile valueyu mape ekledigimizde
        // key unique olacagi icin eski valueyu update edip yeni value degerini kaydeder

        public static void main (String[] args){

            Map<Integer, String> okulMap = MapMethodDepo.ornekMapOlustur();
            System.out.println(okulMap);

            okulMap = MapMethodDepo.yilSonuSiniflariDegistir(okulMap);
            System.out.println(okulMap);

            // denemek icin bir kere daha calistirin
            okulMap = MapMethodDepo.yilSonuSiniflariDegistir(okulMap);
            System.out.println(okulMap);


        }

    }
