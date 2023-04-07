package day31_inharitance;

public class FPersonel {
    String isim = "personel isim belirtilmemis";
    String unvan = "personel unvan belirtilmemis";
    boolean izindemi;


    public void standartMaas(){

        System.out.println("Personel asgari ucreti : "+8500 );
    }

    public void ozelSigorta(){
        System.out.println("Personelden katki payi alinarak ozel sigorta yapilir");

    }

}
