package day26_localTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime saat1 = LocalTime.of(20,15); // 20:15
        System.out.println(saat1);

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 20:54:29.115043400

        // Localtime objesi olan saat variable i canli bir saat degildir
        // olusturuldugu andaki local timei sistemden alip kaydettigimiz sabit bir degerdir
        // kodun ilerleyen kisminda ne kadar sure gectigini gormek icin
        // saati yeniden almamiz gerekirse, yeni bir LocalTime objesi daha olusturmaliyiz

        System.out.println(saat.getHour()); // 18
        // get method'lari localTime objesinin saat, dakika, saniye ve nano degerlerini bize getirir

        System.out.println(saat.plusHours(2).plusMinutes(10));

        System.out.println(saat.minusMinutes(10).minusSeconds(10)); // 14:41:35.672057200

        System.out.println(saat.withSecond(10).withNano(20));

        System.out.println(saat.compareTo(saat1)); // ayni ise 0 doner

        System.out.println(saat.isAfter(saat1)); // true
        System.out.println(saat.isBefore(saat1)); // false

        System.out.println(saat.toSecondOfDay()); // 69077

    }

}
