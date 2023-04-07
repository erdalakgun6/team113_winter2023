package day32_inharitance_dataTypeKullanimi;

public class CAvciKuslar extends BKuslar {

    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidirler";
    String gaga = "sivri gagali";

    public static void main(String[] args) {

        CAvciKuslar kartalAvci = new CAvciKuslar();
        System.out.println(kartalAvci.hareket); //
        System.out.println(kartalAvci.beslenme); //
        System.out.println(kartalAvci.pence); //
        System.out.println(kartalAvci.gaga); //

        System.out.println(kartalAvci.kanat);
        System.out.println(kartalAvci.solunum);
        System.out.println(kartalAvci.cogalma);

        System.out.println(kartalAvci.omur);

        BKuslar kartalKus= new CAvciKuslar();
        System.out.println(kartalKus.hareket); //
        System.out.println(kartalKus.beslenme); //
        //
        // System.out.println(kartalKus.pence); //
        System.out.println(kartalKus.gaga); //

        System.out.println(kartalKus.kanat);
        System.out.println(kartalKus.solunum);
        System.out.println(kartalKus.cogalma);

        System.out.println(kartalKus.omur);

        AHayvanlar kartalHayvan= new CAvciKuslar();

        System.out.println(kartalHayvan.hareket);// A hareket ederler
        System.out.println(kartalHayvan.beslenme);// A beslenirler
        //System.out.println(kartalHayvan.pence);// CTE
        //System.out.println(kartalHayvan.gaga);// CTE

        //System.out.println(kartalHayvan.kanat);// CTE
        System.out.println(kartalHayvan.solunum);// A nefes alirlar
        System.out.println(kartalHayvan.cogalma);// A cogalirlar

        System.out.println(kartalHayvan.omur); // A yasar ve olurler


        // Variable olarak ozellikleri olusturursak
        BKuslar kuslar= new BKuslar();
        BKuslar avciKuslar= new CAvciKuslar();
        // bu iki obje arasinda bir fark goremeyiz


        /*
        Eger bir obje olusturulurken
        Data turu ve constructor ayni ise
        aradiginiz oxellikler icin direk o classa gider
        ve ozellikler arariz

        Eger data turu ve constructor farkli ise
        variable ve methodlar farkli davranirlar

        variablelar
        - once data turunun oldugu classa bakar
        o variablei bulursa degerini yazdirir
        bulamazsa data turunun oldugu classa bakar
        orada bulursa degerini yazdirir
        orada da bulamazsa CTE verir

        Ozetle bir ozelligi variable olarak olusturursaniz
        data turu olan class ve parentş

         */


    }

}
