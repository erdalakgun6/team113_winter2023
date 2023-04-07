package day23_Araba;

public class C01_araba {

    int yil;
    String marka="Marka belirtilmemis";
    String model="Model belirtilmemis";
    boolean hasarliMi;
    int fiyat;

    @Override
    public String toString() {
        return "C01_araba{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    public C01_araba(int yil,String marka, boolean hasarliMi, int fiyat){
        /*
             Eger parametre ismi instance variable ismi ile AYNI DEGILSE
            bir alttdaki constructor'da oldugu gibi
            direk atama yapabiliriz

            Ancak genelde projenin daha anlasilir olmasi
            ve dogru variable'in kullanilmasi icin
            constructor'daki parametre isimleri, instance variable'lar ile ayni secilir

            Bu durumda Java'ya ayni isimdeki iki variable'dan
            hangisinin bu class'daki instance variable oldugunu belirtmemiz gerekir.

            bunun icin Java syntax olarak this. yazilmasini istemistir.

            this. yazmazsak Java en kisa sekilde ulasabilecegi variable'i bulur
         */


        this.yil=yil;
        this.marka=marka;
        this.model=model;
        this.hasarliMi=hasarliMi;
        this.fiyat=fiyat;



    }
    public C01_araba(int fyt, String mrk){
        fiyat=fyt;
        marka=mrk;
    }
    public C01_araba(){

    }


    public void yakitTuketimi(String yakitTuru){
        switch (yakitTuru){
            case "Benzin" :
                System.out.println("benzinli araclar icin yakit tuketimi: 6 l/100 km");
                break;
            case "dizel" :
                System.out.println("Dizel araclar icin yakit tuketimi: 5 l/100 km");
                break;
            case "Elektrik" :
                System.out.println("Elektrikli araclar icin yakit tuketimi: 5 kW/100 km");
                break;
            default:
                System.out.println("gecersiz yakit turu");
        }
    }

}
