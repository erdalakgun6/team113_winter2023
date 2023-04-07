package day39_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {
    public static Map<Integer, String> ornekMapOlustur(){
        Map<Integer,String> okulMaps= new HashMap<>();

        okulMaps.put(101, "Ali-Cem-10-H-MF");
        okulMaps.put(102, "Veli-Can-10-M-TM");
        okulMaps.put(103, "Ali-Can-11-M-Soz");
        okulMaps.put(104, "Ayse-Cem-11-H-TM");
        okulMaps.put(105, "Ayse-Han-10-H-MF");
        okulMaps.put(106, "Veli-Han-10-H-MF");

        return okulMaps;
    }

    public static void subeOgrenciListesiYazdir(Map<Integer, String> okulMap, String istenenSube) {
        // 1- valuelari ayri bir collection olarak kaydedelim
        Collection<String> valueCollection = okulMap.values();
        // 2- her bir value u split ile bir arraye donusturelim
        System.out.println("==========Sube Listesi===========");
        System.out.println("Sira Sinif Isim Soyisim");
        int siraNo=1;
        for (String eachValue :valueCollection
                ) {
            // Ali-Cem-10-H-MF

            String[] valueArr = eachValue.split("-"); // [Ali-Cem-10-H-MF]
            // 3- arrayden subeyi kontrol edip
            //    eger istenen sube ise ogrencinin sinif isim ve soyisimini yazdiralim

            if (valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(siraNo+ " - "+valueArr[2] +", "+valueArr[0]+", "+valueArr[1]);
                siraNo++;
            }
        }




    }

    public static Map<Integer, String> topluSubedegistirme(Map<Integer, String> okulMap, String eskiSube, String yeniSube) {

        // 1- once keyler bir set olarak kaydedelim
        Set<Integer> okulKeySeti = okulMap.keySet();

        for (Integer eachKey : okulKeySeti
                ) {
            // 2- her bir keye ait valueyu split ile arraye donusturelim
            String[] valueArr = okulMap.get(eachKey).split("-");

            // 3- sube bilgisi eskiSube olanlari yeniSube yapalim
            if (valueArr[3].equalsIgnoreCase(eskiSube)){
                valueArr[3] = yeniSube ; // [Ali, Cem, 10, H, MF]
            }

            // 4- arraydeki bilgileri birleştirerek, yeniden mape ekleyelim
            // Ali-Cem-10-H-Mf

            String yeniValue="";
            for (int i = 0; i < valueArr.length-1 ; i++) {
                yeniValue+= valueArr[i] + "-";
            }

            yeniValue+= valueArr[valueArr.length-1];
            okulMap.put(eachKey,yeniValue);

        }
        // 5- okulMapinin son halini return edelim

        return okulMap ;
    }

    public static Map<Integer, String> yilSonuSiniflariDegistir(Map<Integer, String> okulMap) {

        // 1- keyleri bir Set olarak kaydedelim
        Set<Integer> keySeti = okulMap.keySet();// [101,102,103,104,105,106]
        // 2- Set deki her bir keye ait valueyu for-each loop ile ele alalim
        for (Integer eachKey : keySeti
             ) {

            // 3- her keye ait valueyu split() ile ayirip, array olarak kaydedelim
            String[] valueArr = okulMap.get(eachKey).split("-");
            // 4- array olarak kaydettigimiz bilgilerde istenen update i yapalim

            if (valueArr[2].equalsIgnoreCase("12")) {
                valueArr[2] = "Mezun";
            } else {
                int sinif = Integer.parseInt(valueArr[2]);
                sinif++;

                valueArr[2] = sinif + "";
            }


            // 5- array in yeni halini String olarak birlestirip yeniValue elde edelim


            String yeniValue = "";


            for (int i = 0; i < valueArr.length - 1; i++) {

                yeniValue += valueArr[i] + "-";
            }

            yeniValue += valueArr[valueArr.length - 1];
            // 6- her bir key ve yeniValueyu mape ekleyerek mapi update edelim
            okulMap.put(eachKey, yeniValue);

        }
        // 7- mapin yeni halini return edelim
        return okulMap;


    }
}
