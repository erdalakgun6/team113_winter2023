package day29_inheritance;

public class C02_encapsulationKullanimi {
    public static void main(String[] args) {

        C01 obj = new C01();

        obj.isim="Erdal"; // write
        System.out.println(obj.isim); // read

        obj.setSayi(40); // write
        System.out.println(obj.getSayi()); // 40 read


        /*
        bir class uyesinin public olmasi ile private yapilip, getter ve
        setter method'larinin olusturulmaz islevsel acidan ayni sonucu olusturur

        bazi developerlar set ve get yetkileriniin kullanilidigini
        vurglumak icin 2.yontemi tercih ederler.
         */

    }
}
